package com.nicholas.desafio_itau_backend.repository;

import com.nicholas.desafio_itau_backend.domain.Transacao;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TransacaoRepository {

    List<Transacao> transacoes = new ArrayList<>();

    public Transacao insert(Transacao obj){
        transacoes.add(obj);
        return obj;
    }

    public void deleteAll(){
        transacoes.clear();
    }

}
