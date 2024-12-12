package pkg;

public class Movie{
    //access = getter will return something, parameters
    //mutator = setter will return void
    // a class needs global variables, constructors, and methods
    String movieName;
	double rating;
	int numRating;
	int revenue;
    
    Movie mA = new Movie();
    Movie mB = new Movie("Forrest Gump", 8.8, 24, 700000000);
    Movie mC = new Movie("Spirited Away", 8.6, 16, 395800000);
    Movie mD = new Movie("Avengers", 8.0, 33, 623357910);
    
    System.out.println("-----------------------------");
    
    public String MovieToString(){
        return movieName;
    }
    
    public String getMovieName(){
        return movieName;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public double addRating(double a){
        a = rating;
        return (rating + 7.8)/2;
    }
    
    System.out.println("---------------------------------------------");
		/*
		System.out.println(mA.getMovieName() + " had a total revenue of " + mA.getRevenue());
		System.out.println(mB.getMovieName() + " had a total revenue of " + mB.getRevenue());
        System.out.println();
		System.out.println("-----------------------------");
		*/

		// Part 4	---------------------------------------------
		/*
        mB.addRating(7.8);
        mB.addRating(8.5);
		mB.movieToString();

        mC.addRating(10.0);
        mC.addRating(7.0);
		mC.movieToString();
		System.out.println("-----------------------------");
		*/

		// Part 5	---------------------------------------------
		/*
		if(mA.compareRatings(mB)){                     // Ignore movies of the same ratings
			System.out.println(mA.getMovieName() + " is better than " + mB.getMovieName());
		}
		else{
			System.out.println(mB.getMovieName() + " is better than " + mA.getMovieName());
		}
        System.out.println();
		System.out.println("-----------------------------");
		*/
}
