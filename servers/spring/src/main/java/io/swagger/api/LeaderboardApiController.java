package io.swagger.api;

import io.swagger.model.Leaderboard;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

@Controller
public class LeaderboardApiController implements LeaderboardApi {

    public ResponseEntity<List<Leaderboard>> leaderboardGet(@ApiParam(value = "Ranking type. Options: \"notional\", \"ROE\"", defaultValue = "notional") @RequestParam(value = "method", required = false, defaultValue="notional") String method) {
        // do some magic!
        return new ResponseEntity<List<Leaderboard>>(HttpStatus.OK);
    }

}
