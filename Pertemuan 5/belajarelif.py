umur = input("Masukan umur Anda = ")
umur = int(umur)
if (umur >= 0 and umur <=5):
    print("Anda balita")
elif (umur > 5 and umur <= 19):
    print("Anda remaja")
elif (umur >= 20):
    print("Anda sudah dewasa")
else:
    print("Umur anda tidak valid")