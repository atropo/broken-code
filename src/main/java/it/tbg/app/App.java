package it.tbg.app;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import io.javalin.Javalin;
import it.tbg.app.models.Author;

public class App
{

    public static void main( String[] args )
    {
        Javalin app = Javalin.create().start(3000);

        app.get("/", context -> context.result("Welcome to the TBG Library"));

        Author sking = BooksData.StephenKing();
        app.get("/books", context -> context.json(sking));

        JsonNode authorInfo = new JsonNodeFactory().objectNode()
                        .put("name", sking.firstName + " " + sking.lastName)
                        .put("age", DateHelper.calculateAge(sking.getDateOfBirth()))
                        .put("books", sking.getBooks().size());

        app.get("/author", context -> context.json(authorInfo));


        System.out.println( "Listening on 3000" );
    }
}
