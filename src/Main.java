import java.io.FileNotFoundException;

public class Main {
    public static void main(String [] args) throws FileNotFoundException {

        // Set path to the file with movie names list
        String filePath = "moviesList.txt";

        ReadMoviesList readMoviesList = new ReadMoviesList();
        PlayTheGame playTheGame = new PlayTheGame();

        // Read movies file and get random movie name
        readMoviesList.getRandomMovie(filePath);

        // Play the game using random movie name
        playTheGame.StartGame(readMoviesList.randomMovie);
    }
}
