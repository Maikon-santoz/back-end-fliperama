package com.generation.fliperamagames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
	@Table(name = "tb_valores")
	public class Valores {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@NotNull(message = "O Atributo Descrição é obrigatório")
		private Double valor;
		
		@OneToMany(mappedBy = "valores", cascade = CascadeType.REMOVE)
		@JsonIgnoreProperties("valores")
		private List<Jogos>jogos;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Double getValor() {
			return valor;
		}

		public void setValor(Double valor) {
			this.valor = valor;
		}

		public List<Jogos> getJogos() {
			return jogos;
		}

		public void setJogos(List<Jogos> jogos) {
			this.jogos = jogos;
		}
}

