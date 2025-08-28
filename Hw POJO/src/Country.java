public class Country {
    private String country;
    private int population;
    private double square;
    private String capital;
    private boolean accessSea;

    public Country(String country){
        this.country = country;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation(){
        return population;
    }

    public void setPopulation(int population){
        this.population = population;
    }

    public double getSquare(){
        return square;
    }

    public void setSquare(double square){
        this.square = square;
    }

    public String getCapital(){
        return capital;
    }

    public void setCapital(String capital){
        this.capital = capital;
    }

    public boolean getAccessSea(){
        return accessSea;
    }

    public void setAccessSea(boolean accessSea){
        this.accessSea = accessSea;
    }
}
