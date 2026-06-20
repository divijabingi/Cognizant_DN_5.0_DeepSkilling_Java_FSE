import java.util.HashMap;

public class Inventory {

    HashMap<Integer, Product> map = new HashMap<>();

    void addProduct(Product p) {
        map.put(p.productId, p);
        System.out.println("Product added : " + p.productName);
    }

    void updateProduct(int id, int qty, double price) {
        if (map.containsKey(id)) {
            map.get(id).quantity = qty;
            map.get(id).price = price;
            System.out.println("Product updated : " + map.get(id).productName);
        } else {
            System.out.println("Product not found!");
        }
    }

    void deleteProduct(int id) {
        if (map.containsKey(id)) {
            System.out.println("Product deleted : " + map.get(id).productName);
            map.remove(id);
        } else {
            System.out.println("Product not found!");
        }
    }

    void displayAll() {
        System.out.println();
        System.out.println("Makeup Inventory List ");
        for (Product p : map.values()) {
            System.out.println("ID:" + p.productId + " Name:" + p.productName + " Qty:" + p.quantity + " Price: Rs." + p.price);
        }
    }
}