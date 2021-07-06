package ChainOfResponsability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Node {

    private List<String> allowedUsers = new ArrayList<String>();
    private Node nextNode;

    public Node(){}

    public Node(Node node){
        this.nextNode = node;
    }

    public Node getNextNode () {
        return nextNode;
    }

    public void setAllowedUsers(String... users){
        this.allowedUsers.addAll(Arrays.asList(users));
    }

    Boolean validate (String name){
        return allowedUsers.contains(name);
    }

    protected String getPermission(){
        return this.getClass().getSimpleName();
    }

    public User handle(User user){
        if(validate(user.getLogin())){
            user.addPermission(this.getPermission());
        }
        if(nextNode != null){
            return nextNode.handle(user);
        }else{
            return user;
        }
    }

}
