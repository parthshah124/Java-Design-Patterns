package info.parthshah.examples.prototype;

public class ActionMovie extends Movie {
    private String director;

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public String toString(){
        return this.getName() + " " + this.getDuration() + " " + this.getDirector();
    }
}
