package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.User;
import com.retail.smartapp.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    // GET - Get All Users
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    // GET - Get User By ID
    public Optional<User> getUserById(Long id) {
        return userRepo.findById(id);
    }

    // POST - Create User
    public User CreateUser(User user) {
        return userRepo.save(user);
    }

    // PUT - Update User
    public User updateUser(Long id, User user) {

        User existingUser = userRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException(
                        "User not found with id: " + id));

        // Update User fields here
        // Example:
        // existingUser.setName(user.getName());
        // existingUser.setEmail(user.getEmail());
        // existingUser.setPhone(user.getPhone());

        return userRepo.save(existingUser);
    }

    // DELETE - Delete User
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}