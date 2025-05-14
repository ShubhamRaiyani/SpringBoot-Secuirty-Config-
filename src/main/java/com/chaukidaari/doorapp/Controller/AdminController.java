package com.chaukidaari.doorapp.Controller;


import com.chaukidaari.doorapp.Entity.students;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.List;
@RestController
public class AdminController {



    @GetMapping
    public String welcome(HttpServletRequest request){
        return "Hello admins!!!" + request.getSession().getId();
    }
    @GetMapping("/csrf")
    public CsrfToken  csrfToken(HttpServletRequest req){
        return (CsrfToken) req.getAttribute("_csrf");
    }

    @PostMapping
    public List<students> create(@RequestBody students stu){
        studentsList.add(stu);
        return studentsList;
    }

    List<students> studentsList = new ArrayList<>(List.of(
            new students(1,"sing",23)
    ));
}
