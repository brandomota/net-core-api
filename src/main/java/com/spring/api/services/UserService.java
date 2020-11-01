package com.spring.api.services;

import com.spring.api.models.User;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService implements IUserService {
    @Override
    public Set<User> getUsers() {
        return null;
    }

    @Override
    public User getUserById(@NonNull Long id) {
        return null;
    }
}
