package engine;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Optional;

public class Question {

    private final String title;
    private final String text;
    private final String[] options;
    @JsonIgnore
    private final int correct;

    private Question(String title, String text, String[] options, int correct) {
        this.title = title;
        this.text = text;
        this.options = options;
        this.correct = correct;
    }

    public static final Question QUESTION = new Question("Schrödinger's cat",
            "Is Schrödinger's cat dead, alive, or in unknown state?",
            new String[]{"Dead", "Alive", "Unknown State", "I don't know"}, 2);

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String[] getOptions() {
        return options;
    }

    public boolean isCorrect(int option) {
        return this.correct == option;
    }
}
