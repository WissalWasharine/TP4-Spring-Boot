package com.washarine.users.service;

import org.springframework.stereotype.Service;

import com.washarine.users.entities.Role;
import com.washarine.users.entities.User;


public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
