interface gunkaInterface{
    public void laugh();
    public void fall();
    public void hurt();
}

class Gunka extends Characters implements gunkaInterface{
    Gunka(String name){
        super(name);
    }

    public void laughing(){
        System.out.print("Смеялись все: и те, кто говорил, что шар полетит, и те, кто говорил, что не полетит, а ");
    }

    @Override
    public void laugh(){
        System.out.print(this.getName()+" смеялся так, что даже ");
    }

    public void fall(){
        System.out.print("свалился с крыши и ");
    }

    public void hurt(){
        System.out.print("набил на затылке шишку. "+"\n");
    }
}
