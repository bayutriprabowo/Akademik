package perkuliahan;

public class Penilaian {
    public String hitungNilaiHuruf(int nilaiMatematika, int nilaiFisika, int nilaiKimia, int nilaiBiologi, int nilaiKomputer) {
        String nilaiDalamHuruf;
        
        int nilaiRata2 = (nilaiMatematika + nilaiFisika + nilaiKimia + nilaiBiologi + nilaiKomputer)/5;
        
        if(nilaiRata2 <= 100 && nilaiRata2 >= 90) {
            nilaiDalamHuruf = "A";
        } else if(nilaiRata2 < 90 && nilaiRata2 >= 80) {
            nilaiDalamHuruf = "B";
        } else if(nilaiRata2 < 80 && nilaiRata2 >= 70) {
            nilaiDalamHuruf = "C";
        } else if(nilaiRata2 < 70 && nilaiRata2 >= 60) {
            nilaiDalamHuruf = "D";
        } else if(nilaiRata2 < 60 && nilaiRata2 >= 0) {
            nilaiDalamHuruf = "E";
        } else {
            nilaiDalamHuruf = "input tidak benar";
        }
        
        return nilaiDalamHuruf;
    }
}
