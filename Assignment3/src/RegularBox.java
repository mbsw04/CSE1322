public class RegularBox extends Box{
    private String items;
    private double weight;
    RegularBox(){
        super();
        items = "";
        weight = 0;
    }
    RegularBox(String deliveryAddress,String returnAddress,double width,double length,double height,int count,String items,double weight){
        super(deliveryAddress,returnAddress,width,length,height,count);
        this.items = items;
        this.weight = weight;
    }
    public String getItems() {
        return items;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public String toString(){
        return super.toString()+"\n Items: "+items+"\n Count: "+super.getCount()+"\n Weight: "+weight;
    }
}
