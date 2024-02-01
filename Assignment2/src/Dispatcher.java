import java.util.ArrayList;

public class Dispatcher {
    private ArrayList<Bus> busQueue = new ArrayList<Bus>();

    public int addBus(Bus bus){
        busQueue.add(bus);
        return busQueue.size()-1;
    }
    public int addBus(Bus bus,int pos){
        if(pos >= 0 && pos < busQueue.size()){
            busQueue.add(pos,bus);
            return pos;
        }else{
            busQueue.add(bus);
            return busQueue.size()-1;
        }
    }
    public Bus findBus(int id){
        for(Bus x: busQueue){
            if(x.getId()==id){
                return x;
            }
        }
        return null;
    }
    public Bus removeBus(int id){
        for(Bus x: busQueue){
            if(x.getId()==id){
                busQueue.remove(x);
                return x;
            }
        }
        return null;
    }
    public Bus dispatchBus(){
        if(busQueue.isEmpty()){
            return null;
        }else{
            Bus x = busQueue.get(0);
            busQueue.remove(0);
            return x;
        }
    }
    @Override
    public String toString(){
        String x = "";
        for(Bus y: busQueue){
            x += y.toString()+"\n";
        }
        return x;
    }
}
