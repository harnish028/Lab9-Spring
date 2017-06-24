package ru.pip.service;

import ru.pip.entity.User;

public interface UserService {

    User addUser(User user);
    void delete(long id);
    User getUser(long id);
//    User getByNickname(User user);
}
