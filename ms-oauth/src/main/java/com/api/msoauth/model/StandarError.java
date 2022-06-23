package com.api.msoauth.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class StandarError implements Serializable {
    private LocalDateTime localDateTime;
    private Integer status;
    private String message;
    private String path;
}
