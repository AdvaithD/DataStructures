package movies;
import java.util.ArrayList;

//Java class that implements the Comparable interface

public class Movie implements Comparable<Movie> {
 private String title;
 private int year;

 public Movie(String t, int y) {
	 title = t;
	 year = y;
 }
 
/* Returns the title of a movie */
 public String getTitle() {
	 return title;
 }
 
 /* Returns the year of a movie */
 public int getYear() {
	 return year;
 }
 
/* compare two movies
 @param that - compare movie `this` to `that` */ 
 
 @Override
 public int compareTo(Movie that) {
	 if(this.title.compareTo(that.title) == 0) {
		 return (int)Math.signum(this.year - that.year);
	 }
	 else {
		 return this.title.compareTo(that.title);
	 }
 }
 
//check if two movies are equal
 @Override
 public boolean equals(Object o) {
	 Movie compareMovie = (Movie)o;
	 return this.compareTo(compareMovie) == 0;
 }
 
 /* @return - String
  * a movie in string format */
 @Override
 public String toString() {
	return "Movie " + title + " " + "(" + year + ")";
	 
 }
 
 @Override
 /* hashcode method */
 public int hashCode() {
	 return title.hashCode() + year; }

 /* test with a set of movies */
 public static Movie[] getTestMovies() {
	 Movie[] listOfMovies = new Movie[10];	
	 listOfMovies[0] = new Movie("James Bond Golden Eye", 1971);
	 listOfMovies[1] = new Movie("James Bond Golden Eye", 1999);
	 listOfMovies[2] = new Movie("Casino Royal", 2011);
	 listOfMovies[3] = new Movie("Mission Impossible", 2011);
	 listOfMovies[4] = new Movie("The Matrix", 2016);
	 listOfMovies[5] = new Movie("The Matrix", 2016);
	 listOfMovies[6] = new Movie("Road Rash", 2000);
	 listOfMovies[7] = new Movie("Now You See Me", 2013);
	 listOfMovies[8] = new Movie("Now You See Me", 2016);
	 listOfMovies[9] = new Movie("Harry Potter", 2005);
	 
	 return listOfMovies;
 }
}
