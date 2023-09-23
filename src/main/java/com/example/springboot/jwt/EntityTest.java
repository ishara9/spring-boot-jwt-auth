package com.example.springboot.jwt;


import org.hibernate.annotations.ColumnTransformer;

import javax.persistence.Entity;

@Entity
public class EntityTest {

    @ColumnTransformer(
            read = "AES_DECRYPT(name, 'your-secret-key')",
            write = "AES_ENCRYPT(?, 'your-secret-key')"
    )
    private String name;
}
