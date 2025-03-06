

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    
    String emailId;
    StockObservable o1;
    
    public EmailAlertObserverImpl(String email, StockObservable observer){
        this.emailId= email;
        this.o1= observer;
    }
    
    @Override 
    public void update(){
        sendMail(emailId,"Product is in stock hurry up!");
    }
    
    private void sendMail(String mail, String msg){
        System.out.println("Mail sent to: " + mail + " with message: " + msg);
    }
}