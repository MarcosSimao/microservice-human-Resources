package com.api.msoauth.repository;

import com.api.msoauth.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("ms-user")
public interface UserFeignCliente {

    @GetMapping("/users/email/{email}")
    ResponseEntity<User> findByEmail(@PathVariable String email);
}
