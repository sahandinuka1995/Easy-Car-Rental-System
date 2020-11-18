package lk.scodelabs.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO {
    private String orderId;
    private String dateTime;
    private String returnDate;
    private boolean bankSlip;
    private double lossDamage;
    private double status;

    private CustomerDTO customer;
    private CarDTO car;
    private DriverDTO driver;
}
