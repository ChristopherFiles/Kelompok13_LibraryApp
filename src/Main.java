public class Main {
    public static void main(String[] args) {
        GenreBuku pemrograman = new GenreBuku(1, "Pemrograman", "Buku mengenai pemrograman komputer.");
        GenreBuku novel = new GenreBuku(2, "Novel", "Buku cerita fiksi.");

        Buku buku1 = new Buku(101, "Belajar Java OOP", "Andi", 2025, pemrograman);
        Buku buku2 = new Buku(102, "Pemrograman Dasar", "Budi", 2024, pemrograman);
        Buku buku3 = new Buku(103, "Senja di Kota", "Citra", 2023, novel);

        Member member1 = new Member(1, "Misael", "Karawang");
        Member member2 = new Member(2, "Azis", "Bogor");
        Member member3 = new Member(3, "Zahra", "Bogor");
        Member member4 = new Member(4, "Faiza", "Bogor");
        Member member5 = new Member(5, "Intan", "Bogor");

        System.out.println("=== DAFTAR BUKU ===");
        buku1.tampilkanInfo();
        System.out.println("-------------------");
        buku2.tampilkanInfo();
        System.out.println("-------------------");
        buku3.tampilkanInfo();

        System.out.println("\n=== PEMINJAMAN ===");
        member1.pinjamBuku(buku1);
        member1.pinjamBuku(buku3);
        member1.tampilkanData();

        System.out.println("\n=== MEMBER LAIN ===");
        member2.pinjamBuku(buku1);
        member3.pinjamBuku(buku2);
        member4.pinjamBuku(buku3);
        member5.pinjamBuku(buku1);

        System.out.println("\n=== PENGEMBALIAN ===");
        member1.kembalikanBuku(buku1);
        member2.pinjamBuku(buku1);

        System.out.println("\n=== DATA AKHIR MEMBER 1 ===");
        member1.tampilkanData();
        System.out.println("\n=== DATA AKHIR MEMBER 2 ===");
        member2.tampilkanData();
    }
}
