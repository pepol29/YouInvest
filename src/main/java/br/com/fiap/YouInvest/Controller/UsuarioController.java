package br.com.fiap.YouInvest.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import br.com.fiap.YouInvest.models.Usuario;

@RestController
public class UsuarioController{

    @GetMapping("/api/usuario")
    @ResponseBody
    public Usuario mostrarUsuario(){
        return new Usuario("Pedro", "pedrinho@gmail.com",10000, 60000);
    }
}