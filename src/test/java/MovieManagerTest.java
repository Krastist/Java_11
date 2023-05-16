import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.security.PublicKey;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();

    MovieInformation film1 = new MovieInformation("1", "Бладшот", "Боевик");
    MovieInformation film2 = new MovieInformation("2", "Вперед", "Мультфильм");
    MovieInformation film3 = new MovieInformation("3", "Отель Белград", "Комедия");
    MovieInformation film4 = new MovieInformation("4", "Джентельмены", "Боевик");
    MovieInformation film5 = new MovieInformation("5", "Человек - Невидимка", "Ужасы");
    MovieInformation film6 = new MovieInformation("6", "Тролли. Мировой тур", "Мультфильм");
    MovieInformation film7 = new MovieInformation("7", "Номер один", "Комедия");

    @Test
    public void testFindLastLessLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie(film4);
        manager.addMovie(film5);
        manager.addMovie(film6);
        manager.addMovie(film7);

        MovieInformation[] expected = {film7, film6, film5, film4};
        MovieInformation[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie(film3);
        manager.addMovie(film4);
        manager.addMovie(film5);
        manager.addMovie(film6);
        manager.addMovie(film7);

        MovieInformation[] expected = {film7, film6, film5, film4, film3};
        MovieInformation[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @BeforeEach
    public void movie() {
        manager.addMovie(film1);
        manager.addMovie(film2);
        manager.addMovie(film3);
        manager.addMovie(film4);
        manager.addMovie(film5);
        manager.addMovie(film6);
        manager.addMovie(film7);
    }

    @Test
    public void testFindAfll() {

        MovieInformation[] expected = {film1, film2, film3, film4, film5, film6, film7};
        MovieInformation[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie(film2);

        MovieInformation[] expected = {film2};
        MovieInformation[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {

        MovieInformation[] expected = {film7, film6, film5, film4, film3};
        MovieInformation[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
