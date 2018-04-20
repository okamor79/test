package logos.edu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "car_seller")
@Getter
@Setter
@NoArgsConstructor
public class CarSeller extends BaseEntity {

    @Column(name = "first_name", length = 30)
    private String firstName;

    @Column(name = "last_name", length = 60)
    private String lastName;

    private int age;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "carSeller")
    private List<Cars> car = new ArrayList<>();
}
