package patika.patikaStore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import patika.patikaStore.business.abstracts.BrandService;

@RestController
@RequestMapping("api/v1/brands")
@RequiredArgsConstructor
public class BrandController {
    private final BrandService brandService;
 
    @GetMapping
    public ResponseEntity<?> getAllBrand(){
        return ResponseEntity
        .status(HttpStatus.OK)
        .body(brandService.getAll());
    }
    
}
