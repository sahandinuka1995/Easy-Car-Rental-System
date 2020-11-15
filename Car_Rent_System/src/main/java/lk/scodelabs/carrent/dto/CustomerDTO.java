package lk.scodelabs.carrent.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class CustomerDTO {
    private String nic;
    private boolean nicPhoto;
    private String address;
    private String contact;

    ///
//    private User user;
//    private List<Orders> orders = new ArrayList<>();
//
//    public CustomerDTO(String nic, boolean nicPhoto, String address, String contact, String email) {
//        this.nic = nic;
//        this.nicPhoto = nicPhoto;
//        this.address = address;
//        this.contact = contact;
//        this.email = email;

}
