
import java.util.*;

public class IphoneObservableImpl implements StockObservable{
    
    
    public List<NotificationAlertObserver> observerlist = new ArrayList();
    
    public int stockCount=0;
    
    @Override
    public void add(NotificationAlertObserver observer){
        observerlist.add(observer);
    }
    
    
    @Override
    public void remove(NotificationAlertObserver observer){
        observerlist.remove(observer);
    }
    
    
    @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver o1: observerlist){
            o1.update();
        }
    }
    
    @Override
    public void setStockCount(int newStockCount){
        if (stockCount==0){
            notifySubscribers();
        } 
        stockCount = stockCount+ newStockCount;
    }
    
    @Override
    public int getCount(){
        return stockCount;
    }
        
}