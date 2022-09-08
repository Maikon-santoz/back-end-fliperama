package com.generation.fliperamagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.fliperamagames.model.Jogos;
@Repository
public interface JogosRepository extends JpaRepository<Jogos,Long>{
	
	public List <Jogos>findAllByNomeContainingIgnoreCase(@Param("nome")String nome);

}
