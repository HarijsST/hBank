package exercise.task11;

import java.util.*;

public class SimpleInventory_Oskars implements Inentory {
    private Map<String, Product> products;

    public SimpleInventory_Oskars() {
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
        for (Product product : products.values()) {
            if (product.getName().equals(productName)) {
                product.setQuantity(newQuantity);
            }
        }
    }

    @Override
    public double getProductPrice(String productName) {
        double productPrice = 0.00;
        for (Product product : products.values()) {
            if (product.getName().equals(productName)) {
                productPrice = product.getPrice();
            }
        }
        return productPrice;
    }

    @Override
    public void updateProductPrice(String productName, double newPrice) {
        for (Product product : products.values()) {
            if (product.getName().equals(productName)) {
                product.setPrice(newPrice);
            }
        }
    }

    @Override
    public Product getProductWithLowestPrice() {
        List<String> names = new ArrayList<>();
        names.add("Antons");
        names.add("Zigurds");
        //Sis strada, ja objektam ir Comaprable interfeiss
        //Sie 3 visi dara vienu un to pasu
        Collections.sort(names); // Java 8
        Collections.sort(names, Comparator.naturalOrder()); // Java 8
        Collections.sort(names, (name1, name2) -> name1.compareTo(name2));
        Collections.sort(names, (name1, name2) -> Integer.compare(name1.length(), name2.length()));
        Collections.sort(names, Comparator.comparingInt(String::length));
        names.sort(Comparator.naturalOrder()); // Sis ir samera jauns! Java 14

        //Sis strada, ja objektam ir Comaprable interfeiss
        //Sie 2 dara vienu un to pasu
        Collections.sort(names, Comparator.reverseOrder()); // Java 8
        Collections.sort(names, (name1, name2) -> name2.compareTo(name1));
        names.sort(Comparator.reverseOrder()); // Sis ir samera jauns! Java 14
        System.out.println(names);

        //Darbs ar producList
        List<Product> productList = new ArrayList<>(products.values());

        Collections.sort(productList, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        Collections.sort(productList, Comparator.comparing(Product::getName));
        productList.sort(Comparator.comparing(Product::getName));
        System.out.println("pec varda" + productList);
        Collections.sort(productList, Comparator.comparing(Product::getQuantity));
        productList.sort(Comparator.comparing(Product::getQuantity));
        System.out.println("pec daudzuma" + productList);
        Collections.sort(productList, Comparator.comparing(Product::getPrice));
        productList.sort(Comparator.comparing(Product::getPrice));
        System.out.println("pec cenas" + productList);

        System.out.println(names);

        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //Labakais variants, ja gribam kartot pec varda sarakstu:
        productList.sort(Comparator.comparing(Product::getName));
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        //Interesantais
        productList.sort(Comparator.comparing(Product::getName)
                .thenComparing(Product::getPrice)
                .thenComparing(Product::getQuantity)
                .reversed());

        return null;
    }


    public static void main(String[] args) {
        SimpleInventory_Oskars simpleInventory = new SimpleInventory_Oskars();
        simpleInventory.addProduct(new Product("zbc", 15.0, 11));
        simpleInventory.addProduct(new Product("hbc", 12.0, 14));
        simpleInventory.addProduct(new Product("abc", 19.0, 23));
        simpleInventory.getProductWithLowestPrice();
    }

    public Product getProductWithLowestPrice_OskaraVariants() {
        List<Product> productList = new ArrayList<>(products.values());
        Product productWithLowestPrice = productList.get(0);
        for (Product product : productList) {
            if (product.getPrice() < productWithLowestPrice.getPrice()) {
                productWithLowestPrice = product;
            }
        }
        return productWithLowestPrice;
    }

    @Override
    public Product getProductWithHighestPrice() {
        return null;
    }

    @Override
    public Product getProductWithBiggestQuantity() {
        return null;
    }

    @Override
    public Product getProductWithLeastQuantity() {
        return null;
    }

    @Override
    public void removeProduct(String productName) {
        for (Product product : products.values()) {
            if (product.getName().equals(productName)) {
                products.remove(product.getName(), product);
            }
        }
    }
}
