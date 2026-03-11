package com.pertemuan3.ktpserver.service;

import com.pertemuan3.ktpserver.model.Ktp;
import com.pertemuan3.ktpserver.repository.KtpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KtpService {

    @Autowired
    private KtpRepository ktpRepository;

    public Ktp createKtp(Ktp ktp) {
        return ktpRepository.save(ktp);
    }

    public List<Ktp> getAllKtp() {
        return ktpRepository.findAll();
    }

    public Ktp getKtpById(Integer id) {
        return ktpRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));
    }

    public Ktp updateKtp(Integer id, Ktp details) {
        Ktp ktp = getKtpById(id);
        ktp.setNomorKtp(details.getNomorKtp());
        ktp.setNamaLengkap(details.getNamaLengkap());
        ktp.setAlamat(details.getAlamat());
        ktp.setTanggalLahir(details.getTanggalLahir());
        ktp.setJenisKelamin(details.getJenisKelamin());
        return ktpRepository.save(ktp);
    }

    public void deleteKtp(Integer id) {
        ktpRepository.deleteById(id);
    }
}
