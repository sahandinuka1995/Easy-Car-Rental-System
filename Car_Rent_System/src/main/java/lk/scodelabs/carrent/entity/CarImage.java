package lk.scodelabs.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CarImage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int imgId;
    private boolean img;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "carId", referencedColumnName = "regNo", nullable = false)
    private Car car;
}
