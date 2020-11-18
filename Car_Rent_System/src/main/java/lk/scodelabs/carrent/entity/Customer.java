package lk.scodelabs.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class Customer {
    @Id
    private String nic;
    private boolean nicPhoto;
    private String address;
    private String contact;

    @OneToMany(mappedBy = "customer")
    private List<Orders> orders = new ArrayList<>();
}
