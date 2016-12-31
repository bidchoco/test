/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsoleapplication;

/**
 *
 * @author ryamzzz
 */
public class JavaConsoleApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {4, 9, 6, 7, 3};
          System.out.println(isBunkerArray(a));
    }
    //Dec 10 2016 Qno. 2//
    public static int isBunkerArray(int[] a){
        boolean isBunker = false;
        for(int i = 0; i < a.length; i++){
            if(i != a.length -1 && a[i]%2 != 1 && isPrime(a[i+1]) == 1 ) {
            } else {
                isBunker = true;
            }
            break;
        }
        if(isBunker)
            return 1;
        else
            return 0;
    }
    public static int isPrime(int a){
        for(int i = 2; i<a; i++){
            if(a%i == 0)
                return 0;
        }
        return 1;
    }
  
    //Dec 10 2016 Qno. 3//
    public static int isMeera(int[] a){
        boolean isMeera = true;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                if(a[i]*2 == a[j]){
                    isMeera = false;
                    break;
                }                    
            }
        }
        if(isMeera)
            return 1;
        else
            return 0;
    }
    
}
