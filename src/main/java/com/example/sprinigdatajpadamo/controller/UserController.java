package com.example.sprinigdatajpadamo.controller;

import com.example.sprinigdatajpadamo.domain.User;
import com.example.sprinigdatajpadamo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/add")
    public void addNewUser(@RequestParam String name, @RequestParam String email) {
        User u = User.builder().name(name).email(email).build();
        userRepository.save(u);
    }

    @GetMapping("/all")
    @ResponseBody
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/page")
    @ResponseBody
    public Page<User> getAllUserPage() {
        return userRepository.findAll(PageRequest.of(0, 20,
                Sort.by(new Sort.Order(Sort.Direction.ASC, "name"))));
    }

    @GetMapping("/sort")
    @ResponseBody
    public Iterable<User> getAllUsersWithSort() {
        return userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
    }

    @GetMapping("/info")
    @ResponseBody
    public User findOne(@RequestParam Long id) {
        return userRepository.findById(id).orElse(new User());
    }

    @GetMapping("/delete")
    public void deleteOne(@RequestParam Long id) {
        userRepository.deleteById(id);
    }
}
