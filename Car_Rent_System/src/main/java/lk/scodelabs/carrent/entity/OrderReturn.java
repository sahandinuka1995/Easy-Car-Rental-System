package lk.scodelabs.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class OrderReturn {
    @Id
    private String oReturnId;
    private String date;
    private double usedKm;

    @OneToOne(mappedBy = "orderReturn")
    private Orders orders;
}
