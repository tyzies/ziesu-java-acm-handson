import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Collections
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * ArrayList, generics, operasi CRUD, dan iterasi collections.
         */

        // ===== PERBEDAAN ARRAY VS ARRAYLIST =====
        System.out.println("=== PERBEDAAN ARRAY VS ARRAYLIST ===");

        // Latihan 1: Demonstrasi keterbatasan array vs keunggulan ArrayList
        // - Buat array integer dengan ukuran tetap 3
        int[] arr = new int[3];

        // - Buat ArrayList<Integer> kosong
        ArrayList<Integer> list = new ArrayList<>();

        // - Coba tambahkan 5 elemen ke array (akan error/terbatas)
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        // - Tambahkan 5 elemen ke ArrayList (dinamis)
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        // - Print ukuran keduanya dan jelaskan perbedaannya dalam komentar
        System.out.println("Ukuran array: " + arr.length);
        System.out.println("Ukuran ArrayList: " + list.size());

        // ===== GENERICS DASAR =====
        System.out.println("\n=== GENERICS DASAR ===");

        // Latihan 2: Memahami generics dan type safety
        // - Buat ArrayList tanpa generics (raw type) dan tambahkan berbagai tipe data
        ArrayList rawList = new ArrayList();
        rawList.add("Teks");
        rawList.add(123);
        rawList.add(4.56);
        System.out.println("Raw list: " + rawList);

        // - Buat ArrayList<String> dengan generics dan tambahkan hanya String
        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("Satu");
        listStr.add("Dua");
        System.out.println("ArrayList<String>: " + listStr);

        // - Buat ArrayList<Double> untuk menyimpan nilai desimal
        ArrayList<Double> listDouble = new ArrayList<>();
        listDouble.add(1.5);
        listDouble.add(2.75);
        System.out.println("ArrayList<Double>: " + listDouble);

        // - Demonstrasikan type safety dengan mencoba menambahkan tipe yang salah
        // listStr.add(123); // error jika dicoba

        // ===== OPERASI CRUD PADA ARRAYLIST =====
        System.out.println("\n=== OPERASI CRUD PADA ARRAYLIST ===");

        // Latihan 3: Create - Menambah data
        ArrayList<String> daftarMahasiswa = new ArrayList<>();

        // - Tambahkan 5 nama mahasiswa menggunakan add()
        daftarMahasiswa.add("Andi");
        daftarMahasiswa.add("Budi");
        daftarMahasiswa.add("Citra");
        daftarMahasiswa.add("Dewi");
        daftarMahasiswa.add("Eka");

        // - Tambahkan mahasiswa di posisi tertentu menggunakan add(index, element)
        daftarMahasiswa.add(2, "Fajar"); // tambah di posisi tertentu

        // - Print daftar mahasiswa
        System.out.println("Daftar Mahasiswa: " + daftarMahasiswa);

        // Latihan 4: Read - Membaca data
        // - Baca mahasiswa pertama menggunakan get(0)
        System.out.println("Mahasiswa pertama: " + daftarMahasiswa.get(0));

        // - Baca mahasiswa terakhir
        System.out.println("Mahasiswa terakhir: " + daftarMahasiswa.get(daftarMahasiswa.size() - 1));

        // - Cek apakah ada mahasiswa dengan nama tertentu menggunakan contains()
        System.out.println("Apakah ada 'Budi'? " + daftarMahasiswa.contains("Budi"));

        // - Temukan index mahasiswa tertentu menggunakan indexOf()
        System.out.println("Index 'Citra': " + daftarMahasiswa.indexOf("Citra"));

        // - Print ukuran ArrayList menggunakan size()
        System.out.println("Ukuran daftar: " + daftarMahasiswa.size());

        // Latihan 5: Update - Mengubah data
        // - Ubah nama mahasiswa di index tertentu menggunakan set()
        daftarMahasiswa.set(1, "Budianto");

        // - Print daftar setelah update
        System.out.println("Setelah update: " + daftarMahasiswa);

        // Latihan 6: Delete - Menghapus data
        // - Hapus mahasiswa berdasarkan index menggunakan remove(index)
        daftarMahasiswa.remove(0);

        // - Hapus mahasiswa berdasarkan nama menggunakan remove(object)
        daftarMahasiswa.remove("Eka");

        // - Hapus semua mahasiswa menggunakan clear()
        daftarMahasiswa.clear();

        // - Cek apakah ArrayList kosong menggunakan isEmpty()
        System.out.println("Setelah clear, kosong? " + daftarMahasiswa.isEmpty());

        // ===== ITERASI ARRAYLIST =====
        System.out.println("\n=== ITERASI ARRAYLIST ===");

        // Latihan 7: Berbagai cara iterasi
        ArrayList<Integer> angka = new ArrayList<>();
        // Isi dengan angka 10, 20, 30, 40, 50
        angka.add(10);
        angka.add(20);
        angka.add(30);
        angka.add(40);
        angka.add(50);

        // - Iterasi menggunakan traditional for loop
        for (int i = 0; i < angka.size(); i++) {
            System.out.print(angka.get(i) + " ");
        }
        System.out.println();

        // - Iterasi menggunakan enhanced for loop (for-each)
        for (int a : angka) {
            System.out.print(a + " ");
        }
        System.out.println();

        // - Iterasi menggunakan while loop
        int i = 0;
        while (i < angka.size()) {
            System.out.print(angka.get(i) + " ");
            i++;
        }
        System.out.println();

        // - Iterasi menggunakan Iterator
        Iterator<Integer> it = angka.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // ===== ARRAYLIST DENGAN TIPE DATA KOMPLEKS =====
        System.out.println("\n=== ARRAYLIST DENGAN TIPE DATA KOMPLEKS ===");

        // Latihan 8: ArrayList of Arrays (simulasi objects)
        // - Buat ArrayList<String[]> untuk menyimpan data mahasiswa (nama, nim, jurusan)
        ArrayList<String[]> dataMahasiswa = new ArrayList<>();

        // - Tambahkan 3 data mahasiswa
        // TODO: Tambahkan data mahasiswa
        dataMahasiswa.add(new String[]{"Andi", "123", "TI"});
        dataMahasiswa.add(new String[]{"Budi", "124", "SI"});
        dataMahasiswa.add(new String[]{"Citra", "125", "MI"});

        // - Print semua data dengan format tabel
        // TODO: Print dalam format tabel
        System.out.println("Nama\tNIM\tJurusan");
        for (String[] mhs : dataMahasiswa) {
            System.out.println(mhs[0] + "\t" + mhs[1] + "\t" + mhs[2]);
        }

        // ===== UTILITY METHODS COLLECTIONS =====
        System.out.println("\n=== UTILITY METHODS COLLECTIONS ===");

        // Latihan 9: Eksplorasi Collections utility
        ArrayList<Integer> numbers = new ArrayList<>();
        // TODO: Isi dengan angka: 64, 34, 25, 12, 22, 11, 90
        numbers.add(64);
        numbers.add(34);
        numbers.add(25);
        numbers.add(12);
        numbers.add(22);
        numbers.add(11);
        numbers.add(90);

        // - Gunakan Collections.sort() untuk mengurutkan
        // TODO: Sort list
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        // - Gunakan Collections.reverse() untuk membalik urutan
        // TODO: Reverse list
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        // - Gunakan Collections.shuffle() untuk mengacak
        // TODO: Shuffle list
        Collections.shuffle(numbers);
        System.out.println("Shuffle: " + numbers);

        // - Gunakan Collections.max() dan Collections.min()
        // TODO: Find max dan min
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));

        // - Gunakan Collections.frequency() untuk menghitung kemunculan elemen
        // TODO: Count frequency
        int freq = Collections.frequency(numbers, 22);
        System.out.println("Frequency of 22: " + freq);

        // ===== SEARCHING DAN SORTING =====
        System.out.println("\n=== SEARCHING DAN SORTING ===");

        // Latihan 10: Implementasi search dan sort
        ArrayList<String> buah = new ArrayList<>();
        // TODO: Isi dengan: "Apel", "Jeruk", "Mangga", "Pisang", "Anggur"
        buah.add("Apel");
        buah.add("Jeruk");
        buah.add("Mangga");
        buah.add("Pisang");
        buah.add("Anggur");

        // - Sort secara alfabetis
        // TODO: Sort alphabetically
        Collections.sort(buah);
        System.out.println("Sorted buah: " + buah);

        // - Implementasikan binary search pada list yang sudah diurutkan
        // TODO: Binary search
        int idx = Collections.binarySearch(buah, "Mangga");
        System.out.println("Binary search 'Mangga': index " + idx);

        // - Implementasikan linear search untuk list yang tidak diurutkan
        // TODO: Linear search
        int linearIdx = linearSearch(buah, "Pisang");
        System.out.println("Linear search 'Pisang': index " + linearIdx);

        // ===== ARRAYLIST 2D =====
        System.out.println("\n=== ARRAYLIST 2D ===");

        // Latihan 11: ArrayList of ArrayList (2D dynamic array)
        // - Buat ArrayList<ArrayList<Integer>> untuk merepresentasikan matriks dinamis
        ArrayList<ArrayList<Integer>> matrix2D = new ArrayList<>();

        // - Buat 3 baris dengan panjang yang berbeda-beda
        // TODO: Create jagged 2D ArrayList
        for (int r = 0; r < 3; r++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int c = 0; c < r+2; c++) row.add((r+1)*(c+1));
            matrix2D.add(row);
        }

        // - Isi dengan nilai dan print dalam format matriks
        // TODO: Fill dan print matrix
        printMatrix2D(matrix2D);

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem manajemen perpustakaan sederhana
        ArrayList<String[]> daftarBuku = new ArrayList<>();
        // Format: [judul, pengarang, tahun, status] // status: "tersedia" atau "dipinjam"

        // - Tambahkan 5 buku
        // TODO: Tambahkan data buku
        daftarBuku.add(new String[]{"Java Basics","Andi","2020","tersedia"});
        daftarBuku.add(new String[]{"Data Structures","Budi","2019","tersedia"});
        daftarBuku.add(new String[]{"Algorithms","Citra","2021","tersedia"});
        daftarBuku.add(new String[]{"Database Systems","Dewi","2018","tersedia"});
        daftarBuku.add(new String[]{"Networking","Eka","2022","tersedia"});

        // - Implementasikan fungsi pinjam buku (ubah status)
        // TODO: Implementasikan pinjam buku
        pinjamBuku(daftarBuku, "Algorithms");

        // - Implementasikan fungsi kembalikan buku
        // TODO: Implementasikan kembalikan buku
        kembalikanBuku(daftarBuku, "Algorithms");

        // - Implementasikan pencarian buku berdasarkan judul
        // TODO: Implementasikan search buku
        String[] hasilCari = cariBuku(daftarBuku, "Java Basics");
        if (hasilCari != null) System.out.println("Ditemukan: " + hasilCari[0] + " oleh " + hasilCari[1]);

        // - Print daftar buku yang tersedia
        // TODO: Print available books
        System.out.println("Buku tersedia:");
        for (String[] b : daftarBuku) if (b[3].equals("tersedia")) System.out.println(b[0] + " - " + b[1]);

        // Latihan 13: Sistem nilai mahasiswa dinamis
        // TODO: Implementasikan sistem nilai yang bisa menambah mahasiswa dinamis
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(80); nilai.add(90); nilai.add(75);
        System.out.println("Rata-rata nilai: " + hitungRataRata(nilai));

        // ===== PERFORMANCE COMPARISON =====
        System.out.println("\n=== PERFORMANCE COMPARISON ===");

        // Latihan 14: Bandingkan performa Array vs ArrayList
        // TODO: Implementasikan comparison waktu akses, insert, search
        int[] arrPerf = new int[100000];
        ArrayList<Integer> listPerf = new ArrayList<>();
        for (int j = 0; j < 100000; j++) { arrPerf[j] = j; listPerf.add(j); }
        long start = System.nanoTime(); int x = arrPerf[50000]; long end = System.nanoTime();
        System.out.println("Akses array: " + (end-start) + " ns");
        start = System.nanoTime(); int y = listPerf.get(50000); end = System.nanoTime();
        System.out.println("Akses ArrayList: " + (end-start) + " ns");
    }

    // ===== HELPER METHODS =====
    // TODO: Implementasikan method-method pembantu di sini

    public static void printArrayList(ArrayList<?> list, String title) {
        System.out.println(title + ": " + list);
    }

    public static int linearSearch(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) if (list.get(i).equals(target)) return i;
        return -1;
    }

    public static void printMatrix2D(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static boolean pinjamBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] b : daftarBuku) {
            if (b[0].equals(judul) && b[3].equals("tersedia")) { b[3] = "dipinjam"; return true; }
        }
        return false;
    }

    public static boolean kembalikanBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] b : daftarBuku) {
            if (b[0].equals(judul) && b[3].equals("dipinjam")) { b[3] = "tersedia"; return true; }
        }
        return false;
    }

    public static String[] cariBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] b : daftarBuku) if (b[0].equals(judul)) return b;
        return null;
    }

    public static double hitungRataRata(ArrayList<Integer> values) {
        if (values.isEmpty()) return 0.0;
        int sum = 0; for (int v : values) sum += v;
        return (double) sum / values.size();
    }
}
