import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import modules.Product;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // chamando o método sort para
        // comparar a lista através da interface
        // MyCompatador
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
