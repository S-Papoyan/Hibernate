package com.service;

import com.model.User;
import com.repository.jparepository.UserJpaRepository;
import java.util.List;

public class UserService {
    public static void main(String[] args) {

        UserJpaRepository userJpaRepository = new UserJpaRepository();
        List<User> all = userJpaRepository.getAll();
        System.out.println(all);

    }
}
