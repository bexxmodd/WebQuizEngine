package engine;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Quiz {

    @GetMapping(path = "/api/quiz")
    public Question getQuestion() {
        return Question.QUESTION;
    }

    @PostMapping(path="/api/quiz")
    public Answer checkAnswer(@RequestParam(value="answer") int option) {
        if (Question.QUESTION.isCorrect(option)) {
            return Answer.CORRECT_ANSWER;
        } else {
            return Answer.WRONG_ANSWER;
        }
    }
}
