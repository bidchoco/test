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

        int[] a = {4, 2, -3, 12};
          //System.out.println(isSuper(a));
          //System.out.println(isEvenSubset(8, 12));
          
    }
    //October 29th, 2016 Qno 1//
    public static int[] fill(int[] a, int k, int n){
        int[] arr = new int[n];
        if(k<1 || n < 1 || n < k || a.length < k)
            return null;
        for(int i = 0; i<k; i++){
            arr[i] = a[i];
        }
        for(int i = k; i< n; i++){
            arr[i] = a[i%k];
        }
        return arr;
    }
    //October 29th, 2016 Qno 2//
    public static int isSuper(int[] a){
        int isSuper = 1;
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > sum)
                sum += a[i];
            else{
                isSuper = 0;
                break;
            }                
        }
        return isSuper;
    }
    
    //October 29th, 2016 Qno 3//
    public static int isHollow(int[] a){
        int isHollow = 0;
        int zeroCount = 0;
        int leftCounter = 0;
        int rightCounter = 0;
        boolean isLeft = true;
        if(a[0] != 0 && a[a.length -1] != 0)
        {
            for(int i = 0; i < a.length; i++){
                if(a[i] != 0  && isLeft){
                    leftCounter++;
                }
                else if(a[i] != 0  && !isLeft)
                {
                    rightCounter++;
                }
                else
                {
                    zeroCount++;
                    isLeft = false;                            
                }
            }
            if(zeroCount > 2 && leftCounter == rightCounter)
                isHollow = 1;
        }
        return isHollow;
    }
    
    //Nov 26 2016 Qno 1//
    public static int isEvenSubset(int m, int n){
        int isEvenSubset = 0;
        for(int i = 2; i < m; i++){
            if(i%2 == 0 && m%i == 0 && n%i == 0){                
                isEvenSubset = 1;
                continue;
            }
            else if(i%2 == 0 && m%i == 0 && n%i !=0)
                isEvenSubset = 0;
        }
        return isEvenSubset;
    }
    
    //Nov 26 2016 Qno 2//
    public static int isTwinoid(int[] a){
        int isTwinoid = 1;
        for(int i = 0; i<a.length; i++)
        {
            if( i> 0 &&isTwinoid == 1 && i != a.length -1 && a[i-1] %2 == 0 && a[i]%2==0 && a[i+1]%2==0){
                isTwinoid = 0;
                break;
            }
        }
        return isTwinoid;
    }
    

        
    

    //Nov 26 2016 Qno 3//
    
    public static int isBalanced(int[] a){
        int isBalanced = 0;
        boolean finalBreak = false;
        for(int i = 0; i<a.length; i++){
            if(finalBreak)
                break;
            for(int j = 0; j<a.length; j++){
                if(a[i] == -a[j]){
                    isBalanced = 1;
                    continue;
                }
                if(j==a.length -1 && isBalanced == 0)
                    finalBreak = true;                
            }
        }
        return isBalanced;
    }
    
    //Dec 10 2016 Qno. 1 //

    public static int countDigit(int a, int num){
        int count = 0;
        while(a%10!=0 || a/10 > 0) {
            if(a%10 == num)
            count++;
            a=a/10; 
            }
               
        return count;
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