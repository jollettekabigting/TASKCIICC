public class task2 {
    public static void main(String[] args) {
        // Creating the primitives with different values
        char h = 'H';
        short shortNums = 3110;
        byte zero = 0;
        int one = 2; // Named 'one' but holds 2 to give us '2.0' later
        float pointZero = 0.0f;
        boolean bool = true;

        // Concatenating them into a single string
        // We start with "" to force Java to treat the '+' as string concatenation from the beginning
        String output = "" + h + shortNums + " w" + zero + "rld " + (one + pointZero) + " " + bool;

        // Printing it to the screen
        System.out.println(output);
    }
}