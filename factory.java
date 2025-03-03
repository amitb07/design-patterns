public class Main {
    public static void main(String[] args) {
        TwoWheelerFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vehicle activa = twoWheelerClient.getVehicle();
        activa.printVehicle();

        FourWheelerFactory fourWheelerFactory = new FourWheelerFactory();
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle nexon = fourWheelerClient.getVehicle();
        nexon.printVehicle();
  }
}

// Library classes
public abstract class Vehicle{
    public abstract void printVehicle();
}

public class TwoWheeler extends Vehicle{
    public void printVehicle(){
        System.out.println("I am a two wheeler");
    }
}

public class FourWheeler extends Vehicle{
    public void printVehicle(){
        System.out.println("I am a four wheeler");
    }
}

// Factory Interface
public abstract interface VehicleFactory{
    public Vehicle createVehicle();
}

//  Concrete Factory for TwoWheeler
public class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}

//  Concrete Factory for FourWheeler
public class FourWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}

// Client class
public class Client {
    private Vehicle pVehicle;
    public Client (VehicleFactory vfactory) {
        pVehicle = vfactory.createVehicle();
    }
    public Vehicle getVehicle(){
        return pVehicle;
    }
}