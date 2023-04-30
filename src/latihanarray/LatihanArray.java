/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanarray;

/**
 *
 * @author rajuyadera
 */
import java.util.*;
import java.io.*;
import java.util.*;

public class LatihanArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

//        Input
        Scanner input = new Scanner(System.in);
        int i, j;
        double totalPendapatan = 0;
        String namaPetugas, tanggal;
        int jumlah = 0;
        String[] kodeBarang = new String[10];
        String[] namaBarang = new String[10];
        int[] jumlahBeli = new int[10];
        double[] harga = new double[10];
        double[] totalHarga = new double[10];

        System.out.println(
                "                 PT.PERMATA PRATAMA                 ");
        System.out.println(
                "+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print(
                "Masukan Nama Petugas: ");
        namaPetugas = input.nextLine();
        System.out.print(
                "Tanggal: ");
        tanggal = input.nextLine();
        System.out.println(
                " ");
        System.out.print(
                "Jumlah Data yang akan dimasukkan: ");
        j = input.nextInt();
        System.out.println(
                "——————————————————-");

        for (i = 1; i < j; i++) {
            System.out.println("           Data Ke- " + i);
            System.out.print("             Kode Barang   : ");
            kodeBarang[i] = input.next();
            System.out.print("             Jumlah Beli        : ");
            jumlahBeli[i] = input.nextInt();
            System.out.println("——————————————————-");

            if (kodeBarang[i].equalsIgnoreCase("P001")) {
                namaBarang[i] = "Printer";
                harga[i] = 700000;
            } else if (kodeBarang[i].equalsIgnoreCase("V001")) {
                namaBarang[i] = "VGA Card";
                harga[i] = 75000;
            } else if (kodeBarang[i].equalsIgnoreCase("M001")) {
                namaBarang[i] = "Motherboard";
                harga[i] = 950000;
            } else {
                namaBarang[i] = "Tidak Terdaftar";
                harga[i] = 0;
            }

        }

//        Output
        System.out.println("                               PT. PERMATA PRATAMA                                   ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Nama Petugas               :" + namaPetugas);
        System.out.println("                     Tanggal :" + tanggal);
        System.out.println("Jumlah Data Yang Dimasukkan :" + j);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Data Ke-   Kode Barang     Nama Barang   Harga Barang   Jumlah Barang   Total Harga");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (i = 1; i < j; i++) {
            totalHarga[i] = harga[i] * jumlahBeli[i];
            System.out.println(i + "           " + kodeBarang[i] + "           " + namaBarang[i] + "   " + harga[i] + "             " + jumlahBeli[i] + "           " + totalHarga[i]);
            totalPendapatan = totalPendapatan + totalHarga[i];

        }
        System.out.println("Total Pendapatan pada tanggal" + " " + tanggal + " " + "adalah sebesar Rp." + totalPendapatan);
    }

}
