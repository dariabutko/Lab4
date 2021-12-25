class HissandLaugh {
    interface hissInterface{
        void silent();
    }

    static class Hiss extends Characters implements hissInterface {

        Hiss(String name) {
            super(name);
        }

        @Override
        public void silent() {
            System.out.print(this.getName()+" смолкло, " +Time.NOWS.getTimeName()+" ");
        }
    }

    interface laughInterface{
        void sound();
    }

    static class Laugh extends Characters implements laughInterface {

        Laugh(String name){
            super(name);
        }

        @Override
        public void sound(){
            System.out.print("раздался дружный "+this.getName()+". "+"\n");
        }
    }
}

