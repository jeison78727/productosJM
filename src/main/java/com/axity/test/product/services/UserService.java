package com.axity.test.product.services;

import com.axity.test.product.repository.UserRepository;
import com.axity.test.product.repository.datamodel.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getUsers")
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/createUser")
    public UserEntity addUser(@RequestBody UserEntity user) {
        return userRepository.save(user);
    }

    @PutMapping("/updateUser/{id_user}")
    public UserEntity updateUser(@PathVariable int id_user, @RequestBody UserEntity user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/deleteUser/{id_user}")
    public void deleteUser(@PathVariable int id_user) {
        userRepository.deleteById(id_user);
    }
}
