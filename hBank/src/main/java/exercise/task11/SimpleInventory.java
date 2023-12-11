package exercise.task11;

import java.util.*;

public class SimpleInventory implements Inentory{
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
        for(Product product : products.values()){
            if(product.getName().equals(productName)){
                product.setQuantity(newQuantity);
            }
        }
    }

    @Override
    public double getProductPrice(String productName) {
        double productPrice = 0.00;
        for(Product product : products.values()){
            if(product.getName().equals(productName)){
                productPrice = product.getPrice();
            }
        }
        return productPrice;
    }

    @Override
    public void updateProductPrice(String productName, double newPrice) {
        for(Product product : products.values()){
            if(product.getName().equals(productName)){
                product.setPrice(newPrice);
            }
        }
    }

    @Override
    public Product getProductWithLowestPrice() {
        double lowestPrice = products.get(0).getPrice();
        for(Product product : products.values()){
            if(product.getPrice() < lowestPrice){
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProductWithHighestPrice() {
        return null;
    }

    @Override
    public void removeProduct(String productName) {
        for(Product product : products.values()){
            if(product.getName().equals(productName)){
                products.remove(product.getName(), product);
            }
        }
    }
}
