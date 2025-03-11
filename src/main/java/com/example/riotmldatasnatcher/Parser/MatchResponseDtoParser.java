package com.example.riotmldatasnatcher.Parser;

import com.example.riotmldatasnatcher.DTO.MatchResponseDTO;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class MatchResponseDtoParser {

    private static final Gson gson = new Gson();

    public static MatchResponseDTO parseMatchData(String jsonResponse) {
        try {
            return gson.fromJson(jsonResponse, MatchResponseDTO.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            System.err.println("Error parsing JSON to MatchResponseDto.");
            return null;
        }
    }
}
