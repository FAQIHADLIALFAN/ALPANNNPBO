public class pbo1 {
    abstract class Hewan {
        abstract void suara();
    }
    
    class Macan extends Hewan {
        void suara() {
            System.out.println("Rawrr");
        }
    }
    public static void main(String[] args) {
        pbo1 program = new pbo1();
        program.run();
    }

    void run() {
        Macan macanku = new Macan();
        macanku.suara();
    }

}
