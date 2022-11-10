package com.example.assignment3.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

@Autowired
private UserRepo u3;

public User saveUser(User u1)
{
    return u3.save(u1);

}





    public List<User> getUser() {
        return u3.findAll();

    }

    public User updateUser(User u1) {
    return u3.save(u1);
    }

    public void deleteUser(String userId) {
    u3.deleteById(userId);
    }

    public Album saveAlbum(Album al) {
    return u3.save(al);
    }
}
