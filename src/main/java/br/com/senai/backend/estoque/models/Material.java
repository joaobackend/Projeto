package br.com.senai.backend.estoque.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table
@Entity
public class Material {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="id")
   private Integer id;

   @Column(name="nome") 
   private String nome;
   
   @Column(name="marca")
   private String marca;

   @Column(name="ano_fabricacao")
   private int anoFabricacao;

   public Material(){

   }

      public Material(int ano_fabricacao, Integer id, String marca, )

}
