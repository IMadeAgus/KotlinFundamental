package org.example

fun main() {
    //Jika ingin membuat objek dengan tipe data null tambahkan ? setelah menentikan tipe datanya
    val nullString : String? = null

    // untuk mengakses atau mengelula objek tersebut, kita harus mengecek terlebih dahulu objeknya
    // null atau tidak

    //Menggunakan Safe calls (tambahkan ? di depan . )
    nullString?.length // kompiler akan melewatkan proses jika objek tersebut bernilai null.

    //Menggunakan Elvis Operator ( ?: )
    //Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.
    val nullStringLenght = nullString?.length ?: 7

    //Kode di atas sebenarnya sama seperti ketika kita menggunakan if/else berikut.
    val StringLenght = if (nullString != null) nullString.length else 7
}