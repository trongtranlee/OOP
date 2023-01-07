package com.lab8.exercise4.part2;
import java.util.*;

//Exercise 4.2: Comparator
public class ComparatorTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("\nSorted by rating: ");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie : list) {
            System.out.println(movie.getName() + " "
                    + movie.getRating() + " " +
                    movie.getYear());
        }

        System.out.println("\nSorted by name: ");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie : list) {
            System.out.println(movie.getName() + " "
                    + movie.getRating() + " " +
                    movie.getYear());
        }

        Collections.sort(list);
        System.out.println("\nMovies after sorting: ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " "
                    + movie.getRating() + " " +
                    movie.getYear());
        }
    }
}
