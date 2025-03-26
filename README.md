# Java-Pemula

setup Environment Variabel

1. JAVA_HOME
2. D:\JAVA\jdk-22.0.1
3. Path nya %JAVA_HOME%\bin
4. https://openjdk.java.net/ : download jdk java

========Cek Java Version=========================

java -version

javac -version

=========IDE yg di gunakan=======================

intelli JDEA Community

============================

1. psvm : public static void main
2. javac HelloWord.java : cara compile
3. java HelloWord : cara run

compaile :

javac HelloWord.java

java HelloWord

==================================

1. psvm : public static void main
2. sout : System.out.println


===========================

Java Basic :

1. public static void main
2. System.out.println
3. tipe data number :
    - byte : 1 byte : -128 - 127
    - short : 2 byte : -32768 - 32767
    - int : 4 byte : -2147483648 - 2147483647
    - long : 8 byte : -9223372036854775808 - 9223372036854775807
    - float : 4 byte : -3.4028235E38F - 3.4028235E38F
    - double : 8 byte : -1.7976931348623157E308 - 1.7976931348623157E308
4. konversi number : problem nya number overflow
    - widening casting (Otomatis) : 
    - narrowing casting (Manual) : 

5. tipe data character
    - char : 1 byte : 0 - 65535 : contoh 'A'
    - konversi character : (char) 65
  
6. tipe data boolean
    - boolean : 1 byte : true - false

7. tipe data string
8. variabel
    - menggunakan var : atau pake final var = "test";
    - menggunakan tipe data : 
9. tipe data bukan primitive : memiliki method/fungsi
    - Byte : 
    - Short
    - Integer contoh : Integer NilaiInt = NilaiByte2.intValue();
    - Long
    - Float
    - Double
    - Character
    - Boolean

10. tipe data array
    - membuat array : String Nama[] = new String[3];
    - array initializer : String[] Nama = {"ASEP","HALAU","JOKO"};
    - mengambil panjang array : Nama.length
    - mengambil data array : Nama[0]
    - mengubah data array : Nama[0] = "JOKO";
    - array di dalam array : String[][] Nama = {{"ASEP","HALAU"},{"JOKO","JUAN"}};

11. operasi matematika
    - penjumlahan : 1 + 1 = 2
    - pengurangan : 1 - 1 = 0
    - perkalian : 1 * 1 = 1
    - pembagian : 1 / 1 = 1
    - sisa pembagian : 1 % 1 = 0

    Augmented Assignment
    - penjumlahan : 1 += 1 = 2
    - pengurangan : 1 -= 1 = 0
    - perkalian : 1 *= 1 = 1
    - pembagian : 1 /= 1 = 1
    - sisa pembagian : 1 %= 1 = 0

    unary operator
    - increment : 1++ = 2
    - decrement : 1-- = 0

12. operasi perbandingan
    - lebih dari : 1 > 1 = false
    - kurang dari : 1 < 1 = false
    - lebih dari atau sama dengan : 1 >= 1 = true
    - kurang dari atau sama dengan : 1 <= 1 = true
    - sama dengan : 1 == 1 = true
    - tidak sama dengan : 1 != 1 = false

13. operasi Boolean
    - AND : true && true = true
    - OR : true || false = true
    - NOT : !true = false

14. Expression adalah konstruksi dari variabel, operator dan pemanggilan method yang mengevaluasi menjadi sebuah single value.
    - Expression adalah core component dari statemen

    - Statement bisa dibilang adalah kalimat lengkap dalam bahasa.

    - Block adalah kumpulan statement yang terdiri dari nol atau lebih statement.
    - Block diawali dan diakhiri dengan kurung kurawal { }

15. if statement, if else statement, else if statement
16. switch statement :
    - lambda expression di switch statement
17. ternary operator : operator sederhana dari if statement
    contoh : (Usia >= 17 && Pelajar == "Pelajar") ? "Anda Boleh Ujian " : "Anda Tidak Boleh Ujian";

18. For Loop
    - for (int i = 0; i < 10; i++)
19. While Loop
    - while (int i = 0; i < 10; i++)
20. Do While Loop
    - do while (int i = 0; i < 10; i++)
21. Break
    - break
22. Continue
    - continue : keluar dari loop atas dan kembali ke awal loop
23. for each di gunakan untuk mengulangi array
    - for (int i = 0; i < 10; i++)
    - for (int[] DataArray : Nilai)
24. method atau function
    - public void method() {
        
    }
25. method dengan parameter
    - public void method(String param) {
        
    }

26. method dengan return value
    - public int method() {
        return 1;
    }
27. method dengan variable argument :  
    - untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih
    - contoh nya dengan array
    - public void method(String... param) {
        
    }

30. method overloading
    - adalah method yang memiliki nama yang sama tetapi parameter yang berbeda

31. Recursive Method
    - adalah method yang memanggil diri sendiri
    - contoh : faktorial
    - problem nya : error stack overflow
    - testLoop(5529)

32. Scope adalah area di mana variabel dapat diakses