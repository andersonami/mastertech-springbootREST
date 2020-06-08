package com.itau.SpringBootREST.web;

import com.itau.SpringBootREST.service.Investimento;
import com.itau.SpringBootREST.service.ServiceInvestimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ControllerInvestimento {

    @Autowired
    private ServiceInvestimento serviceInvestimento;

    @GetMapping("/Test")
    public String teste(){
        return "Hello World ! Im alive ! " ;
    }

    @PostMapping("/Investimento")
    public Investimento simularInvestimento(@RequestBody Investimento dadosEntrada){
        dadosEntrada.setValorFinal(serviceInvestimento.simular(dadosEntrada));
        return dadosEntrada;
    }

}
