package OOPS;
class MovieDetails
{
	String movieName;
	String heroName;
	String heroInName;
	String directorName;
	int  movieBudjet;
	MovieDetails(String movieName,String heroName,String heroInName,String directorName,int movieBudjet)
	{
		this.movieName= movieName;
		this.heroName=heroName;
		this.heroInName=heroInName;
		this.directorName=directorName;
		this.movieBudjet=movieBudjet;
		System.out.println("MovieName"+" = "+movieName);
		System.out.println("HeroName"+" = "+heroName);
		System.out.println("HeroInName"+" = "+heroInName);
		System.out.println("DirectorName"+" = "+directorName);
		System.out.println("MovieBudjet"+" = "+movieBudjet);
	}
}
public class ConstructorsExampleFour 
{

	public static void main(String[] args)
	{
		new MovieDetails("Ramachary","Yash","RadhikaPandith","PawanWodeyar",100000000);

	}

}
