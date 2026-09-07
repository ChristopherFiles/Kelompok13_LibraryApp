public class GenreBuku {
    private int idGenre;
    private String namaGenre;
    private String deskripsi;

    public GenreBuku(int idGenre, String namaGenre, String deskripsi) {
        this.idGenre = idGenre;
        this.namaGenre = namaGenre;
        this.deskripsi = deskripsi;
    }

    public int getIdGenre() { return idGenre; }
    public String getNamaGenre() { return namaGenre; }
    public String getDeskripsi() { return deskripsi; }

    public void tampilkanGenre() {
        System.out.println("Genre       : " + namaGenre);
        System.out.println("Deskripsi   : " + deskripsi);
    }
}
