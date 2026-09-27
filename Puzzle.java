/**
 * Puzzle class represents a puzzle that player must solve
 * Demonstrates: Strings, OOP (encapsulation, objects)
 */
public class Puzzle {
    private String question;
    private String correctAnswer;
    private String reward;
    private boolean solved;

    // Constructor
    public Puzzle(String question, String correctAnswer, String reward) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.reward = reward;
        this.solved = false;
    }

    // Getters
    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getReward() {
        return reward;
    }

    public boolean isSolved() {
        return solved;
    }

    // Check if answer is correct (using String method)
    public boolean checkAnswer(String playerAnswer) {
        // Demonstrates String method: trim() and equalsIgnoreCase()
        return playerAnswer.trim().equalsIgnoreCase(correctAnswer);
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }
}
