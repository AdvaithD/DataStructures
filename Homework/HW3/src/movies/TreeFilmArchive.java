package movies;
import java.util.*;

/* TreeFilmArchive class implements the FilmArchive interface*/
public class TreeFilmArchive extends TreeSet<Movie> implements FilmArchive {

/* @return - a sorted ArrayList */
 public ArrayList<Movie> getSorted() {
	 return new ArrayList<Movie>(this);
 }
 public static void main(String[] args) {
		TreeFilmArchive archive = new TreeFilmArchive(); 
		for (Movie m: Movie.getTestMovies())
			archive.add(m); 
		for (Movie m: archive)
			System.out.println(m);
		System.out.println("**************"); 
		for (Movie m: archive.getSorted())
			System.out.println(m);
		}
}
