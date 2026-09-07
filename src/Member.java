import java.util.ArrayList;

public class Member {
    private int idMember;
    private String nama;
    private String alamat;
    private ArrayList<Buku> bukuDipinjam;

    public Member(int idMember, String nama, String alamat) {
        this.idMember = idMember;
        this.nama = nama;
        this.alamat = alamat;
        bukuDipinjam = new ArrayList<>();
    }

    public int getIdMember() { return idMember; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }

    public void pinjamBuku(Buku buku) {
        if (buku.pinjam()) {
            bukuDipinjam.add(buku);
            System.out.println(nama + " berhasil meminjam buku: " + buku.getJudul());
        } else {
            System.out.println("Buku sedang dipinjam.");
        }
    }

    public void kembalikanBuku(Buku buku) {
        if (bukuDipinjam.contains(buku)) {
            buku.kembalikan();
            bukuDipinjam.remove(buku);
            System.out.println(nama + " mengembalikan buku: " + buku.getJudul());
        } else {
            System.out.println("Buku tersebut tidak sedang dipinjam oleh " + nama);
        }
    }

    public void tampilkanData() {
        System.out.println("\n=== DATA MEMBER ===");
        System.out.println("ID Member : " + idMember);
        System.out.println("Nama      : " + nama);
        System.out.println("Alamat    : " + alamat);
        System.out.println("\nBuku yang dipinjam:");
        if (bukuDipinjam.isEmpty()) {
            System.out.println("Tidak ada buku.");
        } else {
            for (Buku buku : bukuDipinjam) {
                System.out.println("- " + buku.getJudul());
            }
        }
    }
}
