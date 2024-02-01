import java.util.ArrayList;

public class Bus {
    private ArrayList<Person> passengers;
    private static int nextId = 0;
    private int id;

    Bus(){
        passengers =  new ArrayList<Person>();
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void addPerson(Person person){
        passengers.add(person);
    }

    public boolean removePerson(Person person){
        for(Person x: passengers) {
            if (x==person) {
                passengers.remove(x);
                return true;
            }
        }
        return false;
    }

    public Person findPerson(String name){
        for(Person x:passengers){
            if(x.getName().equals(name)){
                return x;
            }
        }
        return null;
    }

    public static boolean transferPerson(Bus bus1,Bus bus2,Person person){
        for(Person t: bus1.passengers) {
            if (t==person) {
                bus2.passengers.add(t);
                bus1.passengers.remove(t);
                return true;
            }
        }
        return false;
    }

    public String getPassengers(){
        String x = "";
        for(int i = 0;i<passengers.size();i++){
            x += passengers.get(i).toString();
        }
        return x;
    }

    @Override
    public String toString(){
        return String.valueOf(id);
    }
}
