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
    private String orderId;
    private String dateTime;
    private String returnDate;
    private boolean bankSlip;
    private double lossDamage;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "cusId", referencedColumnName = "nic", nullable = false)
    private Customer customer;

    @OneToOne(mappedBy = "orders", cascade = {CascadeType.ALL})
    private OrderReturn orderReturn;

    @ManyToOne
    @JoinColumn(name = "carId", referencedColumnName = "regNo", nullable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "driverId", referencedColumnName = "driverId", nullable = true)
    private Driver driver;
}
