package Builder;

import java.util.regex.Pattern;

public class UserBuilder {

    private User user;

    public UserBuilder(){
        user = new User();
    }

    public User build(){
        if(this.user.getName().equals("")){
            throw new IllegalArgumentException("Invalid name");
        }

        if(this.user.getId().equals(0)){
            throw new IllegalArgumentException("Invalid id");
        }

        if(this.user.getEmail() != null){
            Pattern pattern = Pattern.compile("^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+(.[a-z]+)");
            if(!pattern.matcher(this.user.getEmail()).find())
            throw new IllegalArgumentException("Invalid e-mail");
        }

        if(this.user.getTelephone() != null){
            Pattern pattern = Pattern.compile("^\\([1-9]{2}\\) (?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$");
            if(!pattern.matcher(this.user.getTelephone()).find())
                throw new IllegalArgumentException("Invalid telephone");
        }

        if(this.user.getSite() != null){
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9]?\\.([a-zA-Z]{1,6}|[a-zA-Z0-9-]{1,30}\\.[a-zA-Z]{2,3})$");
            if(!pattern.matcher(this.user.getSite()).find())
                throw new IllegalArgumentException("Invalid site");
        }

        return this.user;
    }

    public UserBuilder setName(String name) {
        this.user.setName(name);
        return this;
    }

    public UserBuilder setId(Integer id) {
        this.user.setId(id);
        return this;
    }

    public UserBuilder setTelephone(String telephone) {
        this.user.setTelephone(telephone);
        return this;
    }

    public UserBuilder setSite(String site) {
        this.user.setSite(site);
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.user.setEmail(email);
        return this;
    }

}
