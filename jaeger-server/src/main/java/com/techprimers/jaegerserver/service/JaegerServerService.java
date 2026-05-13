package com.techprimers.jaegerserver.service;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class JaegerServerService {
  String BACKEND_HOST = System.getenv("BACKEND_HOST");

  private WebClient webClient;

  public JaegerServerService(WebClient webClient) {
    this.webClient = webClient;
  }

  public Mono<String> get(Integer id) {

    return webClient.get()
        .uri(BACKEND_HOST + "/objects/" + id)
        .retrieve()
        .bodyToMono(String.class);
  }

  public Mono<String> hello() {
    return Mono.just("Hello from Server Service");
  }
}
