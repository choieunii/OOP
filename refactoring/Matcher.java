package refactoring;

public class Matcher {
    public Matcher() {
    }

    public boolean match(int[] expected, int[] actual,
                         int clipLimit, int delta) {
        if (actual.length != expected.length)
            return false;          // Check for length differences
        for (int i = 0; i < actual.length; i++) {
            if (actual[i] > clipLimit)
                actual[i] = clipLimit;         // Clip "too-large" values
            if (Math.abs(expected[i] - actual[i]) > delta)
                return false;         // Check that each entry within expected +/- delta
        }
        return true;
    }
}
