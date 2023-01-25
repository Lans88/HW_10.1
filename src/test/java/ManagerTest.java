import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.hw10.FilmsManager;

public class ManagerTest {
    @Test
    public void testAddFilm() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.allFilms();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLast() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLastFilms();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLastLim() {
        FilmsManager manager = new FilmsManager(7);
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLastFilms();
        Assertions.assertArrayEquals(expected, actual);
    }
}
