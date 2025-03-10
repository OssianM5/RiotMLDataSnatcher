package com.example.riotmldatasnatcher.Controller;


import com.example.riotmldatasnatcher.DTO.MatchResponseDTO;
import com.example.riotmldatasnatcher.Service.IMatchResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/matchresponse")

public class MatchResponseController {

    @Autowired
    private IMatchResponseService iMatchResponseService;

    @PostMapping(path="/save")
    public String saveMatch(@RequestBody MatchResponseDTO matchResponseDTO)
    {
        String id = iMatchResponseService.addMatchResponse(matchResponseDTO);
        return id;
    }
}
