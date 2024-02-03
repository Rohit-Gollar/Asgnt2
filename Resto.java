import java.util.Scanner;

class Customer {
    private String name;
    private int numOfAdults;
    private int numOfChildren;
    private int numOfDays;

    public Customer(String name, int numOfAdults, int numOfChildren, int numOfDays) {
        this.name = name;
        this.numOfAdults = numOfAdults;
        this.numOfChildren = numOfChildren;
        this.numOfDays = numOfDays;
    }

    public String getName() {
        return name;
    }

    public int getNumOfAdults() {
        return numOfAdults;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public int getNumOfDays() {
        return numOfDays;
    }
}

class BookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer details");
        String input = scanner.nextLine();

        // Splitting input into fields
        String[] fields = input.split(":");

        // Validating input
        if (fields.length != 4) {
            System.out.println("Invalid input format");
            return;
        }

        String name = fields[0];
        int numOfAdults = Integer.parseInt(fields[1]);
        int numOfChildren = Integer.parseInt(fields[2]);
        int numOfDays = Integer.parseInt(fields[3]);

        // Creating customer object
        Customer customer = new Customer(name, numOfAdults, numOfChildren, numOfDays);

        // Calculating total cost and displaying the result
        calculateAndDisplayCost(customer);
    }

    private static void calculateAndDisplayCost(Customer customer) {
        if (customer.getNumOfAdults() < 0) {
            System.out.println("Invalid input for number of adults");
        } else if (customer.getNumOfChildren() < 0) {
            System.out.println("Invalid input for number of children");
        } else if (customer.getNumOfDays() <= 0) {
            System.out.println("Invalid input for number of days");
        } else {
            int totalCost = calculateTotalCost(customer);
            System.out.println(customer.getName() + " your booking is confirmed and the total cost is " + totalCost);
        }
    }

    private static int calculateTotalCost(Customer customer) {
        int costPerAdult = 1000;
        int costPerChild = 650;

        int totalCost = (customer.getNumOfAdults() * costPerAdult + customer.getNumOfChildren() * costPerChild) * customer.getNumOfDays();
        return totalCost;
    }
}
