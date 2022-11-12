package patika.patikaStore.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private int unitPrice;
    private int discountRate;
    private String stock;
    private String brandInformation;

}
