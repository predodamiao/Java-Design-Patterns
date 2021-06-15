package Singleton;

public class WebService {

    private static WebService instance = new WebService();

    private String ip;
    private Integer port;
    private String protocol;
    private String login;
    private String password;


    private WebService() {};

    public static WebService getInstance() {
        return instance;
    }

    public static void setInstance(WebService instance) {
        WebService.instance = instance;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
