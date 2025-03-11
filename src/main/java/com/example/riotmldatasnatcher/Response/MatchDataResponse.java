package com.example.riotmldatasnatcher.Response;

import com.example.riotmldatasnatcher.Config.ApiConfig;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MatchDataResponse {
    private static final String API_REGION = "europe"; // Adjust based on region
    private String matchDataResponseString;

    public String MatchDataResponseString(String matchId){
        String endpoint = String.format("https://%s.api.riotgames.com/lol/match/v5/matches/%s", API_REGION, matchId);
        StringBuilder response = new StringBuilder();

        try {
            URL url = new URL(endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-Riot-Token", ApiConfig.getApiKey());

            if (connection.getResponseCode() == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();
            } else {
                System.err.println("Error: Received HTTP " + connection.getResponseCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        matchDataResponseString = response.toString();
        return matchDataResponseString;
    }






    public String getMatchDataResponseString() {
        return matchDataResponseString;
    }

    public void setMatchDataResponseString(String matchDataResponseString) {
        this.matchDataResponseString = matchDataResponseString;
    }
}
