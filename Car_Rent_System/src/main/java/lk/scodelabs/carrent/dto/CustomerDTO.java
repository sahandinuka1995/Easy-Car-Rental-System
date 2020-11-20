package lk.scodelabs.carrent.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class CustomerDTO {
    private String nic;
    private String nicPhoto;
    private String address;
    private String contact;

    public CustomerDTO(String nic) {
        this.nic = nic;
    }
}
