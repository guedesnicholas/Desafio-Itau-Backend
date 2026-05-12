package com.nicholas.desafio_itau_backend.domain;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

import java.time.OffsetDateTime;


public class Transacao {

    @Positive
    @NotNull
    @Min(1)
    private double valor;


    @PastOrPresent
    @NotNull
    private OffsetDateTime dataHora;

    public Transacao(){

    }

    public Transacao(double valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
