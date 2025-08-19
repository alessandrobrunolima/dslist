package com.abl.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abl.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	// Custom query methods can be defined here if needed
	// For example:
	// List<Game> findByTitleContainingIgnoreCase(String title);

}
