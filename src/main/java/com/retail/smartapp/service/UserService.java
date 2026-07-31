package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.User;
import com.retail.smartapp.repo.UserRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	@Autowired
	private UserRepo userRepo;
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	public Optional<User> getUserById(Long id){
		return userRepo.findById(id);
	}
	public User CreateUser(User user) {
		return userRepo.save(user);
	}
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}
}

