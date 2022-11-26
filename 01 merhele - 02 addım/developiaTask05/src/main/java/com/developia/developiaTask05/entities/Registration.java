package com.developia.developiaTask05.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    public int id;

    @Column(name = "name",nullable = false)
    public String name;

    @Column(name = "surname",nullable = false)
    public String surname;

    @Column(name = "birth",nullable = false)
    public LocalDate birth;
}
