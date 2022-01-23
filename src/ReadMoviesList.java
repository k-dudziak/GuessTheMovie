import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ReadMoviesList {
    // Fields:
    String[] moviesList;
    int movieCount;
    String randomMovie;

    // Constructor:
    ReadMoviesList() {
        this.movieCount = 0;
    }

    // Method:
    void getRandomMovie(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scannedFile = new Scanner(file);

        // Check how long moviesList array should be
        int arrayLengthCounter = 0;
        while (scannedFile.hasNextLine()) {
            arrayLengthCounter++;
            scannedFile.nextLine();
        }

        // Initialize moviesList array with obtained length
        moviesList = new String[arrayLengthCounter];

        scannedFile = new Scanner(file);

        // Add movies names to the moviesList array
        while (scannedFile.hasNextLine()) {
            moviesList[movieCount] = scannedFile.nextLine();
            movieCount = movieCount + 1;
        }

        // Generate random index from moviesList
        int randomIndex = new Random().nextInt(moviesList.length);

        // Assign random movie name
        randomMovie = moviesList[randomIndex];
    }
}
