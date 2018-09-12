package com.bonaparte.interfac;

import com.bonaparte.bean.User;

public interface UserDao {
    User getUser(int id);
    void update(int id, User user);
    void delete(int id);

}