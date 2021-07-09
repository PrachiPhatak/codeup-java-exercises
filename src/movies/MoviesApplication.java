package movies;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        printMovies(input.showOptions());
    }

    private static void printMovies(int userInput) {
        Input input1 = new Input();
        switch (userInput) {
            case 0:
                return;
            case 1:
                MovieArray.printAllMovies();
                break;
            case 2:
                MovieArray.printMoviesByCategory("animated");
                break;
            case 3:
                MovieArray.printMoviesByCategory("drama");
                break;
            case 4:
                MovieArray.printMoviesByCategory("horror");
                break;
            case 5:
                MovieArray.printMoviesByCategory("scifi");
                break;
            case 6:
                MovieArray.printMoviesByCategory("musical");
                break;
            case 7:
                Movie newMovie = input1.getMovieDetails();
                MovieArray.addNewMovie(newMovie);
                System.out.println(newMovie.getName() + " added successfully!");
                break;
            default:
                System.out.println("Invalid choice");
        }
        printMovies(input1.showOptions());
    }
}
