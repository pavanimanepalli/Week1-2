public class AveragePCM {
    public static void main(String[] args) {
        // Marks out of 100
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        // Calculate total
        int total = maths + physics + chemistry;

        // Calculate average percent
        double average = total / 3.0;

        // Print the result
        System.out.println("Sam’s average mark in PCM is " + average);
    }
}