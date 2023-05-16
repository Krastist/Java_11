public class MovieManager {
    private MovieInformation[] informations = new MovieInformation[0];
    private int limit;

    public MovieManager() {
        this.limit = 5;
    }

    public int getLimit() {
        return limit;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addMovie (MovieInformation information) {
        MovieInformation[] film = new MovieInformation[informations.length + 1];
        for (int i = 0; i < informations.length; i++) {
            film[i] = informations[i];
        }
        film[film.length - 1] = information;
        informations = film;
    }

    public MovieInformation[] findAll() {
        return informations;
    }

    public MovieInformation[] findLast() {
        int length;
        if (informations.length < limit) {
            length = informations.length;
        } else {
            length = limit;
        }
        MovieInformation[] film = new MovieInformation[length];
        for (int i = 0; i < film.length; i++) {
            film[i] = informations[informations.length - 1 - i];
        }
        return film;
    }
}
