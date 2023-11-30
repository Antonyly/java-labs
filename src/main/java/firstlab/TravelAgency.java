package firstlab;
// TravelAgency.java
import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
    private List<Customer> customers;
    private List<Tour> availableTours;
    private List<Discount> discounts;

    public TravelAgency() {
        this.customers = new ArrayList<>();
        this.availableTours = new ArrayList<>();
        this.discounts = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addTour(Tour tour) {
        availableTours.add(tour);
    }

    public void addDiscount(Discount discount) {
        discounts.add(discount);
    }

    // Можна додати інші методи для роботи з клієнтами, турами та знижками
}
