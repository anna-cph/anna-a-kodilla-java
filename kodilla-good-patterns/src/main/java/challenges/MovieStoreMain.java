package challenges;

import java.util.List;
import java.util.Map;

public class MovieStoreMain {
    public static void main(String[] args) {
        MovieStore theMovie = new MovieStore();
        Map<String, List<String>> theMovieMap = theMovie.getMovies();
        System.out.println("The movie titles:");
        theMovieMap.entrySet().stream()
                .map(entry -> entry.getValue() + " !")
                .forEach(System.out::println);
    }
}
