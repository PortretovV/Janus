package projectpackages.janus.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration
@EnableJpaRepositories(basePackages = "projectpackages.janus.repository", entityManagerFactoryRef = "configEntityManagerFactory")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = "projectpackages.janus")
public class DataBaseConfig {

    // получение значений из .properties файлов
    @Resource
    private Environment environment;

    // конфигурация EntityManager'а
    @Bean
    public LocalContainerEntityManagerFactoryBean configEntityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
        entityManager.setDataSource(configDataSource());
        entityManager.setPackagesToScan(environment.getRequiredProperty("mysql.entities"));
        entityManager.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManager.setJpaProperties(getHibernateProperties());
        return entityManager;
    }

    // конфигурация DataSource'а
    @Bean
    public DataSource configDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(environment.getRequiredProperty("mysql.url"));
        dataSource.setDriverClassName(environment.getRequiredProperty("mysql.driver"));
        dataSource.setUsername(environment.getRequiredProperty("mysql.username"));
        dataSource.setPassword(environment.getRequiredProperty("mysql.password"));
        return dataSource;
    }

    // конфигурация транзакций
    @Bean
    public PlatformTransactionManager configTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(configEntityManagerFactory().getObject());
        return transactionManager;
    }

    public Properties getHibernateProperties() {
        try {
            Properties properties = new Properties();
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("hibernate.properties");
            properties.load(inputStream);
            return properties;
        }
        catch (IOException e) {
            throw new IllegalArgumentException("Не найден файл hibernate.properties ", e);
        }
    }
}
