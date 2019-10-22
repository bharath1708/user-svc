package com.user.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.expenditure.commons.tos.ExpensesTo;
import com.expenditure.commons.tos.UserTo;
import com.user.models.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

	UserTo userToUserTo(User user);

	User userToToUser(UserTo userTo);

	List<UserTo> userToUserTo(List<User> user);
}
