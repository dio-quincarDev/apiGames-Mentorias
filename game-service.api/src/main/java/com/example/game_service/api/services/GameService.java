package com.example.game_service.api.services;

import com.example.game_service.api.commons.entities.Game;


public interface GameService {
     Game saveGame(Game gameRequest);
     Game getGameById(String id);
}

