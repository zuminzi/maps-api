package com.example.maps_api.app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MapService {

    private final KakaoApi kakaoAPI;

    public String searchByKeyword() {
        return kakaoAPI.searchByKeyword();
    }
}
