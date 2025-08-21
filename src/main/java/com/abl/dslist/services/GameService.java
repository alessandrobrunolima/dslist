package com.abl.dslist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abl.dslist.dto.GameDTO;
import com.abl.dslist.dto.GameMinDTO;
import com.abl.dslist.entities.Game;
import com.abl.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		return gameRepository.findAll().stream()
				.map(game -> new GameMinDTO(game))
				.toList();
	}

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Optional<Game> game = gameRepository.findById(id);
		if (!game.isPresent()) {
			throw new RuntimeException("Game not found");
		}
		return new GameDTO(game.get());
	}

}
