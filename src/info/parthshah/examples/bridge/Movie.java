package info.parthshah.examples.bridge;

public class Movie {
    private String name;
    private String year;
    private String runtime;

    public Movie(String name, String year, String runtime) {
        this.name = name;
        this.year = year;
        this.runtime = runtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
}
