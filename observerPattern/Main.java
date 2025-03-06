
import java.util.*;

public class Main{
	public static void main(String[] args) {
	    
	    StockObservable observable = new IphoneObservableImpl();
	    
	    NotificationAlertObserver o1= new EmailAlertObserverImpl("johnDoe@gmail.com",observable);
	    NotificationAlertObserver o2= new EmailAlertObserverImpl("RobertDowneyJr@yahoo.in",observable);
	    
	    NotificationAlertObserver o3= new MobileObservable("9900991100",observable);
	    
	    observable.add(o1);
	    observable.add(o2);
	    observable.add(o3);
	    
	    observable.setStockCount(19);
	    observable.setStockCount(10);
	    
	}
}