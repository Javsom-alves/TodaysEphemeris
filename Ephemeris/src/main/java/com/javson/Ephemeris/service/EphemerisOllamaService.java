package com.javson.Ephemeris.service;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EphemerisOllamaService {

	private final RestTemplate restTemplate;

	public EphemerisOllamaService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	private final String URL = "http://localhost:11434/api/generate";

	public String askOllama(String question) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		String prompt = """
				Liste eventos históricos que aconteceram no dia %s.

				Responda SOMENTE em JSON no formato:

				[
				  {
				    "title": "titulo do evento",
				    "date": "AAAA-MM-DD",
				    "description": "descrição do evento",
				    "analysis": "análise da importância histórica"
				  }
				]
				""".formatted(question);

		Map<String, Object> body = Map.of("model", "llama3", "prompt", prompt, "stream", false, "format", "json");

		HttpEntity<Map<String, Object>> request = new HttpEntity<>(body, headers);

		ResponseEntity<Map> response = restTemplate.postForEntity(URL, request, Map.class);

		return response.getBody().get("response").toString();
	}
}