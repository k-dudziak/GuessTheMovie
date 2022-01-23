import java.io.FileNotFoundException;

public class Main {
    public static void main(String [] args) throws FileNotFoundException {
        String filePath = "moviesList.txt";

        ReadMoviesList readMoviesList = new ReadMoviesList();
        PlayTheGame playTheGame = new PlayTheGame();

        readMoviesList.getRandomMovie(filePath);
        System.out.println(readMoviesList.randomMovie);
        playTheGame.StartGame(readMoviesList.randomMovie);
    }
}
