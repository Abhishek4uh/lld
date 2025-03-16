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
	}
}