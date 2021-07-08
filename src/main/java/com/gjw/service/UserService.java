package com.gjw.service;

import com.gjw.bean.User;

import java.util.List;

public interface UserService {

    List<User> queryAllUser();

    User queryUserByID(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUserByID(int id);

}
