package org.example.Spider.models.Sentences;

import org.example.Spider.Service.SentenceService;
import org.example.Spider.models.Dto.GameSentenceDTO;
import org.example.Spider.models.hado_language.HadoLanguageMvc;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Get_Words_And_Sentences {

	private final SentenceService sentenceService;

	private final List<String> currentWordsHado = new ArrayList<>();
	private final List<String> currentSentences = new ArrayList<>();
	private final List<String> currentWords = new ArrayList<>();

	public Get_Words_And_Sentences(SentenceService sentenceService) {
		this.sentenceService = sentenceService;
	}

	public void readTen() {

		currentWordsHado.clear();
		currentSentences.clear();
		currentWords.clear();

		List<GameSentenceDTO> gameData = sentenceService.getGameData();

		for (GameSentenceDTO data : gameData) {

			String sentence = data.getSentence();
			List<String> words = data.getWords();

			List<String> hadoWordsForThisSentence = new ArrayList<>();

			for (String word : words) {

				StringBuilder hadoBuilder = new StringBuilder();
				for (char c : word.toCharArray()) {
					hadoBuilder.append(HadoLanguageMvc.hadoLanguagee(String.valueOf(c)));
				}

				hadoWordsForThisSentence.add(hadoBuilder.toString());
			}

			// Woorden in dezelfde zin scheiden met &
			currentWordsHado.add(String.join(" & ", hadoWordsForThisSentence));
			currentWords.add(String.join(" & ", words));

			currentSentences.add(sentence);
		}
	}

	public List<String> getCurrentWordsHado() {
		return currentWordsHado;
	}

	public List<String> getCurrentSentences() {
		return currentSentences;
	}

	public List<String> getCurrentWords() {
		return currentWords;
	}
}