package com.alvesluan.dslist.services;

import com.alvesluan.dslist.dto.GameMinDTO;
import com.alvesluan.dslist.entities.Game;
import com.alvesluan.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll() {
        List<Game> result = gameRepository.findAll();

        return result;
    }
}
