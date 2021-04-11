package test;

import perkuliahan.Penilaian;

public class TestRunner {
    public static void main(String[] args) {
        Penilaian penilaian  = new Penilaian();
        
        String nilaiDalamHuruf;
        
        //test case 1
        nilaiDalamHuruf = penilaian.hitungNilaiHuruf(65, 100, 80, 95, 100);
        System.out.println(nilaiDalamHuruf);
        //test case 2
        nilaiDalamHuruf = penilaian.hitungNilaiHuruf(80, 90, 90, 95, 95);
        System.out.println(nilaiDalamHuruf);
        //test case 3
        nilaiDalamHuruf = penilaian.hitungNilaiHuruf(95, 90, 95, 100, 80);
        System.out.println(nilaiDalamHuruf);
        //test case 4
        nilaiDalamHuruf = penilaian.hitungNilaiHuruf(75, 65, 85, 70, 55);
        System.out.println(nilaiDalamHuruf);
        //test case 5
        nilaiDalamHuruf = penilaian.hitungNilaiHuruf(60, 60, 65, 60, 60);
        System.out.println(nilaiDalamHuruf);
        //test case 6
        nilaiDalamHuruf = penilaian.hitungNilaiHuruf(50, 70, 50, 50, 50);
        System.out.println(nilaiDalamHuruf);
    }
}
