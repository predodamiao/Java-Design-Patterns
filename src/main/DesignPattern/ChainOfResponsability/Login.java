package ChainOfResponsability;

public class Login extends Node {

    public Login (Node node) {
        super(node);
    }

    public Login(){}

    private Boolean verify(User user){
        return (user.getLogin() != null && user.getPassword() != null);
    }

    @Override
    public User handle(User user){
        user.setLogged(false);
        if(this.verify(user)){
            if(this.validate(user.getLogin())) {
                user.setLogged(true);
                if(this.getNextNode() != null){
                    return getNextNode().handle(user);
                }else{
                    return user;
                }
            }
        }else{
            return user;
        }
        return user;
    }
}
