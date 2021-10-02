ipk = input("Masukkan IPK Anda = ")
ipk = float (ipk)
lamaStudi = input("Masukkan Lama Studi Anda = ")
lamaStudi = float (lamaStudi)
if (ipk >= 3.51 and ipk <= 4 and lamaStudi <= 4):
    print("Selamat, Anda mendapatkan predikat Summa Cumlaude")
elif (ipk >= 3.51 and ipk <= 4 and lamaStudi > 4):
    print("Selamat, Anda mendapatkan predikat Cumlaude")
elif (ipk >= 3.01 and ipk < 3.51):
    print("Anda mendapatkan predikat Sangat Memuaskan")
elif (ipk >= 2.76 and ipk < 3.01):
    print("Anda mendapatkan predikat Memuaskan")
elif (ipk >= 2.00 and ipk < 2.76):
    print("Anda mendapatkan predikat Cukup")
elif (ipk < 2.00 and ipk >= 0):
    print("Anda dinyatakan Tidak Lulus")
else:
    print("Predikat Anda tidak valid")