package com.example.newproject.Service;

import com.example.newproject.model.Role;
import com.example.newproject.model.User;
import com.example.newproject.repository.RoleRepository;
import com.example.newproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public User findOrCreateUser(String email) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            user = new User();
            user.setEmail(email);
            Role role = roleRepository.findByName("ROLE_ADMIN");
            if (role == null) {
                role = new Role();
                role.setName("ROLE_ADMIN");
                roleRepository.save(role);
            }
            user.setRoles(Set.of(role));
            userRepository.save(user);
        }
        return user;
    }
}
