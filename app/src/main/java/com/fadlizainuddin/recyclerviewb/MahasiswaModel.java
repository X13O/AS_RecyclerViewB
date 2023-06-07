package com.fadlizainuddin.recyclerviewb;

//MahasiswaModel berguna untuk menyimpan 1 buah record
public class MahasiswaModel {
    private String NIM, Nama, JenisKelamin, JP;

    public MahasiswaModel(){

    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.JenisKelamin = jenisKelamin;
    }

    public String getJP() {
        return JP;
    }

    public void setJP(String JP) {
        this.JP = JP;
    }
}
