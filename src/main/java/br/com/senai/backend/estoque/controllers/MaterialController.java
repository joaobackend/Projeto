package br.com.senai.backend.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.senai.backend.estoque.models.Material;
import br.com.senai.backend.estoque.services.MaterialService;

@RestController
@RequestMapping("/material")
public class MaterialController {
    @Autowired
    private MaterialService mService;

   @GetMapping("/teste")
   public String teste(){
        return "Consegui, material!";
    }
     @PostMapping("/salvar")
    public Material salvar(@RequestBody Material material) {
        return mService.salvar(material);
    }
}
