public class Person {
    private String name;
    private int ticketNumber;
    private static int nextTicketNumber = 0;

    Person(){
        name = "NO NAME";
        ticketNumber = nextTicketNumber;
        nextTicketNumber++;
    }
    Person(String name){
        this.name = name;
        ticketNumber = nextTicketNumber;
        nextTicketNumber++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return ticketNumber+"  "+name+"\n";
    }
}
