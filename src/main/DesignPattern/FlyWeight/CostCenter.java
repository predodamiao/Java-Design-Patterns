package FlyWeight;

public class CostCenter {

    private String name;
    private String initials;

    public CostCenter (String name, String initials) {
        this.name = name;
        this.initials = initials;
    }

    public String getName () {
        return name;
    }

    public String getInitials () {
        return initials;
    }
}
