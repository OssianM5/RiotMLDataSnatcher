package com.example.riotmldatasnatcher.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "matchresponse")
public class MatchResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String matchID;

    @Column
    private Integer gameDuration;

    @Column(nullable = false, length = 255)
    private String gameMode;

    @Column(nullable = false, length = 255)
    private String gameType;

    @Column
    private Integer t1FeatsStateMonster;

    @Column
    private Integer t1FeatsStateChampion;

    @Column
    private Integer t1FeatsStateTurret;

    @Column
    private Integer t1AtakhanKills;

    @Column
    private Boolean t1AtakhanFirst;

    @Column
    private Integer t1BaronKills;

    @Column
    private Boolean t1BaronFirst;

    @Column
    private Integer t1ChampionKills;

    @Column
    private Boolean t1ChampionFirst;

    @Column
    private Integer t1DragonKills;

    @Column
    private Boolean t1DragonFirst;

    @Column
    private Integer t1HordeKills;

    @Column
    private Boolean t1HordeFirst;

    @Column
    private Integer t1InhibitorKills;

    @Column
    private Boolean t1InhibitorFirst;

    @Column
    private Integer t1RiftHeraldKills;

    @Column
    private Boolean t1RiftHeraldFirst;

    @Column
    private Integer t1TowerKills;

    @Column
    private Boolean t1TowerFirst;

    @Column
    private Integer t1TeamID;

    @Column
    private Boolean t1Win;

    @Column
    private Integer t2FeatsStateMonster;

    @Column
    private Integer t2FeatsStateChampion;

    @Column
    private Integer t2FeatsStateTurret;

    @Column
    private Integer t2AtakhanKills;

    @Column
    private Boolean t2AtakhanFirst;

    @Column
    private Integer t2BaronKills;

    @Column
    private Boolean t2BaronFirst;

    @Column
    private Integer t2ChampionKills;

    @Column
    private Boolean t2ChampionFirst;

    @Column
    private Integer t2DragonKills;

    @Column
    private Boolean t2DragonFirst;

    @Column
    private Integer t2HordeKills;

    @Column
    private Boolean t2HordeFirst;

    @Column
    private Integer t2InhibitorKills;

    @Column
    private Boolean t2InhibitorFirst;

    @Column
    private Integer t2RiftHeraldKills;

    @Column
    private Boolean t2RiftHeraldFirst;

    @Column
    private Integer t2TowerKills;

    @Column
    private Boolean t2TowerFirst;

    @Column
    private Integer t2TeamID;

    @Column
    private Boolean t2Win;


    public MatchResponse() {
    }

    public MatchResponse(Integer id, String matchID, Integer gameDuration, String gameMode, String gameType, Integer t1FeatsStateMonster, Integer t1FeatsStateChampion, Integer t1FeatsStateTurret, Integer t1AtakhanKills, Boolean t1AtakhanFirst, Integer t1BaronKills, Boolean t1BaronFirst, Integer t1ChampionKills, Boolean t1ChampionFirst, Integer t1DragonKills, Boolean t1DragonFirst, Integer t1HordeKills, Boolean t1HordeFirst, Integer t1InhibitorKills, Boolean t1InhibitorFirst, Integer t1RiftHeraldKills, Boolean t1RiftHeraldFirst, Integer t1TowerKills, Boolean t1TowerFirst, Integer t1TeamID, Boolean t1Win, Integer t2FeatsStateMonster, Integer t2FeatsStateChampion, Integer t2FeatsStateTurret, Integer t2AtakhanKills, Boolean t2AtakhanFirst, Integer t2BaronKills, Boolean t2BaronFirst, Integer t2ChampionKills, Boolean t2ChampionFirst, Integer t2DragonKills, Boolean t2DragonFirst, Integer t2HordeKills, Boolean t2HordeFirst, Integer t2InhibitorKills, Boolean t2InhibitorFirst, Integer t2RiftHeraldKills, Boolean t2RiftHeraldFirst, Integer t2TowerKills, Boolean t2TowerFirst, Integer t2TeamID, Boolean t2Win) {
        this.id = id;
        this.matchID = matchID;
        this.gameDuration = gameDuration;
        this.gameMode = gameMode;
        this.gameType = gameType;
        this.t1FeatsStateMonster = t1FeatsStateMonster;
        this.t1FeatsStateChampion = t1FeatsStateChampion;
        this.t1FeatsStateTurret = t1FeatsStateTurret;
        this.t1AtakhanKills = t1AtakhanKills;
        this.t1AtakhanFirst = t1AtakhanFirst;
        this.t1BaronKills = t1BaronKills;
        this.t1BaronFirst = t1BaronFirst;
        this.t1ChampionKills = t1ChampionKills;
        this.t1ChampionFirst = t1ChampionFirst;
        this.t1DragonKills = t1DragonKills;
        this.t1DragonFirst = t1DragonFirst;
        this.t1HordeKills = t1HordeKills;
        this.t1HordeFirst = t1HordeFirst;
        this.t1InhibitorKills = t1InhibitorKills;
        this.t1InhibitorFirst = t1InhibitorFirst;
        this.t1RiftHeraldKills = t1RiftHeraldKills;
        this.t1RiftHeraldFirst = t1RiftHeraldFirst;
        this.t1TowerKills = t1TowerKills;
        this.t1TowerFirst = t1TowerFirst;
        this.t1TeamID = t1TeamID;
        this.t1Win = t1Win;
        this.t2FeatsStateMonster = t2FeatsStateMonster;
        this.t2FeatsStateChampion = t2FeatsStateChampion;
        this.t2FeatsStateTurret = t2FeatsStateTurret;
        this.t2AtakhanKills = t2AtakhanKills;
        this.t2AtakhanFirst = t2AtakhanFirst;
        this.t2BaronKills = t2BaronKills;
        this.t2BaronFirst = t2BaronFirst;
        this.t2ChampionKills = t2ChampionKills;
        this.t2ChampionFirst = t2ChampionFirst;
        this.t2DragonKills = t2DragonKills;
        this.t2DragonFirst = t2DragonFirst;
        this.t2HordeKills = t2HordeKills;
        this.t2HordeFirst = t2HordeFirst;
        this.t2InhibitorKills = t2InhibitorKills;
        this.t2InhibitorFirst = t2InhibitorFirst;
        this.t2RiftHeraldKills = t2RiftHeraldKills;
        this.t2RiftHeraldFirst = t2RiftHeraldFirst;
        this.t2TowerKills = t2TowerKills;
        this.t2TowerFirst = t2TowerFirst;
        this.t2TeamID = t2TeamID;
        this.t2Win = t2Win;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatchID() {
        return matchID;
    }

    public void setMatchID(String matchID) {
        this.matchID = matchID;
    }

    public Integer getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(Integer gameDuration) {
        this.gameDuration = gameDuration;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Integer getT1FeatsStateMonster() {
        return t1FeatsStateMonster;
    }

    public void setT1FeatsStateMonster(Integer t1FeatsStateMonster) {
        this.t1FeatsStateMonster = t1FeatsStateMonster;
    }

    public Integer getT1FeatsStateChampion() {
        return t1FeatsStateChampion;
    }

    public void setT1FeatsStateChampion(Integer t1FeatsStateChampion) {
        this.t1FeatsStateChampion = t1FeatsStateChampion;
    }

    public Integer getT1FeatsStateTurret() {
        return t1FeatsStateTurret;
    }

    public void setT1FeatsStateTurret(Integer t1FeatsStateTurret) {
        this.t1FeatsStateTurret = t1FeatsStateTurret;
    }

    public Integer getT1AtakhanKills() {
        return t1AtakhanKills;
    }

    public void setT1AtakhanKills(Integer t1AtakhanKills) {
        this.t1AtakhanKills = t1AtakhanKills;
    }

    public Boolean getT1AtakhanFirst() {
        return t1AtakhanFirst;
    }

    public void setT1AtakhanFirst(Boolean t1AtakhanFirst) {
        this.t1AtakhanFirst = t1AtakhanFirst;
    }

    public Integer getT1BaronKills() {
        return t1BaronKills;
    }

    public void setT1BaronKills(Integer t1BaronKills) {
        this.t1BaronKills = t1BaronKills;
    }

    public Boolean getT1BaronFirst() {
        return t1BaronFirst;
    }

    public void setT1BaronFirst(Boolean t1BaronFirst) {
        this.t1BaronFirst = t1BaronFirst;
    }

    public Integer getT1ChampionKills() {
        return t1ChampionKills;
    }

    public void setT1ChampionKills(Integer t1ChampionKills) {
        this.t1ChampionKills = t1ChampionKills;
    }

    public Boolean getT1ChampionFirst() {
        return t1ChampionFirst;
    }

    public void setT1ChampionFirst(Boolean t1ChampionFirst) {
        this.t1ChampionFirst = t1ChampionFirst;
    }

    public Integer getT1DragonKills() {
        return t1DragonKills;
    }

    public void setT1DragonKills(Integer t1DragonKills) {
        this.t1DragonKills = t1DragonKills;
    }

    public Boolean getT1DragonFirst() {
        return t1DragonFirst;
    }

    public void setT1DragonFirst(Boolean t1DragonFirst) {
        this.t1DragonFirst = t1DragonFirst;
    }

    public Integer getT1HordeKills() {
        return t1HordeKills;
    }

    public void setT1HordeKills(Integer t1HordeKills) {
        this.t1HordeKills = t1HordeKills;
    }

    public Boolean getT1HordeFirst() {
        return t1HordeFirst;
    }

    public void setT1HordeFirst(Boolean t1HordeFirst) {
        this.t1HordeFirst = t1HordeFirst;
    }

    public Integer getT1InhibitorKills() {
        return t1InhibitorKills;
    }

    public void setT1InhibitorKills(Integer t1InhibitorKills) {
        this.t1InhibitorKills = t1InhibitorKills;
    }

    public Boolean getT1InhibitorFirst() {
        return t1InhibitorFirst;
    }

    public void setT1InhibitorFirst(Boolean t1InhibitorFirst) {
        this.t1InhibitorFirst = t1InhibitorFirst;
    }

    public Integer getT1RiftHeraldKills() {
        return t1RiftHeraldKills;
    }

    public void setT1RiftHeraldKills(Integer t1RiftHeraldKills) {
        this.t1RiftHeraldKills = t1RiftHeraldKills;
    }

    public Boolean getT1RiftHeraldFirst() {
        return t1RiftHeraldFirst;
    }

    public void setT1RiftHeraldFirst(Boolean t1RiftHeraldFirst) {
        this.t1RiftHeraldFirst = t1RiftHeraldFirst;
    }

    public Integer getT1TowerKills() {
        return t1TowerKills;
    }

    public void setT1TowerKills(Integer t1TowerKills) {
        this.t1TowerKills = t1TowerKills;
    }

    public Boolean getT1TowerFirst() {
        return t1TowerFirst;
    }

    public void setT1TowerFirst(Boolean t1TowerFirst) {
        this.t1TowerFirst = t1TowerFirst;
    }

    public Integer getT1TeamID() {
        return t1TeamID;
    }

    public void setT1TeamID(Integer t1TeamID) {
        this.t1TeamID = t1TeamID;
    }

    public Boolean getT1Win() {
        return t1Win;
    }

    public void setT1Win(Boolean t1Win) {
        this.t1Win = t1Win;
    }

    public Integer getT2FeatsStateMonster() {
        return t2FeatsStateMonster;
    }

    public void setT2FeatsStateMonster(Integer t2FeatsStateMonster) {
        this.t2FeatsStateMonster = t2FeatsStateMonster;
    }

    public Integer getT2FeatsStateChampion() {
        return t2FeatsStateChampion;
    }

    public void setT2FeatsStateChampion(Integer t2FeatsStateChampion) {
        this.t2FeatsStateChampion = t2FeatsStateChampion;
    }

    public Integer getT2FeatsStateTurret() {
        return t2FeatsStateTurret;
    }

    public void setT2FeatsStateTurret(Integer t2FeatsStateTurret) {
        this.t2FeatsStateTurret = t2FeatsStateTurret;
    }

    public Integer getT2AtakhanKills() {
        return t2AtakhanKills;
    }

    public void setT2AtakhanKills(Integer t2AtakhanKills) {
        this.t2AtakhanKills = t2AtakhanKills;
    }

    public Boolean getT2AtakhanFirst() {
        return t2AtakhanFirst;
    }

    public void setT2AtakhanFirst(Boolean t2AtakhanFirst) {
        this.t2AtakhanFirst = t2AtakhanFirst;
    }

    public Integer getT2BaronKills() {
        return t2BaronKills;
    }

    public void setT2BaronKills(Integer t2BaronKills) {
        this.t2BaronKills = t2BaronKills;
    }

    public Boolean getT2BaronFirst() {
        return t2BaronFirst;
    }

    public void setT2BaronFirst(Boolean t2BaronFirst) {
        this.t2BaronFirst = t2BaronFirst;
    }

    public Integer getT2ChampionKills() {
        return t2ChampionKills;
    }

    public void setT2ChampionKills(Integer t2ChampionKills) {
        this.t2ChampionKills = t2ChampionKills;
    }

    public Boolean getT2ChampionFirst() {
        return t2ChampionFirst;
    }

    public void setT2ChampionFirst(Boolean t2ChampionFirst) {
        this.t2ChampionFirst = t2ChampionFirst;
    }

    public Integer getT2DragonKills() {
        return t2DragonKills;
    }

    public void setT2DragonKills(Integer t2DragonKills) {
        this.t2DragonKills = t2DragonKills;
    }

    public Boolean getT2DragonFirst() {
        return t2DragonFirst;
    }

    public void setT2DragonFirst(Boolean t2DragonFirst) {
        this.t2DragonFirst = t2DragonFirst;
    }

    public Integer getT2HordeKills() {
        return t2HordeKills;
    }

    public void setT2HordeKills(Integer t2HordeKills) {
        this.t2HordeKills = t2HordeKills;
    }

    public Boolean getT2HordeFirst() {
        return t2HordeFirst;
    }

    public void setT2HordeFirst(Boolean t2HordeFirst) {
        this.t2HordeFirst = t2HordeFirst;
    }

    public Integer getT2InhibitorKills() {
        return t2InhibitorKills;
    }

    public void setT2InhibitorKills(Integer t2InhibitorKills) {
        this.t2InhibitorKills = t2InhibitorKills;
    }

    public Boolean getT2InhibitorFirst() {
        return t2InhibitorFirst;
    }

    public void setT2InhibitorFirst(Boolean t2InhibitorFirst) {
        this.t2InhibitorFirst = t2InhibitorFirst;
    }

    public Integer getT2RiftHeraldKills() {
        return t2RiftHeraldKills;
    }

    public void setT2RiftHeraldKills(Integer t2RiftHeraldKills) {
        this.t2RiftHeraldKills = t2RiftHeraldKills;
    }

    public Boolean getT2RiftHeraldFirst() {
        return t2RiftHeraldFirst;
    }

    public void setT2RiftHeraldFirst(Boolean t2RiftHeraldFirst) {
        this.t2RiftHeraldFirst = t2RiftHeraldFirst;
    }

    public Integer getT2TowerKills() {
        return t2TowerKills;
    }

    public void setT2TowerKills(Integer t2TowerKills) {
        this.t2TowerKills = t2TowerKills;
    }

    public Boolean getT2TowerFirst() {
        return t2TowerFirst;
    }

    public void setT2TowerFirst(Boolean t2TowerFirst) {
        this.t2TowerFirst = t2TowerFirst;
    }

    public Integer getT2TeamID() {
        return t2TeamID;
    }

    public void setT2TeamID(Integer t2TeamID) {
        this.t2TeamID = t2TeamID;
    }

    public Boolean getT2Win() {
        return t2Win;
    }

    public void setT2Win(Boolean t2Win) {
        this.t2Win = t2Win;
    }

    @Override
    public String toString() {
        return "MatchResponse{" +
                "id=" + id +
                ", matchID='" + matchID + '\'' +
                ", gameDuration=" + gameDuration +
                ", gameMode='" + gameMode + '\'' +
                ", gameType='" + gameType + '\'' +
                ", t1FeatsStateMonster=" + t1FeatsStateMonster +
                ", t1FeatsStateChampion=" + t1FeatsStateChampion +
                ", t1FeatsStateTurret=" + t1FeatsStateTurret +
                ", t1AtakhanKills=" + t1AtakhanKills +
                ", t1AtakhanFirst=" + t1AtakhanFirst +
                ", t1BaronKills=" + t1BaronKills +
                ", t1BaronFirst=" + t1BaronFirst +
                ", t1ChampionKills=" + t1ChampionKills +
                ", t1ChampionFirst=" + t1ChampionFirst +
                ", t1DragonKills=" + t1DragonKills +
                ", t1DragonFirst=" + t1DragonFirst +
                ", t1HordeKills=" + t1HordeKills +
                ", t1HordeFirst=" + t1HordeFirst +
                ", t1InhibitorKills=" + t1InhibitorKills +
                ", t1InhibitorFirst=" + t1InhibitorFirst +
                ", t1RiftHeraldKills=" + t1RiftHeraldKills +
                ", t1RiftHeraldFirst=" + t1RiftHeraldFirst +
                ", t1TowerKills=" + t1TowerKills +
                ", t1TowerFirst=" + t1TowerFirst +
                ", t1TeamID=" + t1TeamID +
                ", t1Win=" + t1Win +
                ", t2FeatsStateMonster=" + t2FeatsStateMonster +
                ", t2FeatsStateChampion=" + t2FeatsStateChampion +
                ", t2FeatsStateTurret=" + t2FeatsStateTurret +
                ", t2AtakhanKills=" + t2AtakhanKills +
                ", t2AtakhanFirst=" + t2AtakhanFirst +
                ", t2BaronKills=" + t2BaronKills +
                ", t2BaronFirst=" + t2BaronFirst +
                ", t2ChampionKills=" + t2ChampionKills +
                ", t2ChampionFirst=" + t2ChampionFirst +
                ", t2DragonKills=" + t2DragonKills +
                ", t2DragonFirst=" + t2DragonFirst +
                ", t2HordeKills=" + t2HordeKills +
                ", t2HordeFirst=" + t2HordeFirst +
                ", t2InhibitorKills=" + t2InhibitorKills +
                ", t2InhibitorFirst=" + t2InhibitorFirst +
                ", t2RiftHeraldKills=" + t2RiftHeraldKills +
                ", t2RiftHeraldFirst=" + t2RiftHeraldFirst +
                ", t2TowerKills=" + t2TowerKills +
                ", t2TowerFirst=" + t2TowerFirst +
                ", t2TeamID=" + t2TeamID +
                ", t2Win=" + t2Win +
                '}';
    }
}
