package basics.basics.oop.basics;

/**
 * A class representing a letter with a sender and a recipient.
 * The class allows adding lines to the letter and retrieving the
 * complete text of the letter in a formatted manner.
 *
 * Example usage:
 * <pre>
 *     Letter letter = new Letter("Alice", "Bob");
 *     letter.addLine("I hope this message finds you well.");
 *     letter.addLine("Looking forward to hearing from you.");
 *     String text = letter.getText();
 * </pre>
 *
 * @author Yassin Sohim
 */
public class Letter {
    private final String to;
    private final String from;
    private final StringBuilder lines;

    /**
     * Constructs a Letter with a sender and recipient.
     *
     * @param from the sender of the letter
     * @param to the recipient of the letter
     */
    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        lines = new StringBuilder();
    }

    /**
     * Adds a line of text to the letter.
     *
     * @param line the line to be added
     */
    public void addLine(String line) {
        lines.append(line).append("\n");
    }

    /**
     * Gets the full text of the letter, including the recipient,
     * body, and sender information.
     *
     * @return the formatted text of the letter
     */
    public String getText() {
        return "Dear " + to + ":\n\n" + lines + "\n" + "Sincerely,\n\n" + from;
    }
}
