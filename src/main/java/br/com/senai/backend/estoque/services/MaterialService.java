package br.com.senai.backend.estoque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.backend.estoque.models.Material;
import br.com.senai.backend.estoque.repositories.MaterialRepository;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepository matRep;

    public Material salvar(Material material){
        return matRep.save(material);
    }
}
