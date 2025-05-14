package com.chaukidaari.doorapp.Controller;

import com.chaukidaari.doorapp.Entity.Users;
import com.chaukidaari.doorapp.Entity.students;
import com.chaukidaari.doorapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;


    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return service.register(user);

    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {

        return service.verify(user);
    }

    private List<students> student = new ArrayList<>(
            List.of(
                    new students(1, "Navin", 60),
                    new students(2, "Kiran", 65)
            ));


    @GetMapping("/students")
    public List<students> getStudents() {
        return student;
    }

}