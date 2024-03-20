 Saya Nabilla Assyfa Ramadhani [2205297] mengerjakan Latihan dalam mata kuliah Desain dan Pemograman Berorientasi Objek, untuk keberkahanNya maka saya tidak melakukan kecurangan
 seperti yang telah dispesifikasikan.
 Aamiin

 # Desain Program
 Program ini menggunakan bahasa Java yang terhubung dengan sebuah database. Program ini dapat melakukan CRUD serta memiliki 4 buah file yakni Menu.java, Menu.form, Database.java, dan Mahasiswa.java.
 kelas Database.java digunakan untuk menghubungkan antara program CRUD dengan database melalui sebuah koneksi. Database.java juga digunakan untuk menampung perintah - perintah yang akan dilakukan seperti
 Create, Update, dan Delete.<br>
 Adapun atribut yang ada dalam kelas Mahasiswa antara lain:<br>
 1. NIM : Atribut ini digunakan untuk menyimpan NIM mahasiswa.<br>
 2. Nama : Atribut ini digunakan untuk menyimpan nama mahasiswa.<br>
 3. Jenis Kelamin : Atribut ini digunakan untuk menyimpan jenis kelamin mahasiswa.<br>
 4. Univeristas : Atribut ini digunakan untuk menyimpan nama univeristas dimana mahasiswa tersebut belajar.<br>
 5. Jenjang : Atribut ini digunakan untuk menyimpan jenjang mahasiswa.<br>
 6. Status : Atribut ini digunakan untuk menyimpan status awal mahasiswa.<br>
 <br>
 
 Adapun component input yang digunakan dalam Menu.form antara lain:<br>
   1. JcomboBox : component input JcomboBox digunakan untuk jenis kelamin ["Laki-laki", "Perempuan"], jenjang ["D1","D2","D3","D4","S1","S2","S3"], dan status awal mahasiswa ["Mahasiswa baru","Pindahan","Tamu"].<br>
   2. JTextField : component input JTextField digunakan untuk menampung NIM, Nama, dan Universitas Mahasiswa.<br>

<br><br>
 # Alur Progran
 ### 1. Tambah Data<br>
 1. User diminta untuk mengisi NIM, nama, jenis kelamin, perguruan tinggi, jenjang pendidikan, dan status awal mahasiswa. Jika salah satu diantara field tersebut ada yang tidak diisi maka program akan memberikan pemberitahuan bahwa field tidak boleh kosong.<br>
 2. Jika NIM pada data yang dimasukkan sama dengan NIM yang ada pada database, maka program akan menampilkan pemberitahuan dan data yang dimasukkan tidak dapat masuk kedalam database.<br>
 3. Setelah memastikan semua informasi diisi dan NIM yang dimasukkan unik, user dapat menekan tombol "Add".<br>
 4. Data mahasiswa yang dimasukkan oleh user akan ditambahkan ke dalam database.<br>
 5. Jika user memilih tombol "Cancel", maka proses penambahan data mahasiswa dibatalkan dan tidak ada data yang ditambahkan ke dalam database.<br>

 ### 2. Ubah Data<br>
 1. Ketika user menekan salah satu entri dalam tabel, maka akan menampilkan form dengan fitur update dan hapus data.<br>
 2. Jika user ingin mengubah data, user dapat memodifikasi data mahasiswa yang ingin diubah.<br>
 3. Jika user mengubah field pada data mahasiswa menjadi kosong, maka program akan menampilkan pemberitahuan bahwa field tidak boleh kosong.<br>
 4. Setelah data selesai diubah, user dapat menekan tombol "Update" untuk menyimpan perubahan.<br>

 ### 3. Hapus Data<br>
 1. Ketika user menekan salah satu entri dalam tabel, maka akan menampilkan form dengan fitur update dan hapus data.<br>
 2. Jika user ingin menghapus data, user dapat menekan tombol "Delete".<br>
 3. Setelah user mengonfirmasi penghapusan data, data akan terhapus dalam database.<br>
 4. Jika user menekan tombol "Cancel", maka proses penghapusan data akan dibatalkan.<br>
 <br>

 # Dokumentasi 
 ## Penambahan data
 #### Pemasukan data jika Nama Kosong
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/Nama(kosong).png)
 #### Pemasukan data jika Jenis Kelamin Kosong
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/Jenis%20Kelamin%20(kosong).png)
 #### Pemasukan data jika Nama perguruan Tinggi kosong
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/Univ%20(kosong).png)
 #### Pemasukan data jika Jenjang Pendidikan kosong
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/Jenjang%20(kosong).png)
 #### Pemasukan data jika Status awal mahasiswa kosong
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/Status%20(kosong).png)
 #### Pemasukan data jika NIM sudah ada dalam database
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/Insert%20saat%20NIM%20sudah%20ada.png)
 #### Pemasukan data kedalam database
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/Insert%20data.png)
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/automatis%20bertambah%20dalam%20database.png)


 ## Update Data
 #### Update data jika salah satu field tidak terisi
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/Update%20jenis%20kelamin%20(kosong).png)
 #### Update data jika NIM yang dimasukkan ada dalam database
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/Update%20dengan%20NIM%20sudah%20ada.png)
 #### Update data dalam database
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/Update%20data.png)
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/Database%20terupdate.png)

 ## Hapus Data
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/Delete%20data.png)
 ![alt text](https://github.com/nabillassyfa/TP2DPBO2024C2/blob/main/Screenshot/Data%20dalam%20database%20terhapus.png)
