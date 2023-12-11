package exercise.task11;

import java.util.List;

public interface Inentory {
    void addProduct(Product product);

    Product getProduct(String productName);

    int getProductCount();

    List<Product> getAllProducts();

    int getProductQuantity(String productName);

    void updateProductQuantity(String productName, int newQuantity);

    double getProductPrice(String productName);

    void updateProductPrice(String productName, double newPrice);

    Product getProductWithLowestPrice();

    Product getProductWithHighestPrice();

    Product getProductWithBiggestQuantity();

    Product getProductWithLeastQuantity();

    void removeProduct(String productName);
}
