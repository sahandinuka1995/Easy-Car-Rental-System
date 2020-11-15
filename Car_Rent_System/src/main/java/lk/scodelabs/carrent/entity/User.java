package lk.scodelabs.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User {
    @Id
    private String email;
    private String password;
    private String role;
    private String lastLogged;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nic", referencedColumnName = "nic", nullable = false)
    private Customer cusId;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Driver driverId;
}
