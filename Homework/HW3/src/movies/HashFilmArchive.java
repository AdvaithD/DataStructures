package movies;
import java.util.*;

/* HashFilmArchive class
 * */

public class HashFilmArchive extends HashSet<Movie> implements FilmArchive {
	/* getSorted method
	 * @return - Sorted ArrayList */
	public ArrayList<Movie> getSorted() {
		TreeSet<Movie> set = new TreeSet(this);
		return new ArrayList<Movie>(set);
		
	}
	
	public static void main(String[] args) {
		HashFilmArchive archive = new HashFilmArchive(); 
		for (Movie m: Movie.getTestMovies())
			archive.add(m); 
		for (Movie m: archive)
			System.out.println(m); 
		System.out.println("**************"); 
		for (Movie m: archive.getSorted())
			System.out.println(m);
		}
}
