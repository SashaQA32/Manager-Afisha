package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    AfishaManager afisha = new AfishaManager();

    Movie first = new Movie(1, "Бладшот", "Боевик", false);
    Movie second = new Movie(2, "Вперед", "Мультфильм", false);
    Movie third = new Movie(3, "Отель Белград", "Комедия", false);
    Movie fourth = new Movie(4, "Джентельмены", "Боевик", false);
    Movie fifth = new Movie(5, "Человек-невидимка", "Ужасы", false);
    Movie sixth = new Movie(6, "Тролли. Мировой тур", "Мультфильм", true);
    Movie seventh = new Movie(7, "Номер Один", "Комедия", true);
    Movie eighth = new Movie(8, "Наемник", "Боевик", false);
    Movie ninth = new Movie(9, "Хочу замуж", "Комедия", false);
    Movie tenth = new Movie(10, "Лулу и Бриггс", "Комедия", false);
    Movie eleventh = new Movie(11, "Парни под прикрытием", "Боевик", false);
    Movie twelve = new Movie(12, "Мистер Нокаут", "Спорт", false);

    @Test
    void shouldShowTenMovies() {

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);
        afisha.add(eleventh);
        afisha.add(twelve);

        Movie[] expected = new Movie[]{
                twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, afisha.showMovies());
    }

    @Test
    void shouldShowAllMovies() {

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);

        Movie[] expected = new Movie[]{
                tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, afisha.showMovies());
    }

    @Test
    void shouldShowMoviesUnderTen() {

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);

        Movie[] expected = new Movie[]{
                sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, afisha.showMovies());
    }

    @Test
    void shouldShowMoviesBelowTenCurrentMoviesLenght() {

        AfishaManager afisha = new AfishaManager(6);

        afisha.add(first);
        afisha.add(second);
        afisha.add(third);
        afisha.add(fourth);
        afisha.add(fifth);
        afisha.add(sixth);
        afisha.add(seventh);
        afisha.add(eighth);
        afisha.add(ninth);
        afisha.add(tenth);

        Movie[] expected = new Movie[]{
                tenth, ninth, eighth, seventh, sixth, fifth};

        assertArrayEquals(expected, afisha.showMovies());
    }
}