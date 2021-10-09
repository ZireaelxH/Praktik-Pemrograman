print("Program Siakad :")
print("1. Tambah Data ")
print("2. Edit Data ")
print("3. Hapus Data ")
print("4. Lihat Data ")
menu = input("Menu yang Anda pilih = ")
menu = int(menu)
if (menu == 1):
    print("1. Tambah Data Mahasiswa")
    print("2. Tambah Data Mata kuliah")
    print("3. Kembali")
    menu2 = input("Menu yang Anda pilih = ")
    menu2 = int(menu2)
    if (menu2 == 1):
        namaMahasiswa = input("Masukan nama mahasiswa = ")
        print("Mahasiswa yang Anda tambah adalah " + str(namaMahasiswa))
    elif (menu2 == 2):
        namaMataKuliah = input("Masukan nama mata kuliah = ")
        print("Mata kuliah yang Anda tambah adalah " + str(namaMataKuliah))
    elif (menu2 == 3):
        print("Terima kasih")
    else:
        print("Menu tidak ada")
elif (menu >= 2 and menu <= 4):
    print("Fitur belum tersedia")
else:
    print("Menu tidak ada")