package map;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> products = new TreeMap<>();

        // 1. Add products in random ID order
        products.put(500, "Laptop");
        products.put(100, "Mouse");
        products.put(300, "Keyboard");
        products.put(200, "Monitor");
        products.put(400, "Printer");

        // 2. Display products
        System.out.println("Products: " + products);

        // 3. Search using ID
        System.out.println("Product 300: " + products.get(300));

        // 4. Remove product
        products.remove(200);

        // 5. Final map
        System.out.println("Final Map: " + products);
    }
}
