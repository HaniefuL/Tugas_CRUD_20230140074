package com.pertemuan3.ktpserver.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ktp")
public class Ktp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}