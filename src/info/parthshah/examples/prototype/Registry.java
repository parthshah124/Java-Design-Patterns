package info.parthshah.examples.prototype;

import java.util.HashMap;

public class Registry {
    private HashMap<String, Movie> registry = new HashMap<String, Movie>();
    public Registry(){
        load();
    }

    public Movie createMovie(String type){
        return registry.get(type).clone(); // Shallow copy
    }

    private void load(){
        ActionMovie movie1 = new ActionMovie();
        movie1.setName("Avengers");
        movie1.setDuration(200);
        movie1.setDirector("Russo Bros.");

        RomanticMovie movie2 = new RomanticMovie();
        movie2.setName("Notebook");
        movie2.setDuration(150);
        movie2.setActors(new String[] {"Ryan Gosling", "Rachel McAdams"});

        registry.put("action", movie1);
        registry.put("romantic", movie2);
    }
}
