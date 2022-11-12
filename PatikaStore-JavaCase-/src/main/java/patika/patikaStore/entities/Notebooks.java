package patika.patikaStore.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notebooks extends Product{
    private int id;
    private String name;
    private String ram;
    private String storage;
    private String screenSize;

}
