package lk.scodelabs.carrent.service.impl;

import lk.scodelabs.carrent.dto.UserDTO;
import lk.scodelabs.carrent.entity.User;
import lk.scodelabs.carrent.repo.UserRepo;
import lk.scodelabs.carrent.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    UserRepo userRepo;

    @Override
    public void saveUser(UserDTO dto) {
        if (!userRepo.existsById(dto.getEmail())) {
            userRepo.save(modelMapper.map(dto, User.class));
        } else {
            throw new RuntimeException("User Already Exist!");
        }
    }

    @Override
    public void updateUser(UserDTO dto) {
        if (userRepo.existsById(dto.getEmail())) {
            userRepo.save(modelMapper.map(dto, User.class));
        } else {
            throw new RuntimeException("User Not Found!");
        }
    }

    @Override
    public UserDTO searchUser(String id) {
        Optional<User> user = userRepo.findById(id);
        if (user.isPresent()) {
            return modelMapper.map(user.get(), UserDTO.class);
        } else {
            throw new RuntimeException("User does not exist!");
        }
    }

    @Override
    public void deleteUser(String id) {
        if (userRepo.existsById(id)) {
            userRepo.deleteById(id);
        } else {
            throw new RuntimeException("Couldn't to delete User!");
        }
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return modelMapper.map(userRepo.findAll(), new TypeToken<List<UserDTO>>() {
        }.getType());
    }

    @Override
    public UserDTO userLogin(String email, String pass) {
        Optional<User> byId = userRepo.findById(email);
        User user = byId.get();
        UserDTO map = modelMapper.map(byId.get(), UserDTO.class);

        if (user.getEmail().equals(email) & user.getPassword().equals(pass)) {
            map.setPassword(null);
            return map;
        } else {
            return null;
        }
    }
}
