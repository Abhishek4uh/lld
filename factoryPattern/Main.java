import java.util.*;


public class Main
{
	public static void main(String[] args) {
	    //Create a Car class Object
		Vehicle car = VehicleFactory.getVehicle("CAR");
		car.drive();
		
		//Create a Truck Class Object
		Vehicle truck = VehicleFactory.getVehicle("TRUCK");
		truck.drive();
		
		
		System.out.println("Using Generic Factory ");
		
		
		//Using Generic Vehicle Factory..
		Vehicle carV2 = GenericVehicleFactory.createVehicle(Car.class);
	        carV2.drive(); 
	        
	        Vehicle truckV2 = GenericVehicleFactory.createVehicle(Truck.class);
	        truckV2.drive();
	}
}
