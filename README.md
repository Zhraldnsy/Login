Project Aplikasi Desktop Menggunakan Netbeans dan Database PostgreeSQL
ZOHAR ALDIANSYAH//SMK PGRI 03 MALANG//XI-RPB

Berikut Adalah Struktur Databasenya

CREATE TABLE users (
id SERIAL PRIMARY KEY,
nama VARCHAR (50) NOT NULL,
username VARCHAR (50) NOT NULL,
email VARCHAR (50) NOT NULL,
telp INT  NOT NULL,
alamat VARCHAR (100) NOT NULL,
password VARCHAR (100) NOT NULL
);


CREATE TABLE siswa(
nis INT NOT NULL,
nama VARCHAR (100) NOT NULL,
gender VARCHAR (100) NOT NULL,
usia INT NOT NULL,
notelp INT NOT NULL,	
kota VARCHAR (100) NOT NULL
);
