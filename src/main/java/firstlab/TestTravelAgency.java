package firstlab;

// TestTravelAgency.java
public class TestTravelAgency {
    public static void main(String[] args) {
        // Створення об'єктів для тестування
        Customer customer1 = new Customer("Anton Lyzun", 30);
        Customer customer2 = new Customer("Yuriy Tkach", 25);

        Tour tour1 = new Tour("Vacation", 1000.0);
        Tour tour2 = new Tour("Shopping", 500.0);

        Order order1 = new Order(customer1, tour1);
        Order order2 = new Order(customer2, tour2);

        Discount discount1 = new Discount("Vacation", 10.0);
        Discount discount2 = new Discount("Shopping", 5.0);

        TravelAgency agency = new TravelAgency();

        // Додавання клієнта, туру, замовлення та знижки до агенції
        agency.addCustomer(customer1);
        agency.addCustomer(customer2);

        agency.addTour(tour1);
        agency.addTour(tour2);

        agency.addDiscount(discount1);
        agency.addDiscount(discount2);

        // Приклад виведення інформації про клієнта, тур, замовлення та знижку
        System.out.println("Customer Name: " + customer1.getName());
        System.out.println("Customer Age: " + customer1.getAge());
        System.out.println("Tour Type: " + tour1.getType());
        System.out.println("Tour Price: $" + tour1.getPrice());
        System.out.println("Discount Percentage: " + discount1.getDiscountPercentage() + "%");

        System.out.println("\nOrder Details - Customer: " + order1.getCustomer().getName() +
                ", Tour: " + order1.getTour().getType());
        System.out.println("Order Total Price: $" + order1.getTour().getPrice());

    }

}
