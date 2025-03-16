


public class MushRoomTopping extends ToppingsDecor{
    
    BasePizza basePizza;
    
    public MushRoomTopping(BasePizza bp){
        this.basePizza= bp;
    }
    
    
    @Override
    public int cost(){
        return basePizza.cost()+35;
    }
}