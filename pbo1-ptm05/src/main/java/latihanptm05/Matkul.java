package latihanptm05;

public class Matkul {
    String namaMatkul;
    String dosenPembimbing;
    String noTelepon;
    String email;
    int jumlahSKS;
    int idDosen;
 
    void info(){
        System.out.println("Nama Mata Kuliah                    : "+namaMatkul);
        System.out.println("Jumlah SKS                          : "+jumlahSKS);
        System.out.println("Nama Dosen Pembimbing               : "+dosenPembimbing);
        System.out.println("Id Dosen Bersangkutan               : "+idDosen);
        System.out.println("Nomor Telepon Dosen Bersangkutan    : "+noTelepon);
        System.out.println("Email Dosen Bersangkutan            : "+email);
        System.out.println();
    }
}  