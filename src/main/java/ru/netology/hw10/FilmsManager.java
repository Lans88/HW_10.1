package ru.netology.hw10;

public class FilmsManager {
    private String[] films = new String[0];
    private int limit;

    public FilmsManager() {
        limit = 10;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] temp = new String[films.length + 1];
        for (int i = 0; i < films.length; i += 1) {
            temp[i] = films[i];
        }
        temp[temp.length - 1] = film;
        films = temp;
    }

    public String[] allFilms() {
        return films;
    }

    public String[] findLastFilms() {
        int resultLenght;
        if (films.length < limit) {
            resultLenght = films.length;
        } else {
            resultLenght = limit;
        }
        String[] temp = new String[resultLenght];
        for (int i = 0; i < temp.length; i += 1) {
            temp[i] = films[films.length - 1 - i];
        }
        return temp;
    }
}
