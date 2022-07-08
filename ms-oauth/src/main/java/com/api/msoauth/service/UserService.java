package com.api.msoauth.service;

import com.api.msoauth.model.User;
import com.api.msoauth.model.exceptions.ObjectException;
import com.api.msoauth.model.exceptions.ObjectInternalErrorExcption;
import com.api.msoauth.repository.UserFeignCliente;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService implements UserDetailsService {
    private final UserFeignCliente userFeignCliente;

    public User findByEmail(String email){

        try{
            User user=userFeignCliente.findByEmail(email).getBody();
            log.info("o que evm {}",user);
            return user;
        }catch (FeignException e){
            log.info("caiu aqui {}",e.toString());
            throw new ObjectException(e);
        }catch (RuntimeException e){
            log.info("erro 500 {}",e.toString());
            throw new ObjectInternalErrorExcption(e.getMessage());
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try{
            User user=userFeignCliente.findByEmail(username).getBody();
            log.info("o que evm {}",user);
            return user;
        }catch (FeignException e){
            log.info("exception Feign {}",e.toString());
            throw new ObjectException(e);
        }catch (RuntimeException e){
            log.info("tratar erro {}",e.toString());
            throw new ObjectInternalErrorExcption(e.getMessage());
        }
    }
}
