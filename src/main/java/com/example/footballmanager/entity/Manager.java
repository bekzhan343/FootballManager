package com.example.footballmanager.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "football_managers")
@AllArgsConstructor
@NoArgsConstructor
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "fullName")
    private String fullName;

    @Column(name = "league")
    private String league;

    @Column(name = "club")
    private String club;
}
