interface pilulkinInterface{
    public void treat();
    public void smear();
}
 class Pilulkin extends Characters implements pilulkinInterface{

    Pilulkin(String name){
        super(name);
    }

    @Override
     public void treat(){
        System.out.print("Пришлось "+this.getName()+" "+Time.NOWT+" лечить его ");
    }
    @Override
     public void smear(){
        System.out.print("и намазать шишку йодом. "+"\n");
    }
 }