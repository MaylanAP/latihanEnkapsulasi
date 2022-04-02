package com.company;

/*maylan anggi puspita
2015061023
PSTI C
*/
class siswa{
    String nama;
    private int kelas;
    private int absen;

    siswa(String nama, int kelas, int absen){
        this.nama = nama;
        this.kelas = kelas;
        this.absen = absen;
    }

    public void setKelas(int kelas){ //setting kelas
        this.kelas = kelas;
    }
    public int getabsen(){
        System.out.print("\nNo Absen : ");
        return this.absen;
    }
    public String getNama(){
        System.out.print("Nama : ");
        return this.nama;
    }

    void tampil(){ //method
        System.out.println("\n=====Data baru====");
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("Absen   : " + absen);
    }
}

public class Main {

    public static void main(String[] args) {
	siswa org1 = new siswa("Maylan", 3, 18);
    org1.tampil();

    org1.setKelas(6);
    org1.tampil();

    System.out.println(org1.getabsen());
    System.out.println(org1.getNama());


    siswa org2 = new siswa("Anggi", 3, 3);
    org2.tampil();
    org2.setKelas(5);
    org2.tampil();

    }
}
