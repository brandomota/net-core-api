package com.spring.api.models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
@Entity
@Table(schema = "public", name = "users")
@EqualsAndHashCode(callSuper = true)
public class User extends BaseModel {

    @NotNull
    @Max(100)
    private String name;

    @NotNull
    @Max(100)
    private String email;

    private Date lastLogin;

}
