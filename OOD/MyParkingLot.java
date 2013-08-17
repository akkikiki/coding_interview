// Design a parking lot
// Core objects.
// parking space, entrance, exit, vacancy, floor
// parking space consists of booleand Used, 
// ParkingLot consists of many floors
// Floors consists of some vacancy
// Entrance holds the number of cars in the queue
// Exit also holds the number of cars in the queue

class ParkingLot{
  ParkingSpace[] spaces;
  Entrance ent;
  Exit ex;
}

class ParkingSpace{
  boolean full = false;
  int timeSinceParked = 0;
}

class Entrance{
  Queue<Cars> q;
  
  void setTime(ParkingSpace ps, int time){
    ps.full = true;
    ps.timeSinceParked = time;
  }
}

class Exit{
  Queue<Cars> q;

  int parkingFee(int timeSinceParked){
    if(timeSinceParked <= 24) return 200;
    return 1000;
  }
}
