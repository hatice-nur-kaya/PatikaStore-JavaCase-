package patika.patikaStore.business.concretes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import patika.patikaStore.business.abstracts.BrandService;
import patika.patikaStore.dataAccess.abstracts.BrandDao;
import patika.patikaStore.entities.Brand;
import patika.patikaStore.entities.models.ApiResponse;

@Service
public class BrandManager implements BrandService {
    private final BrandDao brandDao;

    public BrandManager(BrandDao brandDao) {
        this.brandDao = brandDao;
    }
    @Override
    public ApiResponse<List<Brand>> getAllBrands() {
        List<Brand> allBrands = brandDao.findAll();
        return ApiResponse.default_OK(allBrands);
    }

}
