package projectpackages.janus.service;

public interface SecurityService {
    String findLoggedUsername();
    void login(String username, String password);
}
