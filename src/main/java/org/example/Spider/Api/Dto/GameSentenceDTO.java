package org.example.Spider.Api.Dto;

import java.util.ArrayList;
import java.util.List;

public class GameSentenceDTO {

	private final Integer sentenceId;
	private final String sentence;
	private final List<String> words = new ArrayList<>();

	public GameSentenceDTO(Integer sentenceId, String sentence) {
		this.sentenceId = sentenceId;
		this.sentence = sentence;
	}

	@SuppressWarnings("unused")
	public Integer getSentenceId() {
		return sentenceId;
	}

	public String getSentence() {
		return sentence;
	}

	public List<String> getWords() {
		return words;
	}

	public void addWord(String word) {
		words.add(word);
	}
}