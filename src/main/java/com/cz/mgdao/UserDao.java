package com.cz.mgdao;

import java.util.List;

import com.cz.entity.User;

public interface UserDao {
   public void saveUser(User user);
   public List<User> getUsers();
}
