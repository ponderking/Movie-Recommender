# Movie Recommender

#### Movie Recommender is a simple Java based program that allows you to select movies from a huge dataset of over 5000 movies and display information about them. The program will recommend movies to you based of other movies and genres that you enjoy.

##### **Info**: The program was intended to use the SPARQL database as a bridge and process the algorithm in Python but we ran into tons of problems with using Java, SPARQL and Python together so we deiced it was best to remove the python component and translate it to Java. 

## How to use:
* Clone or download this repository by running command below or [click here](https://github.com/ponderking/Movie-Recommender/archive/master.zip)
```
git clone https://github.com/ponderking/Movie-Recommender
```

1. Open the project folder `Movie Recommender` as a project in IntelliJ (Have not tested Eclipse)
2. Make sure the two required libraries found in the `lib` are recognized and added to your project settings. Both `GSON.jar`and the entire `lib` folder inside `lib/apache-jena-3.11.0/`
3. If you get "javafx.something does not exist" problems, try setting the JDK or language level to something that comes with javafx. 
4. To start the program run `public static void main(String[] args)`
5. The start window should appear:
6. Click `Start` to launch the program. This can take a few seconds..
7. The movie selection window will appear. Here you **must** select 5 movies from the list by **double clicking** on the entry in the list. You can also search the list by typing in the search bar above followed by pressing `enter`. To clear the search press `backspace` until search field is empty followed by pressing `enter`. You know a movie is selected when you can see the info about that movie on the display.
8. To add a movie to the your list, select a movie and press the `Add Movie To List` button.
9. If you make any mistakes you can clear the list by simply pressing the `Reset List` button.
10. Press `next` to continue after selecting 5 movies you enjoy.
11. This is the genre selection menu. Same rules apply here.
12. Once you have selected 3 genres press `next` to get your movie recommendations.
13. Here you can read about your recommendations.
14. You can try to delete the movie_tdb folder, in order to make the program setup the TDB and run JSONtoTDB again. This triggers when you press the Start button on the interface.
15. You can uncomment the code in testQueries in main to try some simulation of queries. 
15. **Enjoy!**


Some Important Classes:
database/JSOntoTDB.java is responsible for converting JSON to TDB, including tagging our data with a semantic vocabulary.
database/SPARQLQueries.java contains all sparql-queries being used.
movie/MovieRecommender.java contains recommendation algorithm
fx/RecommendationController.java contains presentation of recommendation, including calling queries to retrieve open-link semantic data.


![](https://i.imgur.com/52F3yNX.png)
![](https://i.imgur.com/CAQ9VKy.png)
![](https://i.imgur.com/DEqVnBZ.png)
![](https://i.imgur.com/EMMXDTQ.png)
