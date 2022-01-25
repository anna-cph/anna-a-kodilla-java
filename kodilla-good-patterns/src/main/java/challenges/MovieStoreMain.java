package challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] args) {
        MovieStore theMovie = new MovieStore();
        Map<String, List<String>> theMovieMap = theMovie.getMovies();
        System.out.println("The movie titles:");
        String xx = theMovieMap.entrySet().stream()
                .map(entry -> entry.getValue())
                .map(entry -> entry.toString())
                .collect(Collectors.joining(" ! \n","",""));
                System.out.println(xx);
    }
}
