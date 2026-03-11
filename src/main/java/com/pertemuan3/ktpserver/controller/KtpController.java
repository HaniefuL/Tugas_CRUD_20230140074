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
}
