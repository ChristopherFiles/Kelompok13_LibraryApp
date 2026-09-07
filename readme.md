# Perpustakaan OOP Java

# Kelompok 13

## Anggota Kelompok

| No | Nama                 | NIM         |
| -: | -------------------- | ----------- |
|  1 | MISAEL CHRISTOPHER H | J0403251052 |
|  2 | INTAN SAHARA NURAFNI | J0403251005 |
|  3 | FAIZA AGHNAITA ZAHRA | J0403251122 |
|  4 | ZAHRA CANTIKYA P     | J0403251106 |
|  5 | FAHRIZAL AZIZ        | J0403251151 |

## Tentang Project

Program sederhana aplikasi perpustakaan yang dibuat menggunakan Java dengan konsep Object-Oriented Programming (OOP).

Program ini dibuat untuk menerapkan penggunaan class, object, constructor, method, encapsulation, serta relasi antar class pada sebuah sistem perpustakaan sederhana.

## Informasi Project

| Keterangan         | Detail                      |
| ------------------ | --------------------------- |
| Nama Project       | Perpustakaan OOP Java       |
| Bahasa Pemrograman | Java                        |
| Konsep             | Object-Oriented Programming |
| Jenis Program      | Console Application         |
| IDE                | Visual Studio Code          |
| JDK                | JDK 21                      |

## Class yang Digunakan

| Class       | Keterangan                                           |
| ----------- | ---------------------------------------------------- |
| `Member`    | Menyimpan data anggota dan buku yang sedang dipinjam |
| `Buku`      | Menyimpan data buku, genre, dan status peminjaman    |
| `GenreBuku` | Menyimpan data genre buku                            |
| `Main`      | Menjalankan program dan membuat object               |

## Class Member

Class `Member` digunakan untuk menyimpan data anggota perpustakaan dan mengatur proses peminjaman serta pengembalian buku.

### Atribut

| Atribut        | Tipe Data         | Keterangan                       |
| -------------- | ----------------- | -------------------------------- |
| `idMember`     | `int`             | ID anggota                       |
| `nama`         | `String`          | Nama anggota                     |
| `alamat`       | `String`          | Alamat anggota                   |
| `bukuDipinjam` | `ArrayList<Buku>` | Daftar buku yang sedang dipinjam |

### Method

| Method             | Keterangan                                     |
| ------------------ | ---------------------------------------------- |
| `getIdMember()`    | Mengambil ID member                            |
| `getNama()`        | Mengambil nama member                          |
| `getAlamat()`      | Mengambil alamat member                        |
| `pinjamBuku()`     | Melakukan proses peminjaman buku               |
| `kembalikanBuku()` | Melakukan proses pengembalian buku             |
| `tampilkanData()`  | Menampilkan data member dan buku yang dipinjam |

## Class Buku

Class `Buku` digunakan untuk menyimpan informasi buku yang ada di perpustakaan.

### Atribut

| Atribut       | Tipe Data   | Keterangan   |
| ------------- | ----------- | ------------ |
| `idBuku`      | `int`       | ID buku      |
| `judul`       | `String`    | Judul buku   |
| `penulis`     | `String`    | Nama penulis |
| `tahunTerbit` | `int`       | Tahun terbit |
| `status`      | `String`    | Status buku  |
| `genre`       | `GenreBuku` | Genre buku   |

### Method

| Method            | Keterangan                            |
| ----------------- | ------------------------------------- |
| `getIdBuku()`     | Mengambil ID buku                     |
| `getJudul()`      | Mengambil judul buku                  |
| `getPenulis()`    | Mengambil nama penulis                |
| `getStatus()`     | Mengambil status buku                 |
| `getGenre()`      | Mengambil genre buku                  |
| `pinjam()`        | Mengubah status buku menjadi Dipinjam |
| `kembalikan()`    | Mengubah status buku menjadi Tersedia |
| `tampilkanInfo()` | Menampilkan informasi buku            |

## Class GenreBuku

Class `GenreBuku` digunakan untuk menyimpan informasi mengenai genre buku.

### Atribut

| Atribut     | Tipe Data | Keterangan      |
| ----------- | --------- | --------------- |
| `idGenre`   | `int`     | ID genre        |
| `namaGenre` | `String`  | Nama genre      |
| `deskripsi` | `String`  | Deskripsi genre |

### Method

| Method             | Keterangan                  |
| ------------------ | --------------------------- |
| `getIdGenre()`     | Mengambil ID genre          |
| `getNamaGenre()`   | Mengambil nama genre        |
| `getDeskripsi()`   | Mengambil deskripsi genre   |
| `tampilkanGenre()` | Menampilkan informasi genre |

## Relasi Antar Class

