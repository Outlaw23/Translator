package org.example.Spider.models.Words;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Utility class to fetch random words from the database.
 * Provides methods to get the current list, generate a new list, or get a specified number of random words.
 */
public class List_Maker {
	private static List<String> woorden; // cached list of words
	private static final Logger log = LoggerFactory.getLogger(List_Maker.class);

	public static List<String> getRandomWords(int count) {
		List<String> words = new ArrayList<>();
		String sql = "SELECT word FROM words ORDER BY RAND() LIMIT " + count;

		try (Connection conn = DBConnection.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				words.add(rs.getString("word"));
			}

		} catch (SQLException | IOException e) {
			log.error("An error occurred during database or IO operations", e);
		}

		return words;
	}

	public static List<String> getWoorden() {
		if (woorden == null) {
			woorden = getRandomWords(10);
		}
		return woorden;
	}

	public static List<String> newWoords() {
		woorden = getRandomWords(10);
		return woorden;
	}
}
