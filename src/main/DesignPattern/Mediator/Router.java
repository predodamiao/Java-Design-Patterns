package Mediator;

import java.util.ArrayList;
import java.util.List;

public class Router {
    private List<Equipment> connectedEquipments;
    private String name;

    public Router (String name) {
        this.name = name;
        this.connectedEquipments = new ArrayList<>();
    }

    public void connect(Equipment equipment){
        this.connectedEquipments.add(equipment);
    }

    public List<Equipment> getAllConnectedEquipments(){
        return this.connectedEquipments;
    }

    public void broadcast(Equipment equipment, String message){

        connectedEquipments.forEach(e->{
            if(e.isOn() && !e.equals(equipment)){
                e.broadcast(equipment.getMacAddress() + ": " + message);
            }
        });
    }
}
