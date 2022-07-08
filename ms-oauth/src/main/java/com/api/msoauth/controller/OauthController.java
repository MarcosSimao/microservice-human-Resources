package com.api.msoauth.controller;

import com.api.msoauth.model.User;
import com.api.msoauth.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/oauth-user")
@RequiredArgsConstructor
@Slf4j
public class OauthController {
    private final UserService userService;
    @GetMapping()
    public String bemvindo() {
        return "bem vindo";
    }
    @GetMapping("/email/{email}")
    public ResponseEntity<User> findByEmail(@PathVariable String email) {
        log.info("email= {}",email);
        return ResponseEntity.ok().body(userService.findByEmail(email));
    }

}
