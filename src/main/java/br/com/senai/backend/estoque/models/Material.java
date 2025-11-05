package br.com.senai.backend.estoque.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="material")
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

   public Material(Integer id, String nome, String marca, int anoFabricacao) {
      this.id = id;
      this.nome = nome;
      this.marca = marca;
      this.anoFabricacao = anoFabricacao;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getMarca() {
      return marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public int getAnoFabricacao() {
      return anoFabricacao;
   }

   public void setAnoFabricacao(int anoFabricacao) {
      this.anoFabricacao = anoFabricacao;
   }

}
