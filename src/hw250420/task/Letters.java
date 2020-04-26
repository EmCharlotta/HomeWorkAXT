package hw250420.task;

public class Letters {
    private int length;
    private String word;

    public Letters(int length, String word) {
        this.length = length;
        this.word = word;
    }

    @Override
    public String toString() {
        return "Letters{" +
                "length=" + length +
                ", word='" + word + '\'' +
                '}';
    }
}
