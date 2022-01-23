import java.util.Scanner;

public class PlayTheGame {

    void StartGame(String movieName) {

        boolean hasWon = false;
        int points = 10;
        String wrongLetters = "";
        String hiddenMovieName = movieName.replaceAll("[a-z]", "_");

        System.out.println("Welcome to the movie names guessing game! Try to guess the movie name.");

        // Loop until players gets the movie name right or he runs out of points
        for (int i = 0; i < points; ) {

            System.out.println("You are guessing: " + hiddenMovieName);
            System.out.println("You have guessed: " + i + " wrong letters: " + wrongLetters);
            System.out.println("Guess a letter: ");

            // Get player input
            Scanner scanner = new Scanner(System.in);

            // Take first char from player's input
            char guess = scanner.nextLine().charAt(0);

            boolean guessCorrect = false;
            char[] hiddenMovieCharArray = hiddenMovieName.toCharArray();

            // Check if letter written by the player exists anywhere in the movie title
            for (int j = 0; j < movieName.length(); j++) {
                if (movieName.charAt(j) == guess) {
                    hiddenMovieCharArray[j] = guess;
                    hiddenMovieName = String.valueOf(hiddenMovieCharArray);
                    guessCorrect = true;
                }
            }

            // Check if players guess was right
            if (guessCorrect) {
                System.out.println("You've guessed right!");
            } else {
                System.out.println("You've guessed wrong.");
                i = i + 1;
                wrongLetters = wrongLetters + " " + guess;
            }

            // Check if player has won (guessed all the letters in the movie name)
            if (movieName.equals(hiddenMovieName)) {
                hasWon = true;
                break;
            }
        }

        // After the game ends, check why it ended (player won or lost)
        if (hasWon){
            System.out.println("You win!");
            System.out.println("You have guessed: " + movieName + " correctly!");
        } else {
            System.out.println("You lose!");
            System.out.println("The movie title to guess was: " + movieName);
        }
    }
}
