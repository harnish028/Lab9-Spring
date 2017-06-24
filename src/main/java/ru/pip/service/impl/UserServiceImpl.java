package ru.pip.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pip.entity.User;
import ru.pip.repository.UserRepository;
import ru.pip.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user) {
        User savedUser = userRepository.saveAndFlush(user);

        return savedUser;
    }

    public void delete(long id) {
        userRepository.delete(id);
    }

    public User getUser(long id) {
        return userRepository.findOne(id);
    }

    /*public User getByName(User user) {
        return userRepository.findByName
    }*/
}
