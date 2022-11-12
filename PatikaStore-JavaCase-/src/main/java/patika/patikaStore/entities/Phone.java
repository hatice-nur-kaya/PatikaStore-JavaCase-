package patika.patikaStore.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone  extends Product{
    private int id;
    private String name;
    private String memory;
    private String screenSize;
    private String battery;
    private String ram;
    private String color;
}
