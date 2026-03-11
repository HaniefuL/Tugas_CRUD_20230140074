package com.pertemuan3.ktpserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ktp")
public class KtpController {

    @Autowired
    private KtpService ktpService;

    @PostMapping
    public Ktp create(@RequestBody Ktp ktp) {
        return ktpService.createKtp(ktp);
    }

    @GetMapping
    public List<Ktp> getAll() {
        return ktpService.getAllKtp();
    }

    @GetMapping("/{id}")
    public Ktp getById(@PathVariable Integer id) {
        return ktpService.getKtpById(id);
    }

    @PutMapping("/{id}")
    public Ktp update(@PathVariable Integer id, @RequestBody Ktp ktp) {
        return ktpService.updateKtp(id, ktp);
    }

}
