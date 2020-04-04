package app;

public class App {
    public static void main(String[] args) throws Exception {
        karyawan Ridho = new karyawan("12345", "Ridho");
        karyawan Melan = new karyawan("12346", "Melan");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        Ridho.getInfo();
        Ridho.absenPagi();
        Ridho.kerja();
        Ridho.absenPulang();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        Melan.getInfo();
        Melan.absenPagi();
        Melan.kerja();
        Melan.absenPulang();

        dosen Andiani = new dosen("23455","332211","Andiani");
        dosen Ionia = new dosen("23456","332212","Ionia");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        Andiani.absenPagi();
        Andiani.ngajar();
        Andiani.absenPulang();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        Ionia.ngajar();
        Ionia.absenPagi();
        Ionia.kerja();
        Ionia.absenPulang();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        Ridho.getInfo();
        Melan.getInfo();
        Andiani.getInfo();
        Ionia.getInfo();
    }
}