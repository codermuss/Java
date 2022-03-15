package oopIntroOdev;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie movie1 = new Movie(1, "Korku Seansý 3", "Korku, Gerilim", "Mustafa Yýlmaz", 2);
		Movie movie2 = new Movie(2, "Afacanlar", "Animasyon, Eðlence", "Gamze Yýlmaz", 2);
		Movie movie3 = new Movie(3, "Punisher", "Aksiyon, Gerilim", "Osman Yýlmaz", 2);

		Movie[] movies = { movie1, movie2, movie3 };

		for (Movie movie : movies) {
			System.out.println(movie.name + " " + movie.detail);
		}

		Game game1 = new Game(1, "Gta", "2000");
		Game game2 = new Game(2, "Apex", "2018");
		Game game3 = new Game(3, "Valorant", "2020");

		Game[] games = { game1, game2, game3 };

		for (Game game : games) {
			System.out.println(game.name + " " + game.releaseDate);
		}

		MovieManager movieManager = new MovieManager();
		movieManager.watchMovie(movie3);
	}

}
