package lk.scodelabs.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Orders {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderId;
    private String dateTime;
    private String returnDate;
    private boolean bankSlip;
    private double lossDamage;
    private double status;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "cusId", referencedColumnName = "nic", nullable = false)
    private Customer customer;

    @OneToOne(mappedBy = "orders")
    private Payment payment;

//    @OneToOne(mappedBy = "orders")
//    private OrderReturn orderReturn;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "carId", referencedColumnName = "regNo", nullable = false)
    private Car car;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "driverId", referencedColumnName = "driverId", nullable = false)
    private Driver driver;
}
