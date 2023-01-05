package com.example.maps_api.app.service;

import com.example.maps_api.app.dto.response.KaKaoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@RequiredArgsConstructor
public class KakaoApi {

    @Value("${REST_API_KEY}")
    private String kakao_apikey;


    public KaKaoResponseDto searchByKeyword() {
        // 헤더 설정
        final HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "KakaoAK " + kakao_apikey);

        // RestTemplate 객체 생성
        RestTemplate restTemplate = new RestTemplate();

        // 파라미터를 사용하여 요청 URL을 구성한다.
        String apiURL = "https://dapi.kakao.com/v2/local/search/keyword.JSON?"
                + "query=" + "성수 포토부스"; // request param (x, y, radius 등 검색 조건 추가 가능)

        final HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(apiURL, HttpMethod.GET, entity,KaKaoResponseDto.class).getBody();
    }
}
