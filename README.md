## MyLifeStyle
Aplikasi Pengecekan Rutinitas yang Memberitahukan Rutinitas Tersebut Dikatakan Baik untuk Kesehatan atau Perlu Diubah Berdasarkan Hasil Rutinitas Pengguna.

## Group Name : FitTech Innovators
1.	H071231002 – A. Muhammad Zulfikar
2.	H071231076 – Adrian Tri Putra
3.	H071231055 – Fara Rahmasari Fahirun

## Tema yang dipilih : Health and Sports
## Nama Pendamping : Muh. Adnan Putra Amiruddin
## Tim Juri :
1.	Ketua Umum BEM FMIPA Unhas 
2.	Ihlasul Mufti Faqih

## Executive Summary
MyLifeStyle adalah aplikasi kesehatan yang dirancang untuk berbagai kalangan pengguna untuk membantu mereka mengukur dan memantau pola hidup sehat. 
Aplikasi ini dilengkapi dengan fitur log in dan register, kemudian data dari pengguna akan disimpan dengan memuat nama, username, password, re-password, dan nomor telepon. Setelah registrasi, aplikasi akan mengarahkan pengguna untuk login dan memulai menginput data harian, seperti pola makan, pola tidur, asupan air, durasi olahraga, serta perokok aktif atau tidak. Aplikasi ini kemudian mulai menganalisis data tersebut untuk memberikan rekomendasi personal mengenai aspek-aspek yang perlu ditingkatkan atau diperbaiki guna menjaga pola hidup yang sehat.
Selain itu, aplikasi ini juga memberikan informasi mengenai potensi penyakit yang dapat muncul akibat pola hidup yang kurang baik. Dengan demikian, pengguna dapat lebih proaktif dalam menjaga kesehatan mereka. Aplikasi ini kami rancang untuk mempermudah masyarakat untuk mengecek rutinitasnya apakah baik untuk kesehatan atau perlu untuk merubah beberapa rutinitas agar menciptakan rutinitas yang sehat.

## Fitur Aplikasi : 
### A.	General
1.	Login aplikasi untuk user
2.	Register akun untuk user
3.	Logout akun untuk user
### B.	User
1.	Home Scene yang menampilkan Welcome dan button untuk memulai mengecek LifeStyle dan juga History yang pernah dilakukan.
2.	Inputan Scene yang berisikan beberapa pertanyaan terhadap pola hidup (LifeStyle) yang akan di cek.
3.	Hasil Scene akan menampilkan hasil dari pengecekan LifeStyle pengguna serta dampak apa saja yang bisa didapatkan.
4.	History Scene akan menampilkan riwayat-riwayat dari pengecekan LifeStyle user sebelumnya.
### C.	Thread
1.	Thread pertama diterapkan untuk fitur loading pada saat membuka aplikasi.

## Penjelasan Penerapan Prinsip OOP
### A.	Config dan Controllers
1.	Terdapat class DbConfig.java yang berisikan 5 atribut protected dan 1 method untuk koneksi ke database yang access modifiernya protected juga.
2.	Terdapat 2 class controller, yaitu HistoryControllers.java dan UserControllers.java di mana masing-masing meng-extends class DbConfig.java sebelumnya. Jadi semua class mendapatkan warisan atribut dan method untuk mendapatkan koneksi ke database.
### B.	Models
1.	Terdapat class induk untuk models yaitu Model.java di mana class ini memiliki atribut int id, constructor, serta getter dan setternya. Class ini dibuat karena semua model yang mereferensikan tabel itu memiliki id masing-masing, jadi class model lain sisa meng-extends class ini untuk mendapatkan atribut id.
2.	Terdapat 2 class model lainnya yaitu History.java dan User.java di mana semua class ini meng-extends class induk (Model.java) sebelumnya.
### C.	Scenes
1.	Terdapat abstract class yaitu AbstractScene.java di mana class ini memiliki atribut protected Stage, contructor, dan abstract method show().
2.	Lalu terdapat 4 class scene yang meng-extends class AbstractScene sebelumnya dan meng-override method show() sesuai dengan isi scene masing-masing scene.

## Mentoring
-	Muh. Adnan Putra Amiruddin – Rabu, 15 Mei 2024
-	Muh. Adnan Putra Amiruddin – Rabu, 22 Mei 2024
-	Muh. Adnan Putra Amiruddin – Kamis, 23 Mei 2024

## Link Repository Github Project : 
https://github.com/Adrian29-gpu/MyLifeStyle-Project

## Screenshots 
#### _MainScene_
![gambar1](https://github.com/Adrian29-gpu/MyLifeStyle-Project/assets/143728754/ea406fe3-f7a6-444b-b114-7f638451fcec)
#### _RegistrationScene_
![gambar2](https://github.com/Adrian29-gpu/MyLifeStyle-Project/assets/143728754/55fea030-1b50-4da9-9a2b-63034532f86f)
#### _RegisterSuccesScene_
![gambar3](https://github.com/Adrian29-gpu/MyLifeStyle-Project/assets/143728754/2f7c6768-7e63-4a43-bb5c-d62f4d3bcee4)
#### _LoginScene_
![gambar4](https://github.com/Adrian29-gpu/MyLifeStyle-Project/assets/143728754/ad263c54-ebea-4ba4-a189-a5a50328b2b2)
#### _InputScene1_
![Screenshot 2024-06-07 155221](https://github.com/Adrian29-gpu/MyLifeStyle-Project/assets/143728754/6105c3ef-9ea8-4e23-bdec-e7d5e8ca9a3f)
#### _InputScene2_
![Screenshot 2024-06-07 155227](https://github.com/Adrian29-gpu/MyLifeStyle-Project/assets/143728754/f2c22bda-5492-4c3d-a2d0-5cba076d3554)
#### _ResultScene1_
![Screenshot 2024-06-07 155241](https://github.com/Adrian29-gpu/MyLifeStyle-Project/assets/143728754/616d4043-6948-44e4-891c-3dcb2cb429c0)
#### _ResultScene2_
![Screenshot 2024-06-07 155249](https://github.com/Adrian29-gpu/MyLifeStyle-Project/assets/143728754/1513d3dd-a3fc-41d0-9d98-b0e8ad8742bf)
#### _HistoryScene_
![gambar9](https://github.com/Adrian29-gpu/MyLifeStyle-Project/assets/143728754/663ed4db-48a7-46b6-bbd1-c40bd5094108)

## Pengujian Pada Aplikasi
![Screenshot 2024-06-07 153138](https://github.com/Adrian29-gpu/MyLifeStyle-Project/assets/143728754/9881931d-ed01-4dd3-ac0b-fec35c839b0a)
