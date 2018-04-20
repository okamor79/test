package logos.edu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car_fuel_type")
@Getter @Setter @NoArgsConstructor
public class CarFuelType extends BaseEntity {

    @Column(name = "fuel_type")
    private String fuelType;
}
