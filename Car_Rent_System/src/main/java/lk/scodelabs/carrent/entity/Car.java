package lk.scodelabs.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Car {
    @Id
    private String regNo;
    private int noOfPassengers;
    private String type;
    private String fuelType;
    private String brand;
    private double noOfKm;
    private String color;
    private String transmissionType;
    private double priceForExtraKm;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<CarImage> carImages;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<Orders> orders = new ArrayList<>();
}
