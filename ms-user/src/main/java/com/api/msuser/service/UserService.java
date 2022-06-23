package com.api.msuser.service;

import com.api.msuser.model.User;
import com.api.msuser.model.exception.ObjectNotFoundException;
import com.api.msuser.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
   private final UserRepository userRepository;

   public User findById(Long id){
       Optional<User> user=userRepository.findById(id);
       if(!user.isPresent()){
           throw new ObjectNotFoundException("Usuario nao encontrado ");
       }
       return user.get();
   }

   public User findByEmail(String email){
       Optional<User> user=userRepository.findByEmail(email);
       if(!user.isPresent()){
           throw new ObjectNotFoundException("Usuario nao encontrado ");
       }
       return user.get();
   }
    
}
