public class Main {
    public static void main(String[] args) throws ZnaikaIsNotReadyException, BalloonException {
        HissandLaugh.Hiss hiss = new HissandLaugh.Hiss("Шипение");
        HissandLaugh.Laugh laugh = new HissandLaugh.Laugh("взрыв смеха");
        gunkaInterface gunka = new Gunka("Незнайкин друг Гунька");
        pilulkinInterface pilulkin = new Pilulkin("доктору Пилюлькину");
        ZnaikaInterface znaika = new Znaika("Знайка");
        Air air = new Air("воздух");
        Balloon balloon = new Balloon(new String("шар"));
        Rope rope = new Rope("Веревочка");
        Basket basket = new Basket("Корзина");

        air.warm();
        znaika.decide();
        balloon.fill();
        air.free();
        rope.tightTighten();
        rope.undo();
        air.leave();
        basket.stay();
        basket.deflate();

        hiss.silent();
        laugh.sound();
        gunka.laugh();
        gunka.fall();
        gunka.hurt();
        pilulkin.treat();
        pilulkin.smear();
        znaika.notpayattention();
        znaika.connect();
        znaika.order();
        air.begin();
        air.go();
        balloon.become();
    }
}
