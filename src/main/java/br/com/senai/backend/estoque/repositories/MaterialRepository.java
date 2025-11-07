package br.com.senai.backend.estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.backend.estoque.models.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer>{

}