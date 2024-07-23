package hwan.githubclient.controller;

import hwan.githubclient.service.GithubApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubController {
    @Autowired
    private GithubApiService gitHubApiService;

    @GetMapping("/github/{username}/repos")
    public String getUserRepos(@PathVariable String username){
        return gitHubApiService.getUserRepos(username);
    }
}