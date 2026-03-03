CREATE TABLE IF NOT EXISTS words
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    word VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS sentences
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    sentence VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS sentence_words
(
    sentence_id INT,
    word_id     INT,
    PRIMARY KEY (sentence_id, word_id),
    FOREIGN KEY (sentence_id) REFERENCES sentences (id) ON DELETE CASCADE,
    FOREIGN KEY (word_id) REFERENCES words (id) ON DELETE CASCADE
);