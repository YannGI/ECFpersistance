package com.YannGI.ECFpersistance.controller;

import com.YannGI.ECFpersistance.Service.UserService;
import com.YannGI.ECFpersistance.model.User;
import com.YannGI.ECFpersistance.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@Controller
public class UserController
{
    private final UserRepository userRepository;
    private final UserService userService;
    public UserController(UserRepository userRepository, UserService userService)
    {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }

    @GetMapping("/femme")
    public List<User> findUserByGender(@RequestParam (name = "gender") String gender)
    {
        return userService.findUserByGender(gender);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam(name = "id") Integer id)
    {
        userService.deleteUser(id);
    }

    @GetMapping("/findId")
    public User findUserById(@RequestParam(name = "id") int id)
    {
        // Teacher teacher = null;
        return userService.findUserById(id);
    }

    @PutMapping("/update")
    public void updateUser(@RequestParam(name = "id") Integer id, @RequestBody User user){
        userService.updateUser(user, id);
    }
}
