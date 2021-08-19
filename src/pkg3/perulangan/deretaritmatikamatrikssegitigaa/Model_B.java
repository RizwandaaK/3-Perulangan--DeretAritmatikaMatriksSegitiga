/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.perulangan.deretaritmatikamatrikssegitigaa;

/**
 *
 * @author rizwa
 */
public class Model_B {
    public static void main(String[] args) {
        int nilaipertama_a = 5;
        int selisih_b = 3;
        int jmlkolom = 8; 
        int sukusaatini = nilaipertama_a;
        int jmlderet = nilaipertama_a;
        System.out.println("Deret Aritmatikanya jika dibuat segitiga sbb:");
        System.out.println("");
        for(int i=0;i<jmlkolom;i++){
            for(int j=0;j<jmlkolom-i;j++){
            System.out.print(sukusaatini+"\t");
            sukusaatini=sukusaatini+selisih_b;
            jmlderet=jmlderet+sukusaatini;
        }
            System.out.println();
        }
        jmlderet=jmlderet-sukusaatini;
        System.out.println("");
        System.out.println("Jumlah Deret Aritmatikanya adalah "+jmlderet);
    }
}
