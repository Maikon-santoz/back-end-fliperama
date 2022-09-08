package com.generation.fliperamagames.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


	@Entity
	@Table (name = "tb_jogos")
	public class Jogos{
			@Id
			@GeneratedValue (strategy = GenerationType.IDENTITY)
			private Long id;
			
			
			@NotBlank(message = " O nome do produto é Obrigatório!")
			@Size(min = 2, max = 100, message = " O atributo nome deve conter no minimo 2 e no máximo 1000 caracteres")
			private String nome;
			
			@NotBlank(message = " A descrição do produto é Obrigatório!")
			@Size(min = 2, max = 100, message = " A descrição deve conter no minimo 10 e no máximo 1000 caracteres")
			private String genero;
			
			@NotNull
			private double quantidade;
			@UpdateTimestamp
			private LocalDateTime data;
			@ManyToOne
			@JsonIgnoreProperties ("jogos")
			private Valores valores ;
			public Valores getValores() {
				return valores;
			}
			public void setValores(Valores valores) {
				this.valores = valores;
			}
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getGenero() {
				return genero;
			}
			public void setGenero(String genero) {
				this.genero = genero;
			}
			public double getQuantidade() {
				return quantidade;
			}
			public void setQuantidade(double quantidade) {
				this.quantidade = quantidade;
			}
			public LocalDateTime getData() {
				return data;
			}
			public void setData(LocalDateTime data) {
				this.data = data;
			}
}
