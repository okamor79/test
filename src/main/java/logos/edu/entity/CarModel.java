package logos.edu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "car_model")
@Getter
@NoArgsConstructor
@Setter
public class CarModel extends BaseEntity {

    @Column(name = "model_title")
    private String modelTitle;

    @OneToOne
    @JoinColumn(name = "engine_capacity_id")
    private CarEngineCapacity carEngineCapacity;

    @OneToOne
    @JoinColumn(name = "fuel_type_id")
    private CarFuelType carFuelType;

    @ManyToMany
    @JoinTable(name = "model_color", joinColumns = @JoinColumn(name = "model_id"), inverseJoinColumns = @JoinColumn(name = "color_id"))
    private List<Color> color = new ArrayList<>();

    @OneToOne
    @JoinColumn(name ="car_maker_id")
    private CarMake carMake;

}
