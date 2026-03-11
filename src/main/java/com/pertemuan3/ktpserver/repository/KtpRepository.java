package com.pertemuan3.ktpserver.repository;

import com.pertemuan3.ktpserver.model.Ktp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KtpRepository extends JpaRepository<Ktp, Integer> {
}