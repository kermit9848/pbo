package latihan;

public class app {
    public static void main(String[] args) throws Exception {
        binatang bin = new binatang();

        bin.makan();
        bin.tidur();


        kucing riko = new kucing();

        riko.makan();
        riko.tidur();
        riko.ngeong();
    }
}