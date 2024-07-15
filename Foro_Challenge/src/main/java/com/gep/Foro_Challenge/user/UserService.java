package com.gep.Foro_Challenge.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> listUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }
}
