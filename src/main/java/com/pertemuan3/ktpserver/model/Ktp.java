package com.pertemuan3.ktpserver.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "ktp")
public class Ktp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Nomor KTP wajib diisi")
    @Column(unique = true)
    private String nomorKtp;
}