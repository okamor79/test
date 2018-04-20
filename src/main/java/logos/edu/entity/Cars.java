package logos.edu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "car")
@Getter @Setter @NoArgsConstructor
public class Cars extends BaseEntity {

    @Column(name = "sell_price", columnDefinition = "DECIMAL(8,2)")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "carMake_id")
    private CarMake carMake;

    @ManyToOne
    @JoinColumn(name = "car_seller_id")
    private CarSeller carSeller;


}
