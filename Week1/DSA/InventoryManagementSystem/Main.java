public class Main {
    public static void main(String[] args) {

        Inventory inv = new Inventory();
        // Adding
        inv.addProduct(new Product(1, "Lipstick",   50,  299.0));
        inv.addProduct(new Product(2, "Foundation", 30,  799.0));
        inv.addProduct(new Product(3, "Mascara",    40,  499.0));
        inv.addProduct(new Product(4, "Eyeliner",   60,  199.0));
        // Display
        inv.displayAll();
        // Update
        System.out.println();
        inv.updateProduct(2, 45, 749.0);
        System.out.println();
        inv.deleteProduct(3);      
        inv.displayAll();
    }
}