package com.example.maps_api.app.controller;

import com.example.maps_api.app.service.MapService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MapController {

    private final MapService mapService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String getRest(){
        return mapService.searchByKeyword();
    }
}
