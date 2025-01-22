package com.hugocunhadiniz.dslist.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hugocunhadiniz.dslist.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long> {

}
