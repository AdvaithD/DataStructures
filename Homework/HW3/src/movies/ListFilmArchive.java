package movies;
import java.util.*;

public class ListFilmArchive extends ArrayList<Movie> implements FilmArchive {
	
	@Override
	/* Add a movie to the archive of films
	 * @param i - Movie to be added
	 * the argument and adds if not found */
	public boolean add(Movie i) {
		for(Movie x: this) {
			 if(x.equals(i)) return false; 
		}
		super.add(i);
		return true;
	}
	
	/* @return - an ArrayList of Movies in a sorted manner */
	public ArrayList<Movie> getSorted() {
		TreeSet<Movie> set = new TreeSet(this);
		return new ArrayList<Movie>(set);
		
	}
	
	public static void main(String[] args) {
		ListFilmArchive archive = new ListFilmArchive(); 
		for (Movie m: Movie.getTestMovies())
			archive.add(m); 
		for (Movie m: archive)
			System.out.println(m); 
		System.out.println("**************"); 
		for (Movie m: archive.getSorted())
			System.out.println(m);
		}
}
