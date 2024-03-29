package com.api.msuser.controller;

import com.api.msuser.model.User;
import com.api.msuser.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @GetMapping("{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        log.info("id= {}",id);
        return ResponseEntity.ok().body(userService.findById(id));
    }
    @GetMapping("/email/{email}")
    public ResponseEntity<User> findByEmail(@PathVariable String email) {
        log.info("email= {}",email);
        return ResponseEntity.ok().body(userService.findByEmail(email));
    }
}
