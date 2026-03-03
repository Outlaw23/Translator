package org.example.Spider.Service;

import org.example.Spider.repository.List_Maker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordService {
	private final ArrayList<String> words = new ArrayList<>();

	private final List_Maker wordRepository;

	public WordService(List_Maker wordRepository) {
		this.wordRepository = wordRepository;
	}

	public List<String> getWords(int count) {
		words.clear();
		words.addAll(wordRepository.getRandomWords(count));
		return words;
	}

	public List<String> getWordsList() {
		return words;
	}


}