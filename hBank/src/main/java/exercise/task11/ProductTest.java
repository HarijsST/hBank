package exercise.task11;

public class ProductTest {
    public static void main(String[] args) {
        Product samsung = new Product("Flip 4", 1500, 15);
        Product nokia = new Product("1610", 200, 3);
        Product iPhone = new Product("iPhone", 1300, 1);
        SimpleInventory simpleInventory = new SimpleInventory();
        simpleInventory.addProduct(samsung);
        simpleInventory.addProduct(nokia);
        simpleInventory.addProduct(iPhone);
        /*System.out.println("Produktu sarakstā ir " + simpleInventory.getProductCount() + " vienības");
        System.out.println(simpleInventory.getProduct("1610"));
        System.out.println(simpleInventory.getProductQuantity("Flip 4"));
        System.out.println(simpleInventory.getAllProducts());
        simpleInventory.updateProductQuantity("1610", 7);
        System.out.println(simpleInventory.getProduct("1610"));
        System.out.println(simpleInventory.getProductPrice("Flip 4"));
        simpleInventory.updateProductPrice("Flip 4", 1800);
        System.out.println(simpleInventory.getProduct("Flip 4"));
        simpleInventory.removeProduct("1610");
        System.out.println(simpleInventory.getAllProducts());*/
        System.out.println("Lētākā prece " + simpleInventory.getProductWithLowestPrice());
        System.out.println("Dārgākā prece " + simpleInventory.getProductWithHighestPrice());
        System.out.println("Visvairāk preces noliktavā " + simpleInventory.getProductWithBiggestQuantity());
        System.out.println("Vismazāk preces noliktavā " + simpleInventory.getProductWithLeastQuantity());
    }
}
