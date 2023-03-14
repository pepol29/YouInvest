package br.com.fiap.YouInvest.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import br.com.fiap.YouInvest.models.Investimento;

@RestController
public class InvestimentoController{

    @GetMapping("/api/investimento")
    @ResponseBody
    public Investimento mostrarInvestimento(){
        return new Investimento(titulos[0],tipoTaxa[1],1.1,30,7,true,0);
    }
}