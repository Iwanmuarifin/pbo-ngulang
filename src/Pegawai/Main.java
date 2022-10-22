package Pegawai;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pegawai> SDA = new ArrayList<>();
        ArrayList<Pegawai> keuangan = new ArrayList<>();
        ArrayList<Pegawai> produksi = new ArrayList<>();
//    tipeData        namaVariabel = isiVariabel;

        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("1.tambah pegawai\n" +
                    "2.list pegawai\n" +
                    "3.edit pegawai\n"+
                    "4.exit");
            System.out.print("input menu coy: ");
            String menu = input.next();
            switch (menu) {
                case "1": {
                    System.out.println("input id coy");
                    int id = input.nextInt();
                    System.out.println("input nama coy");
                    String nama = input.next();
                    System.out.println("input alamat coy");
                    String alamat = input.next();
                    System.out.println("input departemen coy");
                    String departemen = input.next();
                    System.out.println("input gaji coy");
                    int gaji = input.nextInt();

                    if (departemen.equalsIgnoreCase("sda")) {
                        SDA.add(new Pegawai(id, nama, alamat, departemen, gaji));
                    } else if (departemen.equalsIgnoreCase("keuangan")) {
                        keuangan.add(new Pegawai(id, nama, alamat, departemen, gaji));
                    } else if (departemen.equalsIgnoreCase("produksi")) {
                        produksi.add(new Pegawai(id, nama, alamat, departemen, gaji));
                    } else {
                        System.out.println("gagal tambah pegawai, departemenya gak ada coy");
                        break;
                    }
                    System.out.println("berhasil tambah pegawai");
                    break;
                }
                case "2": {
                    for(Pegawai sda: SDA) {
                        System.out.println("-------------------------------");
                        System.out.println("Id: "+ sda.getId());
                        System.out.println("Nama: "+ sda.getNama());
                        System.out.println("Alamat: "+ sda.getAlamat());
                        System.out.println("Departemen: "+sda.getDepartemen());
                        System.out.println("Gaji: " + sda.getGaji());
                    }
                    System.out.println("-------------------------------");
                    break;
                }
                case "3": {
                    System.out.println("input id coy");
                    int id = input.nextInt();
                    System.out.println("input nama coy");
                    String nama = input.next();
                    System.out.println("input gaji coy");
                    int gaji = input.nextInt();

                    Pegawai index = null;
                    for (Pegawai pegawai: SDA) {
                        if (pegawai.getId() == id) {
                            index = pegawai;
                        } else {
                            System.out.println("id tidak ada");
                            break;
                        }
                    }

                    index.setNama(nama);
                    index.setGaji(gaji);
                    System.out.println("berhasil diubah");
                    break;
                }
                case "4": {
                    System.exit(0);
                    break;
                }
            }
        }

    }
}
