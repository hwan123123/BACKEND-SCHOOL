package hwan.githubclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubApiService {
    @Value("${github.api.url}")
    private String githubApiUrl;
    @Value("${github.api.token}")
    private String githubApiToken;

    //스프링에서 Http 요청/응답 처리하기 위한 템플릿
    private final RestTemplate restTemplate;

    public GithubApiService() {
        this.restTemplate = new RestTemplate();
    }

    public String getUserRepos(String username){
        String url = githubApiUrl + "/users/"+username+"/repos";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization","Bearer "+githubApiToken);

        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return response.getBody();
    }

}