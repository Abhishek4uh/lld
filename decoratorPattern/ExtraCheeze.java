

public class ExtraCheeze extends ToppingsDecor{
    
    BasePizza basePizza;
    
    public ExtraCheeze(BasePizza bp){
        this.basePizza= bp;
    }
    
    
    @Override
    public int cost(){
        return basePizza.cost()+25;
    }
}