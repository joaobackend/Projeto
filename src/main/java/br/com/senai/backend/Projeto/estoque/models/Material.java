package br.com.senai.backend.Projeto.estoque.models;

import jakarta.persistence.Entity;

@Entity
public class Material {
   private Integer id; 
   private String nome; 
   private String marca;
   private int ano_fabricacao;



}
