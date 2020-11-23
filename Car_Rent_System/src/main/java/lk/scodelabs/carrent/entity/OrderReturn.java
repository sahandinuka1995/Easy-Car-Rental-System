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
public class OrderReturn {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String oReturnId;
    private String rDate;
    private double usedKm;

    @OneToOne(mappedBy = "orderReturn")
    private Payment payment;

    @OneToOne
    @JoinColumn(name = "orderId", referencedColumnName = "orderId")
    private Orders orders;
}
