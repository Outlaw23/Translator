package org.example.Spider.repositories.Words;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class List_Maker {

	private final JdbcTemplate jdbcTemplate;

	public List_Maker(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<String> getRandomWords(int count) {
		String sql = "SELECT word FROM words ORDER BY RAND() LIMIT ?";

		return jdbcTemplate.queryForList(sql, String.class, count);
	}
}