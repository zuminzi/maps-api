package com.example.maps_api.app.service;

import com.example.maps_api.app.dto.response.KaKaoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MapService {

    private final KakaoApi kakaoApi;

    public KaKaoResponseDto searchByKeyword() {
        return kakaoApi.searchByKeyword();
    }
}
