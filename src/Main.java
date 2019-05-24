import database.SparqlQueries;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import movie.Movie;
import org.apache.jena.rdf.model.Model;

import java.util.List;

public class Main extends Application {

    private static Model model;

    public static void main(String[] args) {
        launch(args);
    }

    private void testQueries(SparqlQueries queries) {

        //  YOU CAN USE THIS METHOD TO UNCOMMENT LINES AND TEST QUERIES.
        //  Run this top find the most common subjects of x amount of movies by y genre.

//        List<String> list = queries.selectRandomMoviesOfGenre(10, "Animation");
//        List<Movie> movies = queries.createMovieObjects(list);
//        List<String> topSubgenres = queries.predictSubgenres(movies);
//        System.out.println("\nBased on the movies...");
//        System.out.print("   ");
//        for(Movie m: movies) {
//            System.out.print(m.getTitle() + "  | ");
//        }
//        System.out.println("\nYou really seem to love " + topSubgenres.get(0) + "!");
//        System.out.println("You also really like " + topSubgenres.get(1) + "!");
//        System.out.println("As well as " + topSubgenres.get(2) + "!\n");
//        queries.close();
    }


    @Override
    public void start(Stage stage) throws Exception {
        SparqlQueries sparqlQueries = new SparqlQueries();
        testQueries(sparqlQueries);

        stage.setResizable(true);

        Parent root = FXMLLoader.load(getClass().getResource("fx/WelcomeScreen.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Movie Recommendation System");
        stage.setScene(scene);
        stage.show();
    }
}
