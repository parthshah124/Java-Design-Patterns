package info.parthshah.examples.prototype;

public abstract class Movie implements Cloneable {
    private String name;
    private int duration;

    public String getName(){ return name; }
    public void setName(String name) { this.name = name; }
    public int getDuration(){ return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    protected Movie clone(){
        try {
            return (Movie) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
