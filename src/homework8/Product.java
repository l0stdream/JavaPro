package homework8;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Product {
    private int id;
    private ProductType type;
    private double price;
    private boolean discount;
    private LocalDateTime addedTime;

    public Product() {
    }

    public Product(ProductType type, double price, boolean discount) {
        this.id = this.hashCode();
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.addedTime = LocalDateTime.now();
    }

    public enum ProductType {
        BOOK,
        TOY,
        MAGAZINE,
        CAR
    }

    public static List<Product> showBooks(List<Product> products) {
        return products.stream()
                .filter(s -> s.getType() == ProductType.BOOK)
                .filter(s -> s.getPrice() > 250)
                .toList();
    }

    public static List<Product> showDiscountedBooks(List<Product> products) {
        return products.stream()
                .filter(s -> s.getType() == ProductType.BOOK)
                .filter(Product::isDiscount)
                .peek(s -> s.setPrice(s.getPrice() * 0.9))
                .toList();
    }

    public static Product showCheapestBook(List<Product> products) {
        try {
            return
                    products.stream()
                            .filter(s -> s.getType() == ProductType.BOOK)
                            .min(Comparator.comparing(Product::getPrice))
                            .orElseThrow(Exception::new);
        } catch (Exception e) {
            System.err.println(ProductType.BOOK + " not found");
        }
        return new Product();
    }

    public static List<Product> showLatestProducts(List<Product> products) {
        return
                products.stream()
                        .sorted(Comparator.comparing(Product::getAddedTime).reversed())
                        .limit(3)
                        .toList();
    }

    public static Double calculateBooksPrice(List<Product> products) {
        return
                (products.stream()
                        .filter(s -> s.getType() == ProductType.BOOK)
                        .filter(s -> s.getAddedTime().getYear() == LocalDateTime.now().getYear())
                        .filter(s -> s.getPrice() < 75)
                        .reduce(0.0,
                                (s, current) -> s + current.getPrice(),
                                Double::sum));
    }

    public static Map<ProductType, List<Product>> groupProducts(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }

    public boolean isDiscount() {
        return discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    public LocalDateTime getAddedTime() {
        return addedTime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type=" + type +
                ", price=" + price +
                ", discount=" + discount +
                ", addedTime=" + addedTime +
                '}';
    }
}
