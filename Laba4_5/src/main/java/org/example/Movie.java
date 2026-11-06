package org.example;

public class Movie {
    private String title;
    private String director;
    private double rating;

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public double getRating() {
        return rating;
    }

    public String toString(){
        return "Название" + title + "Режисер" + director + "Рейтинг" + rating;
    }

    public static void main(String[] args) {
        Movie[] movies = new Movie[] {
                new Movie("Начало", "Кристофер Нолан", 8.8),
                new Movie("Побег из Шоушенка", "Фрэнк Дарабонт", 9.3),
                new Movie("Криминальное чтиво", "Квентин Тарантино", 8.9),
                new Movie("Интерстеллар", "Кристофер Нолан", 8.6),
                new Movie("Зеленая миля", "Фрэнк Дарабонт", 9.1),
                new Movie("Матрица", "Лана и Лилли Вачовски", 8.7)
        };

        Movie maxRatingMovie = movies[0];
        double totalRating = 0;

        for (Movie movie : movies) {
            if (movie.getRating() > maxRatingMovie.getRating()) {
                maxRatingMovie = movie;
            }
            totalRating += movie.getRating();
        }

        double averageRating = totalRating / movies.length;

        System.out.println("Фильм с максимальным рейтингом:");
        System.out.println("\"" + maxRatingMovie.getTitle() + "\" (Режиссер: " + maxRatingMovie.getDirector() + ", Рейтинг: " + maxRatingMovie.getRating() + ")");
        System.out.printf("Средний рейтинг всех 6 фильмов: %.2f%n", averageRating);
        System.out.println(maxRatingMovie);
    }
}