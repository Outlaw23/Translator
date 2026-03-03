package org.example.Spider.repository;

import org.example.Spider.models.Sentences.Sentence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SentenceRepository extends JpaRepository<Sentence, Integer> {

	@Query(value = """
			    SELECT
			        s.id AS sentence_id,
			        s.sentence,
			        w.id AS word_id,
			        w.word
			    FROM (
			        SELECT id
			        FROM sentences
			        ORDER BY RAND()
			        LIMIT 10
			    ) r
			    JOIN sentences s ON s.id = r.id
			    JOIN sentence_words sw ON s.id = sw.sentence_id
			    JOIN words w ON w.id = sw.word_id
			""", nativeQuery = true)
	List<Object[]> get10RandomSentencesWithWords();
}