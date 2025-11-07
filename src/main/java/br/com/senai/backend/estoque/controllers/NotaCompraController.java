package br.com.senai.backend.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.backend.estoque.models.NotaCompra;
import br.com.senai.backend.estoque.services.NotaCompraService;

@RestController
@RequestMapping("/nota_compra")
public class NotaCompraController {
    @Autowired
    private NotaCompraService ncService;
    
   @GetMapping("/teste")
   public String teste(){
        return "Consegui, nota!";
   }
     @PostMapping("/salvar")
    public NotaCompra salvar(@RequestBody NotaCompra notacompra) {
        return ncService.salvar(notacompra);
    }
        }
