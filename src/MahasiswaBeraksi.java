public class MahasiswaBeraksi {
    public static void main(String[] args){
        //membuat objek
        Mahasiswa anton = new Mahasiswa();
        Manager Adipriatino = new Manager();
        Programmer Dela = new Programmer();

        /* memanggil atribut dan memberi nilai */
        anton.setNim("10102020");
        anton.nama = "Anton Santoso";
        anton.jenisKelamin = "Laki-laki";
        anton.umur = 28;
        anton.alamat = "Bekasi Kota";
        anton.setJurusan("Informatika");
        System.out.println("Nim           : " + anton.getNim());
        System.out.println("Jurusan       : " + anton.getJurusan());
        //memanggil pegawai Manager
        Adipriatino.setNama("Adipriatino");
        Adipriatino.setGajiPokok(4000000);
        Adipriatino.setTunjangan(600000);

        //memanggil pegawai Programmer
        Dela.setNama("Dela");
        Dela.setGajiPokok(3000000);
        Dela.setBonus(1000000);


        anton.cetakInfo();
        Adipriatino.cetakInfo();
        Dela.cetakInfo();

    }
}

