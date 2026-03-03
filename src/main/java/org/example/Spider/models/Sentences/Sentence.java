package org.example.Spider.models.Sentences;

import jakarta.persistence.*;

@Entity
@Table(name = "sentences")
public class Sentence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String sentence;

	public Integer getId() {
		return id;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
}