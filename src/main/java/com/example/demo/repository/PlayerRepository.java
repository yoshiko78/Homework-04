package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

	Player findOne(Long id);

	void delete(Long id);

}
