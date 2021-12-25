import java.util.SplittableRandom;

interface ZnaikaInterface {
    void notpayattention();
    void connect();
    void order();
    void decide();
}

public class Znaika extends Characters implements ZnaikaInterface{

    Znaika(String name) {
        super(name);
    }

    private final String kotelsharom = "котел с шаром длинной трубкой";

    public String connectkotel(){
        return this.kotelsharom;
    }

    @Override
    public void notpayattention() {
        System.out.print("Но "+this.getName()+" " +Time.THISTIME.getTimeName()+" не обратил на насмешки внимания. "+"\n");
    }

    static Znaika he = new Znaika("Он"){
        @Override
        public void connect() {
            super.connect();
            System.out.print("Он соединил "+connectkotel());
        }
    };

    public static void main(String[] args){
        he.connect();
    }

    @Override
    public void connect() {
        System.out.print("Он соединил "+connectkotel());
    }
    @Override
    public String toString(){
        return kotelsharom;
    }

    @Override
    public void order(){
        System.out.print(" и приказал качать насос. "+"\n");
    }

    @Override
    public void decide(){
        System.out.print(this.getName()+" решил, что пора приступать к наполнению шара горячим воздухом. "+"\n");
    }
}

