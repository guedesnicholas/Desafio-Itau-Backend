package com.nicholas.desafio_itau_backend.resources;


import com.nicholas.desafio_itau_backend.domain.Transacao;
import com.nicholas.desafio_itau_backend.services.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/transacao")
public class TransacaoResource {

    @Autowired
    private TransacaoService service;


    @PostMapping
    public ResponseEntity<Transacao> insert(@RequestBody Transacao obj){
        obj = service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }

}
