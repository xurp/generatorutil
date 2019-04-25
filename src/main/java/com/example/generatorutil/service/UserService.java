package com.example.generatorutil.service;

import com.example.generatorutil.model.UserCopy;

public interface UserService {
UserCopy select(int id);
void insert(UserCopy userCopy);
}
