


public class MobileObservable implements NotificationAlertObserver{
    
    String mobNo;
    StockObservable o1;
    
    public MobileObservable(String mobNumber, StockObservable observer){
        this.mobNo= mobNumber;
        this.o1= observer;
    }
    
    @Override 
    public void update(){
        sendMsg(mobNo,"Product is in stock hurry up!");
    }
    
    private void sendMsg(String number, String msg){
        System.out.println("Message sent to: " + number + " with message: " + msg);
    }
}