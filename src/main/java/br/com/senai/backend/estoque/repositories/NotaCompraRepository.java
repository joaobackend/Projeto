package br.com.senai.backend.estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.backend.estoque.models.NotaCompra;

@Repository
public interface NotaCompraRepository extends JpaRepository<NotaCompra, Integer>{
    
    
}