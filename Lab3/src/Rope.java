public class Rope{

    String name;
    boolean isTightenTight;

    public Rope(String name){
        this.name = name;
    }

    public static void main( String[] args){

        Rope rope = new Rope("Веревочка");
        rope.tightTighten();
        try {
            rope.undo();
        } catch (ZnaikaIsNotReadyException e) {
            System.out.print(e.getMessage());
            System.out.print("Проверим веревку: Она завязана?"+rope.isTightenTight);
            e.printStackTrace();
        }

    }

    public void tightTighten(){
        System.out.print("Веревочка туго стягивает резиновую трубку внизу.");
        this.isTightenTight = true;
    }
    public void undo() throws ZnaikaIsNotReadyException {
        System.out.print("Знайка хочет развязвть веревочку!\n");
        if (isTightenTight){
            System.out.print("Знайка справился!\n");
        }
        else {
            throw new ZnaikaIsNotReadyException("Знайка не смог развязать веревочку.");
            }
    }
}
