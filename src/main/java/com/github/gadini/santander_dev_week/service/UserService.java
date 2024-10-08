package com.github.gadini.santander_dev_week.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.github.gadini.santander_dev_week.model.User;
import com.github.gadini.santander_dev_week.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	public java.util.List<User> list(){
        return userRepository.findAll();
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public boolean existsById(Long id) {
        return userRepository.existsById(id);
    }

    public void delete(Long id) {
    	userRepository.deleteById(id);
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
	
}
