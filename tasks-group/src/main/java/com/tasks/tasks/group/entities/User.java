package com.tasks.tasks.group.entities;

import javax.persistence.*;

@Entity
@Table(name = "TB_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String senha;

}
