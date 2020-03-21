package com.lrm.service;

import com.lrm.po.User;

/**
 * Created by limi on .
 */
public interface UserService {

    User checkUser(String username, String password);
}
