package com.DsaPlaylist.Strings;

//35.     1      1
//        12    21
//        123  321
//        12344321

public class Pattern {

    static void main() {

        for(int i=1; i<=4; i++){

        for (int j=1; j<=i; j++){
            System.out.print(j);
        }

        for (int l=(8-(i*2)); l>=1; l--){
            System.out.print("*");
        }

        for (int k=i; k>=1; k--){
            System.out.print(k);
        }
            System.out.println("");
        }
    }

}
