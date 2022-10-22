package Pegawai;

import java.util.ArrayList;

public class Pegawai {
    private int id;
    private String nama;
    private String alamat;
    private String departemen;
    private int gaji;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public Pegawai(int id, String nama, String alamat, String departemen, int gaji) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.departemen = departemen;
        this.gaji = gaji;


    }
}
