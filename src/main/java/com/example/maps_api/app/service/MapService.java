package com.example.maps_api.app.service;

import com.example.maps_api.app.dto.response.KaKaoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;


@Service
@RequiredArgsConstructor
public class MapService {

    private final KakaoApi kakaoApi;

    public HashMap<String, Object> searchByKeyword() {
        return kakaoApi.searchByKeyword();
    }
}
