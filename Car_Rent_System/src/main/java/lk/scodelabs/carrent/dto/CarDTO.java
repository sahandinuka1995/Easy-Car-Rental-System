package lk.scodelabs.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarDTO {
    private String regNo;
    private int noOfPassengers;
    private String type;
    private String fuelType;
    private String brand;
    private double noOfKm;
    private String color;
    private String transmissionType;
    private double priceForExtraKm;
//    private CarImage carImage;


    public CarDTO(String regNo) {
        this.regNo = regNo;
    }
}
