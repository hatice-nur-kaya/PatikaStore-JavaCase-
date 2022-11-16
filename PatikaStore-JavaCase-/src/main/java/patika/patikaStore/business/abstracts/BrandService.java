package patika.patikaStore.business.abstracts;


import java.util.ArrayList;
import java.util.HashSet;

import patika.patikaStore.entities.Brand;
import patika.patikaStore.entities.models.ApiResponse;

public interface BrandService {
   ArrayList<Brand> getAllBrands();
}
