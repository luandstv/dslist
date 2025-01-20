package com.alvesluan.dslist.repositories;

import com.alvesluan.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository  extends JpaRepository<Game, Long> {

}
