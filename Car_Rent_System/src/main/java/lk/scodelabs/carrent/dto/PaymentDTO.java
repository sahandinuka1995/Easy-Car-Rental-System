package lk.scodelabs.carrent.dto;

import lk.scodelabs.carrent.entity.OrderReturn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDTO {
    private String payId;
    private double amount;
    private double deduction;
    private OrderReturn orderReturn;
}
