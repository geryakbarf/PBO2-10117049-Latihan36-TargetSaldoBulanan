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

public class PBO210117049Latihan36TargetSaldoBulanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TargetSaldo saldo = new TargetSaldo();
        
        saldo.saldoAwal = 3500000;
        saldo.bunga = 0.08;
        
        saldo.targetSaldo(saldo.saldoAwal, saldo.bunga);
        
    }
    
}
