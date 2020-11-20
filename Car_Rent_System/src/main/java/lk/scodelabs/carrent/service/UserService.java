package lk.scodelabs.carrent.service;

import lk.scodelabs.carrent.dto.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO dto);

    void updateUser(UserDTO dto);

    UserDTO searchUser(String id);

    void deleteUser(String id);

    List<UserDTO> getAllUsers();

    boolean userLogin(String email, String pass);
}
