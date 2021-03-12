package com.cz.mgservies;

import java.util.List;

import com.cz.entity.User;

public interface UserServies {
   public void saveUser(User user);
   public List<User> getUsers();
}
