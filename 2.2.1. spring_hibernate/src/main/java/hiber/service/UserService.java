package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getUsers();
    List<User> getUser(String carName, int carSeries);
}
