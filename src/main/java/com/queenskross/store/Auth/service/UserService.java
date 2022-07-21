package com.queenskross.store.Auth.service;

import com.queenskross.store.Auth.model.Role;
import com.queenskross.store.Auth.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String email , String rolename);
    User getUser(String email);
    List<User> getUsers();
}
