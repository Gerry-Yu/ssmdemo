package com.demo.testDao;

/**
 * Created by Pinggang Yu on 2016/9/27.
 */

import com.demo.dao.UserDao;
import com.demo.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.Lifecycle;

import java.util.ArrayList;
import java.util.List;

public class TestUserDao extends BaseTest{
    @Autowired
    private UserDao userDao;  //idea (Setting -> Code Style -> inspections-> Spring -> Severiry change to warning)

    @Test
    public void testSelectAllUsers() {
        ArrayList<User> getAllUsers = userDao.selectAllUsers();
        for (User user : getAllUsers) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void testInsertUser() {
        int flag = userDao.insertUser(1010,"LBY");
        System.out.println(flag);

    }

    @Test
    public void testGetUser() {
        List<User> userList = userDao.getUser(0, 5);
        for (User userIndex:userList) {
            System.out.println(userIndex.toString());
        }
    }
}
