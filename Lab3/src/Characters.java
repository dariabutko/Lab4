public abstract class Characters {

    private final String name;
    public String getName(){
        return this.name;
    }

    Characters(String name){
        this.name= name;
    }

    @Override
    public String toString(){
        return name;
    }
}