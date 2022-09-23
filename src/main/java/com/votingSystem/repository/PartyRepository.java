package com.votingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.votingSystem.entity.PartyEntity;

@Repository
public interface PartyRepository extends JpaRepository<PartyEntity,Integer>{

}
