package exercise.task11;

import java.util.*;

public class SimpleInventory implements Inventory{
    private Map<String, Product> products;

    public SimpleInventory() {
        products = new HashMap<>();
    }
    //addProduct(product) - pievieno produktu noliktavai (produkta nosaukums kalpo kā atslēga Map klasei);
    @Override
    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }

    @Override
    public Product getProduct(String productName) {
        return products.get(productName);
    }

    @Override
    public int getProductCount() {
        return products.size();
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    @Override
    public int getProductQuantity(String productName) {
       return products.get(productName).getQuantity();
    }

    @Override
    public void updateProductQuantity(String productName, int newQuantity) {
        products.get(productName).setQuantity(newQuantity);
    }

    @Override
    public double getProductPrice(String productName) {
        return products.get(productName).getPrice();
    }

    @Override
    public void updateProductPrice(String productName, double newPrice) {
        products.get(productName).setPrice(newPrice);
    }

    @Override
    public Product getProductWithLowestPrice() {
        List<Product> productValues = new ArrayList<>(products.values());
        productValues.sort(Comparator.comparing(Product::getPrice));
        return productValues.get(0);
    }

    @Override
    public Product getProductWithHighestPrice() {
        List<Product> productValues = new ArrayList<>(products.values());
        productValues.sort(Comparator.comparing(Product::getPrice));
        return productValues.get(productValues.size() - 1);
    }

    @Override
    public Product getProductWithBiggestQuantity() {
        List<Product> productValues = new ArrayList<>(products.values());
        productValues.sort(Comparator.comparing(Product::getQuantity));
        return productValues.get(productValues.size() - 1);
    }

    @Override
    public Product getProductWithLeastQuantity() {
        List<Product> productValues = new ArrayList<>(products.values());
        productValues.sort(Comparator.comparing(Product::getQuantity));
        return productValues.get(0);
    }

    @Override
    public void removeProduct(String productName) {
        products.remove(productName);
    }
}
