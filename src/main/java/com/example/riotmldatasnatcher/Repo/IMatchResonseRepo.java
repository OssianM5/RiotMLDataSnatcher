package com.example.riotmldatasnatcher.Repo;


import com.example.riotmldatasnatcher.Entity.MatchResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface IMatchResonseRepo extends JpaRepository<MatchResponse,Integer> {
    MatchResponse findMatchResponseByMatchID(String matchID);
}
