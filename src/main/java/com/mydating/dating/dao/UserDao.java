package com.mydating.dating.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mydating.dating.entity.User;
import com.mydating.dating.repository.UserRepository;
import com.mydating.dating.util.UserGender;

@Repository
public class UserDao {

	@Autowired
	UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}

	public List<User> findAllMaleUsers() {
		return repository.findByGender(UserGender.MALE);
	}

	public List<User> findAllFemaleUsers() {
		return repository.findByGender(UserGender.FEMALE);
	}

	public Optional<User> findUserById(int id) {
		return repository.findById(id);
	}

	public List<User> searchByName(String letters) {
		return repository.searchByName(letters);
	}

	public List<User> searchByEmail(String letters) {
		return repository.searchByEmail(letters);
	}
}