| Relasi                       | Keterangan                                    |
| ---------------------------- | --------------------------------------------- |
| `GenreBuku` - `Buku`         | Satu genre dapat digunakan oleh beberapa buku |
| `Buku` - `GenreBuku`         | Setiap buku memiliki satu genre               |
| `Member` - `Buku`            | Member dapat meminjam buku                    |
| `Member` - `ArrayList<Buku>` | Menyimpan daftar buku yang sedang dipinjam    |

Relasi sederhana:

```text
GenreBuku 1 -------- * Buku

Member * -------- * Buku
```

Relasi `Member` dan `Buku` digunakan pada proses peminjaman. Jika sebuah buku sedang dipinjam, member lain tidak dapat meminjam buku tersebut sampai buku dikembalikan.

## Data Buku

|  ID | Judul             | Penulis | Tahun | Genre       |
| --: | ----------------- | ------- | ----: | ----------- |
| 101 | Belajar Java OOP  | Andi    |  2025 | Pemrograman |
| 102 | Pemrograman Dasar | Budi    |  2024 | Pemrograman |
| 103 | Senja di Kota     | Citra   |  2023 | Novel       |

## Data Genre

| ID | Nama Genre  | Deskripsi                          |
| -: | ----------- | ---------------------------------- |
|  1 | Pemrograman | Buku mengenai pemrograman komputer |
|  2 | Novel       | Buku cerita fiksi                  |

## Data Member

| ID | Nama   | Alamat   |
| -: | ------ | -------- |
|  1 | Misael | Karawang |
|  2 | Azis   | Bogor    |
|  3 | Zahra  | Bogor    |
|  4 | Faiza  | Bogor    |
|  5 | Intan  | Bogor    |

## Proses Program

| No | Proses             | Keterangan                          |
| -: | ------------------ | ----------------------------------- |
|  1 | Membuat genre      | Membuat genre Pemrograman dan Novel |
|  2 | Membuat buku       | Membuat tiga object buku            |
|  3 | Membuat member     | Membuat lima object member          |
|  4 | Menampilkan buku   | Menampilkan informasi seluruh buku  |
|  5 | Peminjaman         | Misael meminjam buku 101 dan 103    |
|  6 | Peminjaman lain    | Member lain mencoba meminjam buku   |
|  7 | Pengembalian       | Misael mengembalikan buku 101       |
|  8 | Peminjaman kembali | Azis meminjam buku 101              |

## Konsep OOP

| Konsep        | Penerapan                            |
| ------------- | ------------------------------------ |
| Class         | `Member`, `Buku`, dan `GenreBuku`    |
| Object        | Object dibuat menggunakan `new`      |
| Constructor   | Memberikan nilai awal pada object    |
| Encapsulation | Atribut menggunakan `private`        |
| Method        | Menjalankan fungsi pada setiap class |
| ArrayList     | Menyimpan daftar buku yang dipinjam  |
| Relasi Object | `Buku` memiliki object `GenreBuku`   |

## Struktur Project

```text
PerpustakaanOOP/
│
├── README.md
│
└── src/
    ├── Main.java
    ├── Member.java
    ├── Buku.java
    └── GenreBuku.java
```

## Cara Menjalankan

Pastikan Java/JDK sudah terinstall.

Cek Java:

```bash
java -version
```

Cek compiler:

```bash
javac -version
```

Masuk ke folder `src`:

```bash
cd src
```

Compile seluruh file:

```bash
javac *.java
```

Jalankan program:

```bash
java Main
```

Class yang dijalankan adalah `Main` karena memiliki method `main()`.

```java
public static void main(String[] args)
```

Class `Member`, `Buku`, dan `GenreBuku` digunakan sebagai class pendukung.

## Contoh Output

```text
=== DAFTAR BUKU ===
ID Buku     : 101
Judul       : Belajar Java OOP
Penulis     : Andi
Tahun       : 2025
Genre       : Pemrograman
Status      : Tersedia

=== PEMINJAMAN ===
Misael berhasil meminjam buku: Belajar Java OOP
Misael berhasil meminjam buku: Senja di Kota

=== MEMBER LAIN ===
Buku sedang dipinjam.

=== PENGEMBALIAN ===
Misael mengembalikan buku: Belajar Java OOP
Azis berhasil meminjam buku: Belajar Java OOP
```

## Kesimpulan

Program ini merupakan penerapan sederhana konsep OOP pada sistem perpustakaan. Class `Member`, `Buku`, dan `GenreBuku` memiliki fungsi masing-masing dan saling berhubungan dalam proses pengelolaan buku dan peminjaman.

Program masih berbasis console dan dapat dikembangkan lagi dengan database, menu interaktif, pencarian buku, riwayat peminjaman, dan fitur lainnya.

