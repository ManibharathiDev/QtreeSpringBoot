package com.demo.demo.dbentity;

import jakarta.persistence.*;

@Entity
@Table(name = "theatres")
public class Theatres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    private String location;
}
