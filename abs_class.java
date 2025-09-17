abstract class Ticket{ // This is the main abstruct class
    abstract void getPrice();
}
// This is the Bus Ticket
class BusTicket extends Ticket{
    @Override
    void getPrice(){
        System.out.println("The fare is: ₹120"); // Displaying
    }
}
// This is the Train Ticket
class TrainTicket extends Ticket{
    @Override
    void getPrice(){
        System.out.println("The fare is: ₹1400"); // Displaying
    }
}

// Main class calling.....
public class abs_class {
    public static void main(String[] args) {
        // Creating the Busticket obj and calling it.....
        BusTicket obj = new BusTicket();
        obj.getPrice();

        // Creating the train ticket obj and calling it....
        TrainTicket obj1 = new TrainTicket();
        obj1.getPrice();
    }
}
