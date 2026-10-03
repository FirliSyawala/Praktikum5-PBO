package tugas5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BukuHarian {
    private String namaPemilik;
    private String namaFile;

    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        this.namaFile = "diary_" + namaPemilik + ".txt";
    }

    public void tulisCatatan(String tanggal, String isi) {
        try {
            FileWriter writer = new FileWriter(namaFile, true);
            writer.write(tanggal + " - " + isi + "\n");
            writer.close();

            System.out.println("Catatan berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan catatan.");
        }
    }

    public void bacaCatatan() {
        try {
            File file = new File(namaFile);

            if (!file.exists() || file.length() == 0) {
                System.out.println("Belum ada catatan harian.");
                return;
            }

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch (IOException e) {
            System.out.println("Belum ada catatan harian.");
        }
    }
}