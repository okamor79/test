package logos.edu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car_engine_capacity")
@Getter @Setter @NoArgsConstructor
public class CarEngineCapacity extends BaseEntity{

    @Column(name = "engine_capacity", columnDefinition = "DEMICAL(2,1)")
    private double engineCapacity;

}
