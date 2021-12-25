public class Air extends Characters{
    Air(String name){
        super(name);
    }

    public void begin(){
        System.out.print("В котел начал поступать свежий "+this.getName()+", а ");
    }

    public void go(){
        System.out.print("нагретый "+this.getName()+" по трубке проходил прямо в шар.\n");
    }

    public void warm(){
        System.out.print(Time.BYTHITIME.getTimeName()+this.getName()+" уже достаточно нагрелся в котле, и ");
    }

    public void free(){
        System.out.print("из него нужно было выпустить сначала холодный "+this.getName()+".\n");
    }

    public void leave(){
        System.out.print("Холодный "+this.getName()+" с громким шипением начал выходить из шара.\n");
    }
}