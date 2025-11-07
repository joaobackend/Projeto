package br.com.senai.backend.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.backend.estoque.models.Usuario;
import br.com.senai.backend.estoque.services.UsuarioService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @GetMapping("/teste")
    public String teste(){
        return "Consegui, usuario!";
    }
          @Autowired
    private UsuarioService uService;

    @PostMapping("/salvar")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return uService.salvar(usuario);
    }

}
