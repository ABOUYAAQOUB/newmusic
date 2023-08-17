package com.newmusic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newmusic.Model.Reaction;

public interface ReactionRepository extends JpaRepository<Reaction, Long>{

}
