/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan36.targetsaldobulanan;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk mneghitung berapa
 * lamanya menabung untuk mencapai target tabungan dengan ditambah bunga
 * perbulannya  
 */
public class TargetSaldo {
    public int saldoAwal;
    public double bunga;
    public int saldoTarget;
    
    public void targetSaldo(int parSaldo, double parbunga){
        int i = 0;
        while (saldoAwal <= 6000000) {
            i = i + 1;
            saldoTarget = (int) (bunga * saldoAwal);
            saldoAwal =  saldoAwal + saldoTarget;
            System.out.println("Saldo di Bulan ke-" + i + " Rp."
                    + saldoAwal);
        }
        
    }
    
}
