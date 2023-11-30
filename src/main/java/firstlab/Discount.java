// Discount.java
package firstlab;

public class Discount {
    private String tourType;
    private double discountPercentage;

    public Discount(String tourType, double discountPercentage) {
        this.tourType = tourType;
        this.discountPercentage = discountPercentage;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
