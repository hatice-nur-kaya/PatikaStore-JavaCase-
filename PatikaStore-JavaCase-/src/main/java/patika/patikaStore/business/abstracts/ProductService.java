package patika.patikaStore.business.abstracts;

import java.util.List;

import patika.patikaStore.entities.Product;

public interface ProductService {
    List<Product> getAll();
    Product getById(int id);
    void add(Product product);
    void update (Product product,int id);
    void remove(int id);
}
