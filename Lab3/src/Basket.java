public class Basket{

    String name;
    boolean isStay;

    public Basket(String name){
        this.name = name;
    }

    public static void main( String[] args){

        Basket basket = new Basket("Корзина");
        basket.stay();
    }

    public void stay(){
        System.out.print("Шар быстро стал уеньшаться.\n");
        this.isStay = true;
    }
    public void deflate() throws BalloonException {
        System.out.print("Шар обмяк, сморщился, как сушеная груша, и скрылся на дне корзины.\n");
        if (isStay){
            System.out.print("На месте огромного шара теперь соит только корзина.\n");
        }
        else {
            throw new BalloonException("Шар не сдулся и полетел.\n");
        }
    }
}
