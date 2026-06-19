import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    public static Product linearSearch(Product[] p, String name) {
        for (int i = 0; i < p.length; i++) {
            if (p[i].productName.equalsIgnoreCase(name)) {
                return p[i];
            }
        }
        return null;
    }
   
    public static Product binarySearch(Product[] p, String name) {
        int left = 0;
        int right = p.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int result = p[mid].productName.compareToIgnoreCase(name);
            if (result == 0) {
               return p[mid];
            }
            if (result < 0) {
               left = mid + 1;
            } else
            {
               right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Headphones", "Electronics")
        };

        String search = "Mobile";
        System.out.println("E-Commerce Product Search System");
        // linear search
        Product res = linearSearch(products, search);
        System.out.println("Linear Search Result");
        if (res!= null) {
            System.out.println("Product ID : " + res.productId);
            System.out.println("Product Name : " + res.productName);
            System.out.println("Category : " + res.category);
        } else {
            System.out.println("Product Not Found");
        }

        //binary search
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = 0; j < products.length - i - 1; j++) {
                if (products[j].productName.compareToIgnoreCase(products[j + 1].productName) > 0) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
        Product res1 = binarySearch(products, search);
        System.out.println("\nBinary search Result");
        if (res1!= null) {
            System.out.println("Product ID  : " + res1.productId);
            System.out.println("Product Name : " + res1.productName);
            System.out.println("Category  : " + res1.category);
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println("\nTime complexity");
        System.out.println("Linear Search: O(n)");
        System.out.println("Binary Search: O(log n)");
    }
}