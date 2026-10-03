package tugas5;

public class MainDiary {
    public static void main(String[] args) {

        BukuHarian diary = new BukuHarian("Firli");

        diary.tulisCatatan("12-09-3000", "Saya Firli Syawala, hari ini saya belajar pemrograman Java.");
        diary.tulisCatatan("17-11-2006", "Hari ini saya mengerjakan tugas praktikum PBO.");

        System.out.println("\n=== CATATAN HARIAN ===");
        diary.bacaCatatan();
    }
}