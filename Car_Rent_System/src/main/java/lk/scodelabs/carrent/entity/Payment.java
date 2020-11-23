package lk.scodelabs.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Payment {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String payId;
    private double amount;
    private double deduction;

    @OneToOne
    @JoinColumn(name = "orderReturnId", referencedColumnName = "oReturnId")
    private OrderReturn orderReturn;
}
