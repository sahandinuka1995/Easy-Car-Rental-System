package lk.scodelabs.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {
    private String nic;
    private boolean nicPhoto;
    private String address;
    private String contact;
}
