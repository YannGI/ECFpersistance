package com.YannGI.ECFpersistance.Service;

import com.YannGI.ECFpersistance.model.User;
import com.YannGI.ECFpersistance.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public User createUser (User user)
    {
        return userRepository.save(user);
    }

    public List<User> findUserByGender(String gender)
    {
        return userRepository.findUserByGender(gender);
    }

    public void deleteUser(Integer id)
    {
        userRepository.deleteById(id);
    }

    public User findUserById(int id)
    {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid teacher Id:" + id));
    }

    public User updateUser(User user, Integer id)
    {
        user.setId(id);
        return userRepository.save(user);
    }
}
