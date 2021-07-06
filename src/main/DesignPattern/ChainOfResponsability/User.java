package ChainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String login;
    private String password;
    private Boolean logged;
    private List<String> permissions;

    public User () {
        this.permissions = new ArrayList<>();
    }

    public User (String login, String password) {
        this.login = login;
        this.password = password;
        this.permissions = new ArrayList<>();
    }

    public String getLogin () {
        return login;
    }

    public User setLogin (String login) {
        this.login = login;
        return this;
    }

    public String getPassword () {
        return password;
    }

    public User setPassword (String password) {
        this.password = password;
        return this;
    }

    public Boolean isLogged () {
        return logged;
    }

    public void setLogged (Boolean logged) {
        this.logged = logged;
    }

    public void addPermission (String permission) {
        this.permissions.add(permission);
    }

    public List<String> getPermissions () {
        return permissions;
    }

}
