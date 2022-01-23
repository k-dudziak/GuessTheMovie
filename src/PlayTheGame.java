import java.util.Scanner;

public class PlayTheGame {

    void StartGame(String movieName) {

        int wrongGuesses = 0;
        boolean hasWon = false;
        String wrongLetters = "";
        boolean guessCorrect = false;

        String hiddenMovieName = movieName.replaceAll("[a-z]", "_");

        for (int i = 10; i > 0; i--){

            System.out.println("You are guessing: "+hiddenMovieName);
            System.out.println("You have guessed: "+wrongGuesses+ " wrong letters: "+wrongLetters);
            System.out.println("Guess a letter: ");

            Scanner scanner = new Scanner(System.in);

            char guess = scanner.nextLine().charAt(0);

            for(int j = 0; j < movieName.length(); j++){
                if (movieName.charAt(j) == guess){
                    char [] hiddenMovieCharArray = hiddenMovieName.toCharArray();
                    hiddenMovieCharArray[j] = guess;
                    hiddenMovieName = String.valueOf(hiddenMovieCharArray);
                    guessCorrect = true;
                } else {
                    guessCorrect = false;

                }
            }
            if (guessCorrect){
                wrongGuesses = wrongGuesses+1;
                wrongLetters = wrongLetters+" "+guess;
            }

        }
    }
}
