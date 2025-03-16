import java.util.*;


public class Main {
    public static void main(String[] args) {
        //So make one Margherita pizza with Extra Cheeze...
        BasePizza RobertPizza= new ExtraCheeze(new MargheritaPizza());
        System.out.println("Your Cost for this Pizza is "+RobertPizza.cost());
        
        
       //So make one FarmHouse pizza with Extra Cheeze and MushRoom on the Top...
         BasePizza paperPizza= new MushRoomTopping(new ExtraCheeze(new FarmHousePizza()));
        System.out.println("Your Cost for this Pizza is "+paperPizza.cost());
        
        
        //Just like this we can create multiple Topping Class and add on any BAse Pizza..
    }
}