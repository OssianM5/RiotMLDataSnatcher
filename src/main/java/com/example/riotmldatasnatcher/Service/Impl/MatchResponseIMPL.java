package com.example.riotmldatasnatcher.Service.Impl;


import com.example.riotmldatasnatcher.DTO.MatchResponseDTO;
import com.example.riotmldatasnatcher.Entity.MatchResponse;
import com.example.riotmldatasnatcher.Repo.IMatchResonseRepo;
import com.example.riotmldatasnatcher.Service.IMatchResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchResponseIMPL implements IMatchResponseService {

    @Autowired
    private IMatchResonseRepo iMatchResonseRepo;

    @Override
    public String addMatchResponse(MatchResponseDTO matchResponseDTO) {
        MatchResponse matchResponse = new MatchResponse(
                matchResponseDTO.getId(),
                matchResponseDTO.getMatchID(),
                matchResponseDTO.getGameDuration(),
                matchResponseDTO.getGameMode(),
                matchResponseDTO.getGameType(),
                matchResponseDTO.getT1FeatsStateMonster(),
                matchResponseDTO.getT1FeatsStateChampion(),
                matchResponseDTO.getT1FeatsStateTurret(),
                matchResponseDTO.getT1AtakhanKills(),
                matchResponseDTO.getT1AtakhanFirst(),
                matchResponseDTO.getT1BaronKills(),
                matchResponseDTO.getT1BaronFirst(),
                matchResponseDTO.getT1ChampionKills(),
                matchResponseDTO.getT1ChampionFirst(),
                matchResponseDTO.getT1DragonKills(),
                matchResponseDTO.getT1DragonFirst(),
                matchResponseDTO.getT1HordeKills(),
                matchResponseDTO.getT1HordeFirst(),
                matchResponseDTO.getT1InhibitorKills(),
                matchResponseDTO.getT1InhibitorFirst(),
                matchResponseDTO.getT1RiftHeraldKills(),
                matchResponseDTO.getT1RiftHeraldFirst(),
                matchResponseDTO.getT1TowerKills(),
                matchResponseDTO.getT1TowerFirst(),
                matchResponseDTO.getT1TeamID(),
                matchResponseDTO.getT1Win(),
                matchResponseDTO.getT2FeatsStateMonster(),
                matchResponseDTO.getT2FeatsStateChampion(),
                matchResponseDTO.getT2FeatsStateTurret(),
                matchResponseDTO.getT2AtakhanKills(),
                matchResponseDTO.getT2AtakhanFirst(),
                matchResponseDTO.getT2BaronKills(),
                matchResponseDTO.getT2BaronFirst(),
                matchResponseDTO.getT2ChampionKills(),
                matchResponseDTO.getT2ChampionFirst(),
                matchResponseDTO.getT2DragonKills(),
                matchResponseDTO.getT2DragonFirst(),
                matchResponseDTO.getT2HordeKills(),
                matchResponseDTO.getT2HordeFirst(),
                matchResponseDTO.getT2InhibitorKills(),
                matchResponseDTO.getT2InhibitorFirst(),
                matchResponseDTO.getT2RiftHeraldKills(),
                matchResponseDTO.getT2RiftHeraldFirst(),
                matchResponseDTO.getT2TowerKills(),
                matchResponseDTO.getT2TowerFirst(),
                matchResponseDTO.getT2TeamID(),
                matchResponseDTO.getT2Win()
        );
        iMatchResonseRepo.save(matchResponse);

        return "\n Saved matchId "+ matchResponse.getMatchID();
    }
}
