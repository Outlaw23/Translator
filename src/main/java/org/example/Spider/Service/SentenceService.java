package org.example.Spider.Service;

import org.example.Spider.repository.SentenceRepository;
import org.example.Spider.models.Dto.GameSentenceDTO;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SentenceService {

	private final SentenceRepository repo;

	public SentenceService(SentenceRepository repo) {
		this.repo = repo;
	}

	public List<GameSentenceDTO> getGameData() {

		List<Object[]> result = repo.get10RandomSentencesWithWords();

		Map<Integer, GameSentenceDTO> map = new LinkedHashMap<>();

		for (Object[] row : result) {

			Integer sentenceId = (Integer) row[0];
			String sentence = (String) row[1];
			String word = (String) row[3];

			if (!map.containsKey(sentenceId)) {
				map.put(sentenceId, new GameSentenceDTO(sentenceId, sentence));
			}

			map.get(sentenceId).addWord(word);
		}

		return new ArrayList<>(map.values());
	}
}