package com.example.riotmldatasnatcher;

import com.example.riotmldatasnatcher.DTO.MatchResponseDTO;
import com.example.riotmldatasnatcher.Parser.MatchResponseDtoParser;
import com.example.riotmldatasnatcher.Response.MatchDataResponse;


public class Run {
    public static void main(String[] args) {


        MatchDataResponse matchDataResponse = new MatchDataResponse();
        String myString = matchDataResponse.MatchDataResponseString("EUN1_3753111690");
        System.out.println(myString);

        if (myString != null) {
            MatchResponseDTO matchDto = MatchResponseDtoParser.parseMatchData(myString);

            if (matchDto != null) {
                System.out.println("Match ID: " + matchDto.getMatchID());
                System.out.println("Game Duration: " + matchDto.getGameDuration());
                System.out.println("Team 1 Atakhan Kills: " + matchDto.getT1AtakhanKills());
                System.out.println("Team 2 Atakhan Kills: " + matchDto.getT2AtakhanKills());
            } else {
                System.out.println("Failed to parse JSON into MatchDto.");
            }
        } else {
            System.out.println("Failed to fetch match data.");
        }


    }
}
