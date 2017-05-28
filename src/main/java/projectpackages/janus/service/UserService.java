package projectpackages.janus.service;


import projectpackages.janus.entities.User;

// предоставляет Service для регистрации пользователя
public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
