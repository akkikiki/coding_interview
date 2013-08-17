
public class ParkingLot {
  private Level[] levels; // multiple levels
  private final int NUM_LEVELS = 5;

  public ParkingLot() { }
  
  // parking cars
  public boolean parkVehicle(Vehicle vehicle) {}
}

public class Level {
  private int floor;
  private ParkingSpot[] spots;
  private int availableSpots = 0; //free spots
  private static final int SPOTS_PER_ROW = 10;

  public Level(int floor, int numSpots) { }

  //methods only used within the class should be private
  private boolean parkStartingAtSpot(int num, Vehicle v)
  private int findAvailableSpots(Vehicle v) { }
  public void spotFreed() { availableSpots++; }

  
}
