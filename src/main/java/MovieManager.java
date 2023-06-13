public class MovieManager {
    private int limit;
    public MovieData[] movies = new MovieData[0];

    public MovieManager() {
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(MovieData movie) {
        MovieData[] tmp = new MovieData[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public MovieData[] findAll() {
        return movies;

    }

    public MovieData[] findLast() {

        MovieData[] film = findAll();
        int movieLength;
        if (film.length < limit) {
            movieLength = film.length;
        } else {
            movieLength = limit;
        }
        MovieData[] reversed = new MovieData[movieLength];
        for (int i = 0; i < movieLength; i++) {
            reversed[i] = film[movies.length - 1 - i];
        }
        return reversed;
    }
}
