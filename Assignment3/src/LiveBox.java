public class LiveBox extends Box{
    private String animal;
    private int age;
    LiveBox(){
        super();
        animal = "";
        age = 0;
    }
    LiveBox(String deliveryAddress,String returnAddress,double width,double length,double height,int count,String animal,int age){
        super(deliveryAddress,returnAddress,width,length,height,count);
        this.animal = animal;
        this.age = age;
    }
    public String getAnimal() {
        return animal;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return super.toString()+"\n Animal: "+animal+"\n Count: "+super.getCount()+"\n Age(Days): "+age;
    }
}
