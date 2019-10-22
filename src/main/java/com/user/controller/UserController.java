package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.expenditure.commons.tos.ExpensesTo;
import com.expenditure.commons.tos.UserTo;
import com.expenditure.commons.urlconstants.ExpenditureURLs;
import com.user.exception.UserNotFound;
import com.user.mapper.UserMapper;
import com.user.service.UserSevice;

@RestController
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserSevice userSevice;

	@PostMapping(ExpenditureURLs.ADD_USER)
	private UserTo addExpenses(@RequestBody UserTo userTo) {
		return userMapper
				.userToUserTo(userSevice.create(userMapper.userToToUser((userTo))));

	}

	@GetMapping(ExpenditureURLs.GET_ALL_USER)
	private List<UserTo> getAllExpenses() {
		return userMapper
				.userToUserTo(userSevice.getAllUsers());

	}
	
	@GetMapping(ExpenditureURLs.GET_USER)
	private UserTo getExpense(@RequestParam(value=ExpenditureURLs.Params.USER_ID) final String userId) throws UserNotFound {
		return userMapper
				.userToUserTo(userSevice.getUser(userId));

	}
}
