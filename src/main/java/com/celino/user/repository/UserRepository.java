package com.celino.user.repository;

import com.celino.user.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author Oliver Celino <celinoo@ph.ibm.com>
 * Date: 8/22/23
 */
@Repository
public class UserRepository {
    public User findUserByEmail(String email){
        User user = new User(email,"123456");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        return user;
    }
}
