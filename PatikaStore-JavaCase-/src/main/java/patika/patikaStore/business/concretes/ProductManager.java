package patika.patikaStore.business.concretes;
import java.util.List;

import org.springframework.stereotype.Service;

import patika.patikaStore.business.abstracts.ProductService;
import patika.patikaStore.dataAccess.abstracts.ProductDao;
import patika.patikaStore.entities.Product;
import patika.patikaStore.entities.models.ApiResponse;

@Service
public class ProductManager implements ProductService  {

    private final ProductDao productDao;
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }
    @Override
    public ApiResponse<List<Product>> getAllProduct() {
        List<Product> allProduct = productDao.findAll();
        return ApiResponse.default_OK(allProduct);
    }

    @Override
    public ApiResponse<Product> getOneProduct(int id) {
        Product product = productDao
        .findById(id).get();
        return ApiResponse.default_OK(product);
    }

    @Override
    public ApiResponse<Product> postOneProduct(Product product) {
        Product data = productDao.save(product);
        return ApiResponse.default_CREATED(data);
    }

    @Override
    public ApiResponse<Product> putOneProduct(int id, Product product) {
        getOneProduct(id); // varlığından emin oluyoruz.
        product.setId(id);
        Product data = productDao.save(product);
        return ApiResponse.default_ACCEPTED(data);
    }

    @Override
    public void deleteProduct(int id) {
        getOneProduct(id);
        productDao.deleteById(id);
        return;        
    }

}
