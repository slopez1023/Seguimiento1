package Repository;

import Models.Product;

import java.util.List;

public interface ProductRepo {
    Product findById(int id);
    List<Product> findAll();
}
