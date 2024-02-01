public class Box extends Mail{
    private double height;
    private int count;
    Box(){
        super();
        height = 0;
        count = 0;
    }
    Box(String deliveryAddress,String returnAddress,double width,double length,double height,int count){
        super(deliveryAddress,returnAddress,width,length);
        this.height = height;
        this.count = count;
    }
    public double getHeight() {
        return height;
    }
    public int getCount() {
        return count;
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+super.getWidth()+" x "+super.getLength()+" x "+this.height;
    }
}
