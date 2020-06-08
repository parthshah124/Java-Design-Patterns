package info.parthshah.examples.builder;

public class PizzaOrder {

    public static class Builder{
        private String base = "";
        private String sauce = "";
        private String cheese = "";
        private String topping = "";

        public PizzaOrder build(){
            return new PizzaOrder(this);
        }

        public Builder base(String base){
            this.base = base;
            return this;
        }

        public Builder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public Builder cheese(String cheese){
            this.cheese = cheese;
            return this;
        }

        public Builder topping(String topping){
            this.topping = topping;
            return this;
        }
    }

    private final String base;
    private final String sauce;
    private final String cheese;
    private final String topping;

    private PizzaOrder(Builder builder) {
        this.base = builder.base;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    public String getBase(){
        return base;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }

    public String toString(){
        return getBase() + " " + getCheese() + " " + getSauce() + " " + getTopping();
    }
}
