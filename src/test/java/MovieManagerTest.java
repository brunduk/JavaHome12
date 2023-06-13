import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    MovieData movie1 = new MovieData("Бладшот");
    MovieData movie2 = new MovieData("Вперед");
    MovieData movie3 = new MovieData("Отель Белград");
    MovieData movie4 = new MovieData("Джентельмены");
    MovieData movie5 = new MovieData("Человек-Неведимка");
    MovieData movie6 = new MovieData("Тролли. Мировой тур");
    MovieData movie7 = new MovieData("Номер один");

    @Test
    public void addAll() {
        MovieManager mana = new MovieManager();
        mana.addMovie(movie1);
        mana.addMovie(movie2);
        mana.addMovie(movie3);
        mana.addMovie(movie4);
        mana.addMovie(movie5);
        mana.addMovie(movie6);
        mana.addMovie(movie7);

        MovieData[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        MovieData[] actual = mana.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void reversedListMax() {
        MovieManager mana = new MovieManager(5);
        mana.addMovie(movie1);
        mana.addMovie(movie2);
        mana.addMovie(movie3);
        mana.addMovie(movie4);
        mana.addMovie(movie5);
        mana.addMovie(movie6);
        mana.addMovie(movie7);

        MovieData[] expected = {movie7, movie6, movie5, movie4, movie3};
        MovieData[] actual = mana.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addOneMovie() {
        MovieManager mana = new MovieManager();
        mana.addMovie(movie1);

        MovieData[] expected = {movie1};
        MovieData[] actual = mana.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reversedListMin() {
        MovieManager mana = new MovieManager(5);
        mana.addMovie(movie1);
        mana.addMovie(movie2);
        mana.addMovie(movie3);
        mana.addMovie(movie4);


        MovieData[] expected = {movie4, movie3, movie2, movie1};
        MovieData[] actual = mana.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void reversedList() {
        MovieManager mana = new MovieManager(7);
        mana.addMovie(movie1);
        mana.addMovie(movie2);
        mana.addMovie(movie3);
        mana.addMovie(movie4);
        mana.addMovie(movie5);
        mana.addMovie(movie6);
        mana.addMovie(movie7);

        MovieData[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MovieData[] actual = mana.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
