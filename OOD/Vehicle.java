// multiple levels, eash level has multiple spots
// Types of vehicles are motorcycles, cars, and buses
// motocycle spots, car spots, bus spots
// motorcycle can park in any spots
// car can park in either car spots or bus spots
// bus can park in only bus spots

public enum VehicleSize { Motorcycle, Car, Bus }

public abstract class Vehicle {
  protected ArrayList<ParkingSpot> parkingSpots = new ArrayLIst<ParkingSpot>;
  protected String licensePlate; // general ones...
  protected int spotsNeeded;
  protected VehicleSize size;  

  public int getSpotsNeeded() { return spotsNeeded; }
  public VehicleSize getSize() { return size;}
  public void parkInSpot(ParkingSpot s){ parkingSpots.add(s); }
  public void clearSpots(){}

  // big enough for the vehicle
  // differ according to the vehicle
  public abstract boolean canFitInSpot(ParkingSpot spot);
}

public class Car extends Vehicle {
  public Bus() {
    spotsNeeded = 1;
    size = VehicleSize.Car; // 2
  }

  public boolean canFitInSpot{}
}

public class Motorcycle extends Vehicle {
  public Motorcycle() {
    spotsNeeded = 1;
    size = Vehiclesize.Motorcycle;
  }
}

public class Bus extends Vehicle {
  public Bus() {
    spotsNeeded = 5;
    size = Vehiclesize.Bus;
  }
}
