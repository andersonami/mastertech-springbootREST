package com.itau.SpringBootREST.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceInvestimento {

    public double simular(Investimento dadosentrada) {
        //prazo em meses
        //taxa em percentual ao ano
        double fator = 0;
        fator = 1 + (dadosentrada.getTaxa()/100);
        fator = Math.pow(fator, (dadosentrada.getPrazo())/12 );
        return dadosentrada.getValorInicial()*fator ;
    }
}
