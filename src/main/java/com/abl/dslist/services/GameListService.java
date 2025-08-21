package com.abl.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abl.dslist.dto.GameListDTO;
import com.abl.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		return gameListRepository.findAll().stream()
				.map(game -> new GameListDTO(game))
				.toList();
	}
}
