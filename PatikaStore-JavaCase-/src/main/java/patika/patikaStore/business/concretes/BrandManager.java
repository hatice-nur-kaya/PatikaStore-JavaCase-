package patika.patikaStore.business.concretes;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import patika.patikaStore.business.abstracts.BrandService;
import patika.patikaStore.entities.Brand;


@Service
public class BrandManager  implements BrandService{

    List<Brand> brands;
    @Override
    public List<Brand> getAll() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"Samsung"));
        brands.add(new Brand(2,"Lenovo"));
        brands.add(new Brand(3,"Apple"));
        brands.add(new Brand(4,"Huawei"));
        brands.add(new Brand(5,"Casper"));
        brands.add(new Brand(6,"Asus"));
        brands.add(new Brand(7,"HP"));
        brands.add(new Brand(8,"Xiaomi"));
        brands.add(new Brand(9,"Monster"));
        return brands;
    }
}
