public class Order {
    private int id;
    private static int next_id = 1;
    public boolean ready;
    public String[] items;

    Order() {
        id = next_id;
        next_id++;
        ready = false;
        items = new String[3];
    }

    Order(String[] input_items) {
        id = next_id;
        next_id++;
        ready = false;
        items = input_items;
    }

    int getId() {
        return id;
    }

    @Override
    public String toString() {
        String x;
        x = "Order number: " + id + "\n";
        if(ready){
            x += "Ready\n";
        }else{
            x += "Not Ready\n";
        }
        for (int i = 0; i < items.length; i++) {
            x += items[i] + "\n";
        }
        return x;
    }
}
