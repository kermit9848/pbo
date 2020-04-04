package latihan;

public class Main {
    public static void main(String[] args) throws Exception {
        Lampu Lampu1 = new Lampu("Lampu1");
        Lampu Lampu2 = new Lampu("Lampu2");
        Lampu1.statusLampu();
        Lampu2.statusLampu();
        Lampu1.on();
        Lampu1.statusLampu();
        Lampu2.on();
        Lampu2.statusLampu();
        Lampu1.off();
        Lampu1.statusLampu();
    }
}