## Menu Fitur Utama Program

Program perpustakaan memiliki beberapa fitur utama yang digunakan untuk menjalankan proses pengelolaan buku dan member.

| No | Fitur                | Keterangan                                                                 |
| -: | -------------------- | -------------------------------------------------------------------------- |
|  1 | Data Buku            | Menampilkan informasi buku yang tersedia di perpustakaan                   |
|  2 | Data Genre           | Menampilkan genre dan deskripsi buku                                       |
|  3 | Data Member          | Menampilkan data anggota perpustakaan                                      |
|  4 | Peminjaman Buku      | Member dapat melakukan peminjaman buku yang masih tersedia                 |
|  5 | Pengembalian Buku    | Member dapat mengembalikan buku yang sedang dipinjam                       |
|  6 | Status Buku          | Menampilkan status buku, yaitu Tersedia atau Dipinjam                      |
|  7 | Daftar Buku Dipinjam | Menampilkan buku yang sedang dipinjam oleh member                          |
|  8 | Validasi Peminjaman  | Mencegah buku yang sedang dipinjam untuk dipinjam kembali oleh member lain |

### Rincian Fitur

#### Data Buku

Menampilkan informasi dari setiap buku yang terdapat pada program, seperti ID buku, judul, penulis, tahun terbit, genre, dan status buku.

#### Data Genre

Menampilkan genre yang digunakan pada buku. Setiap buku memiliki satu genre dan satu genre dapat digunakan oleh beberapa buku.

#### Data Member

Menampilkan informasi member yang terdaftar dalam program. Data member terdiri dari ID, nama, dan alamat.

#### Peminjaman Buku

Member dapat meminjam buku apabila status buku masih `Tersedia`. Setelah berhasil dipinjam, status buku berubah menjadi `Dipinjam`.

#### Pengembalian Buku

Member dapat mengembalikan buku yang sebelumnya dipinjam. Setelah dikembalikan, status buku berubah kembali menjadi `Tersedia`.

#### Status Buku

Setiap buku memiliki status untuk mengetahui apakah buku sedang tersedia atau sedang dipinjam.

| Status     | Keterangan                                                |
| ---------- | --------------------------------------------------------- |
| `Tersedia` | Buku dapat dipinjam                                       |
| `Dipinjam` | Buku sedang dipinjam dan tidak dapat dipinjam member lain |

#### Daftar Buku yang Dipinjam

Setiap member memiliki daftar buku yang sedang dipinjam. Daftar tersebut disimpan menggunakan `ArrayList<Buku>`.

#### Validasi Peminjaman

Sebelum melakukan peminjaman, program mengecek status buku terlebih dahulu. Jika buku sedang dipinjam, proses peminjaman akan ditolak.

Contoh:

```text
Misael berhasil meminjam buku: Belajar Java OOP

Member lain mencoba meminjam buku yang sama:

Buku sedang dipinjam.
```

Setelah buku dikembalikan:

```text
Misael mengembalikan buku: Belajar Java OOP

Azis berhasil meminjam buku: Belajar Java OOP
```

## Cara Menjalankan

Program dijalankan menggunakan Java melalui terminal pada Visual Studio Code.

### 1. Pastikan Java sudah terinstall

Cek versi Java dengan perintah:

```bash
java -version
```

Kemudian cek compiler Java:

```bash
javac -version
```

Program ini menggunakan **JDK 21**.

### 2. Buka folder project

Buka folder `PerpustakaanOOP` menggunakan Visual Studio Code.

Struktur folder project:

```text
PerpustakaanOOP/
│
├── README.md
│
└── src/
    ├── Main.java
    ├── Member.java
    ├── Buku.java
    └── GenreBuku.java
```

### 3. Masuk ke folder `src`

Buka terminal di Visual Studio Code, kemudian jalankan:

```bash
cd src
```

### 4. Compile program

Compile seluruh file Java dengan perintah:

```bash
javac *.java
```

Perintah tersebut digunakan untuk meng-compile `Main.java`, `Member.java`, `Buku.java`, dan `GenreBuku.java` secara bersamaan.

### 5. Jalankan program

Setelah proses compile berhasil, jalankan program dengan:

```bash
java Main
```

Program dijalankan melalui class `Main` karena class tersebut memiliki method:

```java
public static void main(String[] args)
```

Class `Member`, `Buku`, dan `GenreBuku` tidak dijalankan secara langsung karena digunakan sebagai class pendukung dalam program.

### 6. Contoh proses menjalankan

Urutan perintah di terminal:

```bash
cd src
javac *.java
java Main
```

Jika berhasil, program akan menampilkan informasi buku, proses peminjaman, pengembalian, dan data member pada terminal.
