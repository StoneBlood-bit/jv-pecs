package model.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        Truck truckMan = new Truck("Man");
        Truck truckFord = new Truck("Ford");
        Truck truckScania = new Truck("Scania");
        trucks.add(truckMan);
        trucks.add(truckFord);
        trucks.add(truckScania);
        return trucks;
    }
}