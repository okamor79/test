package logos.edu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "car_make")
@Getter @Setter @NoArgsConstructor
public class CarMake extends BaseEntity {

    @Column(name = "make_title", unique = true)
    private String makeName;

    @Column(name = "manufacture_year")
    private int yearProd;

    @OneToMany(mappedBy = "carMake")
    private List<Cars> cars = new ArrayList<>();

}
