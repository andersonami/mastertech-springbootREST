package com.itau.SpringBootREST.web;

import com.itau.SpringBootREST.persistence.Investimento;
import com.itau.SpringBootREST.service.ServiceInvestimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ControllerInvestimento {

    @Autowired
    private ServiceInvestimento serviceInvestimento;

    public List<Investimento> getAll(){
        return serviceInvestimento.getAll();
    }


    @GetMapping("/about")
    public String about(){
        return "Hello World ! Im alive ! Version 0.0.2" ;
    }

    @PostMapping("/Investimento")
    public Investimento simularInvestimento(@RequestBody Investimento dadosEntrada){
        dadosEntrada.setValorFinal(serviceInvestimento.simular(dadosEntrada));
        return serviceInvestimento.create(dadosEntrada);
    }

}
