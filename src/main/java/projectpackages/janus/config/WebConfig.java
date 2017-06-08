package projectpackages.janus.config;

import freemarker.ext.jsp.TaglibFactory;
import freemarker.template.TemplateModelException;
import freemarker.template.utility.XmlEscape;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import java.util.*;

//Конфигурация web-контекста
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "projectpackages.janus")
public class WebConfig extends WebMvcConfigurerAdapter {

    /*Настройки freemarker*/
    @Bean(name = "freemarkerConfig")
    public FreeMarkerConfigurer freemarkerConfig() {
        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
        configurer.setDefaultEncoding("UTF-8");
        configurer.setTemplateLoaderPath("/WEB-INF/view/ftl/");

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("xml_escape", new XmlEscape());
        configurer.setFreemarkerVariables(map);
        return configurer;
    }



    @Bean
    public FreeMarkerViewResolver viewResolver() {
        FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
        viewResolver.setPrefix("/view/ftl/");
        viewResolver.setSuffix(".ftl");
        viewResolver.setCache(false);   //Set to true during production
        viewResolver.setContentType("text/html;charset=UTF-8");
        return viewResolver;
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.ignoreUnknownPathExtensions(false).defaultContentType(MediaType.TEXT_HTML);
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.freeMarker();
    }
    /*Настройки freemarker*/

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }
}
