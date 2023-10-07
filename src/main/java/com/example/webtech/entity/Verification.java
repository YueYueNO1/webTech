package com.example.webtech.entity;


import com.mysql.cj.jdbc.Blob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Verification {
    private String id;
    private String code;
    private Blob image;
}
