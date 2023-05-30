package com.example.resource;

import com.example.document.Users;
import com.example.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsersResource {

    private UserRepository userRepository;

    public UsersResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public List<Users> getAll() {
        return userRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Users> getById(@PathVariable Integer id) {
        return userRepository.findById(id);
    }
}
