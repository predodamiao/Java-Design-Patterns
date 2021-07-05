package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Fleet implements Iterable<IVehicle>{

    private List<IVehicle> vehicles;

    public Fleet(){
        this.vehicles = new ArrayList<IVehicle>();
    };


    public List<IVehicle> getVehicles () {
        return vehicles;
    }

    public Fleet setVehicles (List<IVehicle> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    public void addVehicle(IVehicle... vehicle){
        this.vehicles.addAll(Arrays.asList(vehicle));
    }

    @Override
    public Iterator<IVehicle> iterator () {
        return this.vehicles.iterator();
    }
}
