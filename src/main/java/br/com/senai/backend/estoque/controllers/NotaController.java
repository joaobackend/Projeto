package br.com.senai.backend.estoque.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nota")
public class NotaController {
   @GetMapping("/teste")
   public String teste(){
        return "Consegui, nota!";
    }


}
