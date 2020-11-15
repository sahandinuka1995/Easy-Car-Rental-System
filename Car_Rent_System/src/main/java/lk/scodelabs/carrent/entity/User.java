package lk.scodelabs.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    private String email;
    private String password;
    private String role;
    private String lastLogged;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Customer cusId;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Driver driverId;
}
