package com.user.service;

import java.util.List;
import java.util.Optional;

import com.user.exception.UserNotFound;
import com.user.models.User;

public interface UserSevice {
	
	User create(User user);
	List<User> getAllUsers();
	User getUser(String expenseId) throws UserNotFound;

}
