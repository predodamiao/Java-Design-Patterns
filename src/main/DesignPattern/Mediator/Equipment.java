package Mediator;

public class Equipment {
    private boolean on;
    private String macAddress;
    private String lastMessage;

    public Equipment (String macAddress) {
        this.macAddress = macAddress;
        this.on = false;
    }

    public boolean isOn () {
        return on;
    }

    public Equipment setOn (boolean on) {
        this.on = on;
        return this;
    }

    public String getMacAddress () {
        return macAddress;
    }

    public Equipment setMacAddress (String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    public String getLastMessage () {
        return lastMessage;
    }

    public Equipment setLastMessage (String lastMessage) {
        this.lastMessage = lastMessage;
        return this;
    }

    public void broadcast(String message){
        this.setLastMessage(message);
    }

    public void connect (Router router){
        router.connect(this);
    }
}
