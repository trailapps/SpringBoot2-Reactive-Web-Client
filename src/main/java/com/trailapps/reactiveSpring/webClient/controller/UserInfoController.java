package com.trailapps.reactiveSpring.webClient.controller;

import com.trailapps.reactiveSpring.webClient.modal.User;
import com.trailapps.reactiveSpring.webClient.modal.UserEvent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Controller
@RequestMapping("webclient")
public class UserInfoController {

    @GetMapping("/findAllUsers")
    public Flux<?> findAllUsers(WebClient webClient) {
        webClient.get().uri("/findAll").retrieve().bodyToFlux(User.class)
                .flatMap(user ->
                        webClient.get().uri("/{id}/events", user.getUserId())
                                .retrieve().bodyToFlux(UserEvent.class)
                ).subscribe(System.out::println);
        return null;
    }
}
