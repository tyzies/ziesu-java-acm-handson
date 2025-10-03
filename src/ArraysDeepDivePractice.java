import java.util.Arrays;
import java.util.Random;

public class ArraysDeepDivePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Arrays Deep Dive
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * array multidimensi, operasi lanjutan, parameter/return value, dan utility methods.
         */

        // ===== ARRAY MULTIDIMENSI DASAR =====
        System.out.println("=== ARRAY MULTIDIMENSI DASAR ===");

        // Latihan 1: Membuat dan mengisi array 2D (matriks)
        // - Buat array 2D integer dengan ukuran 3x4 (3 baris, 4 kolom)
        int[][] numbers2D = new int[3][4];

        // - Isi array dengan nilai: baris 0: [1,2,3,4], baris 1: [5,6,7,8], baris 2: [9,10,11,12]
        numbers2D[0][0] = 1; numbers2D[0][1] = 2; numbers2D[0][2] = 3; numbers2D[0][3] = 4;
        numbers2D[1][0] = 5; numbers2D[1][1] = 6; numbers2D[1][2] = 7; numbers2D[1][3] = 8;
        numbers2D[2][0] = 9; numbers2D[2][1] = 10; numbers2D[2][2] = 11; numbers2D[2][3] = 12;

        // - Print seluruh matriks menggunakan nested loop dengan format yang rapi
        for (int i = 0; i < numbers2D.length; i++) {
            for (int j = 0; j < numbers2D[i].length; j++) {
                System.out.print(numbers2D[i][j] + " ");
            }
            System.out.println();
        }

        // Latihan 2: Array 2D dengan inisialisasi langsung
        // - Buat array 2D string yang merepresentasikan papan catur 3x3 dengan nilai awal "."
        String[][] papan = new String[3][3];
        papan[0][0] = "."; papan[0][1] = "."; papan[0][2] = ".";
        papan[1][0] = "."; papan[1][1] = "."; papan[1][2] = ".";
        papan[2][0] = "."; papan[2][1] = "."; papan[2][2] = ".";

        // - Tempatkan "X" di posisi [0][0], [1][1], dan [2][2] (diagonal)
        // - Tempatkan "O" di posisi [0][2], [1][0], dan [2][1]
        papan[0][0] = "X"; papan[1][1] = "X"; papan[2][2] = "X";
        papan[0][2] = "O"; papan[1][0] = "O"; papan[2][1] = "O";

        // - Print papan dengan format grid yang rapi
        for (String[] row : papan) {
            System.out.println(Arrays.toString(row));
        }

        // ===== ARRAY JAGGED (IRREGULAR) =====
        System.out.println("\n=== ARRAY JAGGED (IRREGULAR) ===");

        // Latihan 3: Array dengan panjang baris yang berbeda
        // - Buat array 2D integer dengan 4 baris: baris 0 panjang 2, baris 1 panjang 4, baris 2 panjang 3, baris 3 panjang 5
        int[][] jagged = new int[4][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];
        jagged[3] = new int[5];

        // - Isi setiap baris dengan angka berurutan dimulai dari 1
        // - Print array jagged dengan menampilkan panjang setiap baris
        int counter = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = counter++;
            }
            System.out.println("Baris " + i + " (len=" + jagged[i].length + "): " + Arrays.toString(jagged[i]));
        }

        // ===== OPERASI LANJUTAN PADA ARRAY =====
        System.out.println("\n=== OPERASI LANJUTAN PADA ARRAY ===");

        // Latihan 4: Operasi matematika pada array 2D
        // - Buat dua matriks 2x3 dengan nilai bebas
        int[][] m1 = { {1,2,3}, {4,5,6} };
        int[][] m2 = { {6,5,4}, {3,2,1} };

        // - Implementasikan penjumlahan matriks (buat method addMatrices)
        int[][] sum = addMatrices(m1, m2);

        // - Implementasikan perkalian setiap elemen dengan scalar 2 (buat method multiplyByScalar)
        int[][] scaled = multiplyByScalar(m1, 2);

        // - Print hasil operasi
        System.out.println("Hasil Penjumlahan:");
        displayMatrix(sum);
        System.out.println("Hasil Perkalian Scalar:");
        displayMatrix(scaled);

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 5: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method sortArray untuk mengurutkan array
        // (implementasikan method sortArray yang menerima array dan mengembalikan array yang sudah diurutkan)
        System.out.println("Sorted: " + Arrays.toString(sortArray(numbers)));

        // - Panggil method reverseArray untuk membalik array
        // (implementasikan method reverseArray)
        System.out.println("Reversed: " + Arrays.toString(reverseArray(numbers)));

        // - Panggil method findMinMax untuk mencari nilai minimum dan maksimum
        // (implementasikan method yang mengembalikan array int dengan 2 elemen: [min, max])
        System.out.println("Min/Max: " + Arrays.toString(findMinMax(numbers)));

        // ===== UTILITY METHODS JAVA.UTIL.ARRAYS =====
        System.out.println("\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");

        // Latihan 6: Eksplorasi utility methods Arrays
        int[] data = {5, 2, 8, 1, 9, 3};

        // - Gunakan Arrays.toString() untuk print array
        System.out.println("As String: " + Arrays.toString(data));

        // - Gunakan Arrays.sort() untuk mengurutkan array
        Arrays.sort(data);
        System.out.println("Sorted: " + Arrays.toString(data));

        // - Gunakan Arrays.binarySearch() untuk mencari elemen (array harus sudah diurutkan)
        System.out.println("Binary Search 8: index=" + Arrays.binarySearch(data, 8));

        // - Gunakan Arrays.fill() untuk mengisi array dengan nilai tertentu
        Arrays.fill(data, 7);
        System.out.println("Filled: " + Arrays.toString(data));

        // - Gunakan Arrays.equals() untuk membandingkan dua array
        int[] data2 = {1, 2, 3};
        Arrays.equals(data, data2);

        // - Gunakan Arrays.copyOf() untuk membuat copy array dengan ukuran berbeda
        int[] copy = Arrays.copyOf(data, 10);
        System.out.println("Copy: " + Arrays.toString(copy));

        // ===== ARRAY 3D DAN KOMPLEKS =====
        System.out.println("\n=== ARRAY 3D DAN KOMPLEKS ===");

        // Latihan 7: Array 3 dimensi
        // - Buat array 3D integer ukuran 2x3x4 (seperti 2 buah matriks 3x4)
        int[][][] numbers3D = new int[2][3][4];

        // - Isi dengan nilai berurutan dari 1
        int c = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    numbers3D[i][j][k] = c++;
                }
            }
        }

        // - Print menggunakan triple nested loop dengan format yang jelas
        for (int i = 0; i < 2; i++) {
            System.out.println("Matrix " + i + ":");
            displayMatrix(numbers3D[i]);
        }

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 8: Sistem nilai mahasiswa
        // - Buat array 2D untuk menyimpan nilai 5 mahasiswa, 4 mata kuliah
        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};

        // - Isi dengan nilai random antara 60-100
        int[][] grades = new int[namaMahasiswa.length][mataKuliah.length];
        fillRandomGrades(grades, 60, 100);

        // - Hitung rata-rata per mahasiswa
        // - Hitung rata-rata per mata kuliah
        // - Tentukan mahasiswa dengan nilai tertinggi
        double highestAvg = -1;
        String topStudent = "";

        // - Print dalam format tabel yang rapi
        System.out.println("Tabel Nilai:");
        System.out.print("Nama\t");
        System.out.println("Avg");
        for (String m : mataKuliah) System.out.print(m+"\t");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.println();
            System.out.print(namaMahasiswa[i] + "\t");
            double avg = calculateAverage(grades[i]);
            if (avg > highestAvg) { highestAvg = avg; topStudent = namaMahasiswa[i]; }
            for (int j = 0; j < mataKuliah.length; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.println(avg);
        }
        System.out.println("Top Student: " + topStudent + " | Avg: " + highestAvg);


    // Latihan 9: Game Tic-Tac-Toe sederhana
        // - Buat array 2D char 3x3 untuk papan permainan
        char[][] board = new char[3][3];

        // - Implementasikan method untuk menampilkan papan
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        // - Implementasikan method untuk mengecek apakah ada pemenang
        char winner = checkWinner(board);
        if (winner != ' ') {
            System.out.println("Pemenang: " + winner);
        } else {
            System.out.println("Belum ada pemenang.");
        }

        // - Simulasikan beberapa langkah permainan
        board[0][0] = 'X';
        board[0][1] = 'O';
        board[1][1] = 'X';
        board[1][2] = 'O';
        board[2][2] = 'X'; // X menang (diagonal)

        displayBoard(board);
    }

    // ===== IMPLEMENTASI METHODS =====
    // TODO: Implementasikan method-method yang diperlukan di sini

    // Method untuk penjumlahan matriks
    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] res = new int[rows][cols];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return res;
    }

    // Method untuk perkalian scalar
    public static int[][] multiplyByScalar(int[][] m, int s) {
        int rows = m.length;
        int cols = m[0].length;
        int[][] res = new int[rows][cols];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                res[i][j] = m[i][j]*s;
            }
        }
        return res;
    }

    // Method untuk sorting array
    public static int[] sortArray(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        return copy;
    }

    // Method untuk reverse array
    public static int[] reverseArray(int[] arr) {
        int[] res = new int[arr.length];
        for (int i=0;i<arr.length;i++) {
            res[i] = arr[arr.length-1-i];
        }
        return res;
    }

    // Method untuk find min dan max
    public static int[] findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int v : arr) {
            if (v<min) min=v;
            if (v>max) max=v;
        }
        return new int[]{min,max};
    }

    // Method untuk display array 2D
    public static void displayMatrix(int[][] m) {
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Method untuk mengisi array 2D dengan nilai random
    public static void fillRandomGrades(int[][] g, int min, int max) {
        Random rand = new Random();
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                g[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
    }

    // Method untuk menghitung rata-rata array
    public static double calculateAverage(int[] values) {
        int sum = 0;
        for (int v : values) sum += v;
        return (double)sum / values.length;
    }

    // Method untuk menampilkan papan
    public static void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
    }

    // Method untuk mengecek apakah ada pemenang
    public static char checkWinner(char[][] board) {
        // Cek baris
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' &&
                    board[i][0] == board[i][1] &&
                    board[i][1] == board[i][2]) {
                return board[i][0];
            }
        }
        // Cek kolom
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != ' ' &&
                    board[0][j] == board[1][j] &&
                    board[1][j] == board[2][j]) {
                return board[0][j];
            }
        }
        // Cek diagonal
        if (board[0][0] != ' ' &&
                board[0][0] == board[1][1] &&
                board[1][1] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] != ' ' &&
                board[0][2] == board[1][1] &&
                board[1][1] == board[2][0]) {
            return board[0][2];
        }
        return ' ';
    }
}
