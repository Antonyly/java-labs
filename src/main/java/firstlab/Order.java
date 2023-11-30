// Order.java
package firstlab;

public class Order {
    private Customer customer;
    private Tour tour;

    public Order(Customer customer, Tour tour) {
        this.customer = customer;
        this.tour = tour;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }
}
