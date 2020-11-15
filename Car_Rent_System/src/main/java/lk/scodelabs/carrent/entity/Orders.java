package lk.scodelabs.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Orders {
    @Id
    private String orderId;
    private String dateTime;
    private String returnDate;
    private boolean bankSlip;
    private double lossDamage;

    @OneToMany(mappedBy = "orderId", cascade = CascadeType.ALL)
    private List<OrderStatus> orderStatus;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "cusId", referencedColumnName = "nic", nullable = false)
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payId", referencedColumnName = "payId", nullable = false)
    private Payment payment;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "returnId", referencedColumnName = "oReturnId", nullable = false)
    private OrderReturn orderReturn;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "carId", referencedColumnName = "regNo", nullable = false)
    private Car car;
}
