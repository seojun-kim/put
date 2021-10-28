package com.example.put;

import com.example.put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", method = {RequestMethod.PUT})
public class PutApiController {

    @PutMapping("/put/{userID}")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable(name = "userID") Long userID) {
        System.out.println(requestDto);
        System.out.println(userID);

        return requestDto;
    }
}
