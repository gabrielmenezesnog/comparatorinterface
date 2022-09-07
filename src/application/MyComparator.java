package application;

import java.util.Comparator;

import modules.Product;

// Interface MyComparator do tipo Product
public interface MyComparator extends Comparator<Product> {

  @Override
  public default int compare(Product p1, Product p2) {
    return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
  }
}
