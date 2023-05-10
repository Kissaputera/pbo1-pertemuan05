package latihanptm05;

public class Main {
    public static void main(String[] args) {  
    Matkul MK = new Matkul();
    MK.namaMatkul = "OOP";
    MK.jumlahSKS = 3;
    MK.dosenPembimbing = "Ahmad";
    MK.idDosen = 111;
    MK.email = "Ahmad549@gmail.com";
    MK.noTelepon = "089534444111";

    Matkul matKul = new Matkul();
    matKul.namaMatkul = "Algoritma dan Pemrograman";
    matKul.jumlahSKS = 3;
    matKul.dosenPembimbing = "Abdul";
    matKul.idDosen = 112;
    matKul.email = "Abdul548@gmail.com";
    matKul.noTelepon = "089534444112";
  
    MK.info();
    matKul.info();
    }
}
