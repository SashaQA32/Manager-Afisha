package ru.netology.domain;

public class AfishaManager {
    private Movie[] movies = new Movie[0];
    private int currentMoviesLenght = 10;

    public AfishaManager() {
    }

    public AfishaManager(int currentMoviesLenght) {
        this.currentMoviesLenght = currentMoviesLenght;
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastCell = tmp.length - 1;
        tmp[lastCell] = movie;
        movies = tmp;
    }

    public Movie[] showMovies() {
        int resultLenght = currentMoviesLenght;
        if (movies.length < resultLenght)
            resultLenght = movies.length;
        Movie[] result = new Movie[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            int cell = movies.length -i -1;
            result[i] = movies[cell];
        }
        return result;
    }
}
