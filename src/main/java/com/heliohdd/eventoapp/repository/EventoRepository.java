package com.heliohdd.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.heliohdd.eventoapp.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long> {
	Evento findByCodigo(Long codigo);
}