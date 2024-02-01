public class Envelope extends Mail{
    private double thickness;
    Envelope(){
        super();
        thickness = 0;
    }
    Envelope(String deliveryAddress,String returnAddress,double width,double length,double thickness){
       super(deliveryAddress,returnAddress,width,length);
       this.thickness = thickness;
    }
    public double getThickness(){
        return thickness;
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+super.getWidth()+" x "+super.getLength()+" x "+this.thickness;
    }
}
