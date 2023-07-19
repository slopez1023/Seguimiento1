package Repository;

import Models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl implements ProductRepo{
    private List<Product> products;

    public ProductRepoImpl() {
        products = new ArrayList<>();
    }

    @Override
    public Product findById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

}
