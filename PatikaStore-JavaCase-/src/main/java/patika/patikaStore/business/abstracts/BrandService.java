package patika.patikaStore.business.abstracts;

import java.util.List;

import patika.patikaStore.entities.Brand;
import patika.patikaStore.entities.models.ApiResponse;

public interface BrandService {
    ApiResponse<List<Brand>> getAllBrands();
}
