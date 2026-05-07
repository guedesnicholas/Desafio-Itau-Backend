package com.nicholas.desafio_itau_backend.services;

import com.nicholas.desafio_itau_backend.domain.Transacao;
import com.nicholas.desafio_itau_backend.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository repo;


    public Transacao insert(Transacao obj){
        return repo.insert(obj);
    }

}
