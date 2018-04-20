package logos.edu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "car_color")
@Getter @Setter @NoArgsConstructor
public class Color extends BaseEntity {

    private String color;

    @ManyToMany
    @JoinTable(name = "model_color", joinColumns = @JoinColumn(name = "color_id"), inverseJoinColumns = @JoinColumn(name = "model_id"))
    private List<CarModel> carModels = new ArrayList<>();
}
