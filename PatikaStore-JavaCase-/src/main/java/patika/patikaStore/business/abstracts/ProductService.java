package patika.patikaStore.business.abstracts;

import java.util.List;
import patika.patikaStore.entities.Product;
import patika.patikaStore.entities.models.ApiResponse;

public interface ProductService {
    ApiResponse<List<Product>> getAllProduct();
    ApiResponse<Product> getOneProduct(int id);
    ApiResponse<Product> postOneProduct(Product product);
    ApiResponse<Product> putOneProduct(int id, Product product);
    void deleteProduct(int id);

}
