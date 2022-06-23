package com.api.msoauth.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {

    private Long id;
    private String nome;
    private String email;
    private String password;
    private Set<Object> role=new HashSet<>();
}
