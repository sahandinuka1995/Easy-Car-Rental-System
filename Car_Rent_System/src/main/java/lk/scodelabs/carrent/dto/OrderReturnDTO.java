package lk.scodelabs.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderReturnDTO {
    private String oReturnId;
    private String rDate;
    private double usedKm;

    private OrderDTO orders;
}
