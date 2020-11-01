package com.spring.api.services;

import com.spring.api.models.User;
import lombok.NonNull;

import java.util.Set;

public interface IUserService {
    Set<User> getUsers();
    User getUserById(@NonNull Long id);

}
