package engine;

public class Answer {

    private final boolean success;
    private final String feedback;

    private Answer(boolean success, String feedback) {
        this.success = success;
        this.feedback = feedback;
    }

    public final static Answer CORRECT_ANSWER = new Answer(
            true, "Indeed it is unknown until we open the box");
    public final static Answer WRONG_ANSWER = new Answer(
            false, "Wrong answer! Try again.");

    public boolean getSuccess() {
        return success;
    }

    public String getFeedback() {
        return feedback;
    }
}
