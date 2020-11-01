package com.spring.api.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotNull
    public Date createdAt;

    public Date updatedAt;

    @NotNull
    public boolean deleted;

    public BaseModel() {
        this.createdAt = new Date();
    }
}
