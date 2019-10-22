/**
 * 
 */
package com.user.serviceimpl;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.expenditure.commons.exceptionmessage.ExceptionMessage;
import com.user.exception.UserNotFound;
import com.user.models.User;
import com.user.service.UserSevice;

/**
 * @author bharath.kk
 *
 */
@Service
public class UserSeviceImpl implements UserSevice {

	private List<User> inMemory = new ArrayList<User>();;
	private final String userName = "test-user";

	@Override
	public User create(User user) {

		user.setCreatedBy(userName);
		user.setUserName(UUID.randomUUID().toString());
		inMemory.add(user);
		return user;
	}

	@Override
	public List<User> getAllUsers() {

		return inMemory;
	}

	@Override
	public User getUser(String userId) throws UserNotFound {
		
		Optional<User> expense=inMemory.stream().filter(x->x.getUserId().equals(userId)).findFirst();
		
		if(expense.isPresent()) {
			
			return expense.get();
		}else {
			throw new UserNotFound(ExceptionMessage.EXPENSE_NOT_FOUND);
		} 
		

	}

}
