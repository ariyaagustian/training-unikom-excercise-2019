# Soal praktek

1. Buatlah project dengan springboot untuk membuat aplikasi dengan tema e-commerce (Toko online)
2. Ketentuan minimal system yang harus di handle
    - Master data toko
    - Master data produk
    - Transaksi Penjualan (Flow transaksi bebas)
    - Master pelanggan

# Soal teori

1. Apa fungsi Hibernate ORM dan jelaskan mengapa?
```ORM (Object Relational Mapping) fungsinya untuk memetakan class / objek yang ada pada program dihubungkan dengan database. fungsinya juga untuk mempermudah dalam pelaksanaan pembuatan project / aplikasi.```

2. Jelaskan menurut pendapat anda dari beberapa fungsi annotation di hibernate seperti berikut:
    - ```@Entity``` 
    : yaitu anotasi / deklarasi untuk kelas agar dapat dibaca oleh hibernate sebagai entity. 
    - ```@Table``` 
    : yaitu anotasi / deklarasi untuk kelas agar dapat dibaca oleh hibernate sebagai tabel, dapat memberikan nama seperti tabel pada database.
    - ```@Column``` 
    : yaitu anotasi / deklarasi untuk kelas agar dapat dibaca oleh hibernate sebagai kolom, dapat memberikan nama kolom, dan atribut atribut yang dibutuhkan kolom pada database.
    - ```@OneToOne```
    : yaitu anotasi / deklarasi untuk kelas agar dapat dibaca oleh hibernate sebagai relasi antar tabel (1 ke 1).
    - ```@ManyToOne```
    : yaitu anotasi / deklarasi untuk kelas agar dapat dibaca oleh hibernate sebagai relasi antar tabel (Banyak ke 1).
    - ```@OneToMany```
    : yaitu anotasi / deklarasi untuk kelas agar dapat dibaca oleh hibernate sebagai relasi antar tabel (1 ke Banyak).
    - ```@JoinColumn```
    : yaitu anotasi / deklarasi untuk kelas agar dapat dibaca oleh hibernate sebagai join colom antar tabel.
    - ```@JoinTable```
    : yaitu anotasi / deklarasi untuk kelas agar dapat dibaca oleh hibernate sebagai join tabel dalam database.
    - ```@GeneratedValue```
    : yaitu anotasi Untuk menjalankan fungsi Generating properti pada suatu kolom, seperti auto_incement pada SQL
    
3. Jelaskan menurut pendapat anda mengenai Dependency injection di springframework?
```Dependency Injection dapat mempersingkat pemanggilan suatu objek apabila objek objek tersebut sudah memiliki banyak cabang didalamnya.```

4. Jelaskan menurut pendapat anda mengenai container / context di spring framework? ```Seluruh objek yang banyak cabangnya tadi dapat kita kumpulkan dalam satu tempat dengan penggunaan container / context pada Spring Framework```

5. Jelaskan menurut pendapat anda fungsi dari beberapa fitur annotation di spring frameork seperti berikut:
    - ```@ComponentScan```
    : anotasi pada Spring, Spring akan mencari paket dan semua sub paketnya untuk Beans.
    - ```@Autowired```
    : anotasi autowiring(penghubungan otomatis) dapat digunakan pada properti, setter, dan konstruktor.
    - ```@Bean```
    : saat anotasi ini dijalankan, kelas yang dianotasi sebagai Bean(Objek), dapat digunakan pada Spring.
    - ```@Component```
    : hampir mirip dengan Bean, tetapi kita bisa langsung mendeklarasikan @Component di class yang ingin kita tandai sebagai Bean.
    - ```@Repository```
    : anotasi ini berfungsi untuk menandai sebuah component bahwa component tersebut merupakan sebuah repository yang berfungsi sebagai data access object yang menghubungkan aplikasi dengan database.
    - ```@Service```
    : anotasi ini berfungsi menandai sebuah component bahwa component tersebut merupakan sebuah service yang biasanya berisi code business logic dari aplikasi yang kita buat.
    - ```@Controller```
    : anotasi ini berfungsi menandai sebuah component bahwa component tersebut merupakan sebuah controller yang berguna dalam aplikasi web dalam menghandle request yang diakses melalui url.
    - ```@RestController```
    : anotasi ini menandakan suatu class adalah controller. Controller akan menerima request yang masuk dari client, dan mengembalikan nilai yang sesuai dalam format JSON. Kita tidak perlu menentukan format nilai kembali, karena spring mendukung HTTP Message converter dan Jackson 2 yang ada di classpath project ini secara otomatis digunakan untuk konversi object ke JSON.
    - ```@RequestMapping```
    : adalah anotasi untuk menandakan url yang digunakan untuk mengakses dan method (http verb) yang digunakan untuk mengakses url tersebut.
    - ```@GetMapping```
    : adalah anotasi tersusun yang berfungsi sebagai pintasan untuk @RequestMapping(method = RequestMethod.GET). untuk berhubungan dengan URL
    - ```@PostMapping```
    : adalah anotasi tersusun yang berfungsi sebagai pintasan untuk @RequestMapping(method = RequestMethod.POST). untuk berhubungan dengan URL
    - ```@PutMapping```
    : adalah anotasi tersusun yang berfungsi sebagai pintasan untuk @RequestMapping(method = RequestMethod.PUT). untuk berhubungan dengan URL
    - ```@DeleteMapping```
    : adalah anotasi tersusun yang berfungsi sebagai pintasan untuk @RequestMapping(method = RequestMethod.DELETE). untuk berhubungan dengan URL

## Cara mengerjakan

- Fork repository ini, kemudian setelah di fork, clone ke local komputer anda.
- Setelah selesai silahkan di push ke repository masing-masing.
- Selamat mengerjakan :) & good luck
