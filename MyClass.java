public class MyClass {
    public static void main(String[] args) {
        // Contoh penggunaan class String
        String str = "Hello, World!";

        // Menggunakan method length() untuk mendapatkan panjang string
        int length = str.length();
        System.out.println("Panjang string: " + length);

        // Menggunakan method charAt() untuk mendapatkan karakter pada indeks tertentu
        char karakterPertama = str.charAt(0);
        System.out.println("Karakter pertama: " + karakterPertama);

        // Menggunakan method substring() untuk mendapatkan substring dari string
        String substring = str.substring(7);
        System.out.println("Substring: " + substring);

        // Menggunakan method contains() untuk memeriksa apakah string mengandung sub-string tertentu
        boolean contains = str.contains("World");
        System.out.println("String mengandung 'World': " + contains);

        // Menggunakan method replace() untuk mengganti karakter atau sub-string dalam string
        String replaced = str.replace("World", "Java");
        System.out.println("String setelah replace: " + replaced);
    }
}
