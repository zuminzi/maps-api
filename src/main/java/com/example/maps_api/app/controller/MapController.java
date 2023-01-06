package com.example.maps_api.app.controller;

import com.example.maps_api.app.dto.response.KaKaoResponseDto;
import com.example.maps_api.app.service.MapService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class MapController {

    private final MapService mapService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public HashMap<String, Object> getRest(){
        return mapService.searchByKeyword();
    }
}
