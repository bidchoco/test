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

        int[] a = {4, 9, 8,777};
          System.out.println(isFancy(61));
          //System.out.println(isEvenSubset(8, 12));
          
    }
    
        //May 21, 2016 Qno 1//
        public static int getExponent(int n, int p)
        {
            if (p > n && p <= 1)
                return -1;
            int count = 0;
            while(n%p==0 && n !=0){
                count++;
                n=n/p;
            }
            return count;
        }
        //May 21, 2016 Qno 2//
        public static int is121Array(int[] a)
        {
            if(a.length < 3 && a[0] !=1)
                return 0;
            boolean twoStarted = false;
            for (int i = 0; i <= a.length/2; i++)
            {
                if (!twoStarted && a[i] == 1 && a[i] == a[a.length - 1 - i])
                    continue;
                else if (!twoStarted && a[i] == 2)
                    twoStarted = true;
                else if (!twoStarted)
                    return 0;
                if (twoStarted && a[i] == 2 && a[i] == a[a.length - 1 - i])
                    continue;
                else if (twoStarted)
                    return 0;
            }
            if(twoStarted)
                return 1;
            return 0;
        }
        //May 21, 2016 Qno 3//
        public static int isMaxMinEqual(int[] a)
        {
            if (a.length < 2)
                return 0;
            int max=a[0], min=a[0], maxCount = 0, minCount = 0;
            for (int i = 0; i < a.length; i++)
            {
                if (a[i] > max)
                {
                    max = a[i];
                    maxCount = 0;
                }
                else if(a[i] < min){
                    min = a[i];
                    minCount = 0;
                }
                if (max == a[i])
                    maxCount++;
                if (min == a[i])
                    minCount++;

            }
            if (max != min && maxCount == minCount)
                return 1;
            return 0;

        }
    //18th of June 2016 QNo 1//
        public static int hasSingleMode(int[] a)
        {
            int modeNumber = 0;
            int modeCount = 0;
            int currentModeNumber = 0;
            int currentCount = 0;
            int hasSingleMode = 0;
            for (int i = 0; i < a.length; i++)
            {
                currentCount = 0;
                currentModeNumber = a[i];
                for (int j = 0; j < a.length; j++)
                {
                    if (a[j] == currentModeNumber)
                        currentCount++;
                }
                if (currentCount > 1 && modeNumber != a[i] && currentCount >= modeCount)
                {
                    if (currentCount == modeCount)
                        hasSingleMode = 0;
                    else
                        hasSingleMode = 1;
                    modeCount = currentCount;
                    modeNumber = currentModeNumber;
                }
            }
            if (modeNumber == 0)
                return 0;
            return hasSingleMode;
        }
        //July 2nd 2016 Qno 1//
        public static int isPaired(int[] a)
        {
            for (int i = 0; i < a.length; i++)
            {
                if ((i % 2 == 0 && a[i] % 2 == 0) || (i % 2 != 0 && a[i] % 2 != 0))
                    return 0;
            }
            return 1;
        }

        //July 2nd 2016 Qno 2 //
        public static int isHeavy(int[] a)
        {
            boolean hasOdd = false;
            boolean finalBreak = false;
            int isHeavy = 1;
            for (int i = 0; i < a.length; i++)
            {
                if (finalBreak)
                    break;
                if (a[i] % 2 != 0)
                {
                    hasOdd = true;
                    for (int j = 0; j < a.length; j++)
                    {
                        if (a[j] % 2 == 0 && a[j] > a[i])
                        {
                            finalBreak = true;
                            isHeavy = 0;
                            break;
                        }
                    }
                }
            }
            if (hasOdd)
                return isHeavy;
            return 0;
        }
        //July 2nd 2016 Qno 3//
        public static int maxDistance(int a)
        {
            int lower = 0;
            int higher = 0;
            for(int i = 2; i <= a/2; i++)
            {
                if (a % i == 0 && lower == 0)
                    lower = i;
                else if (a % i == 0)
                    higher = i;
            }
            if (higher != 0)
                return higher - lower;
            return 0;
        }
        //Aug 20, 2016 Qno 2//
        public static int isSub(int[] a)
        {            
            for (int i = 0; i < a.length; i++)
            {
                int sum=0;
                for (int j = i + 1; j < a.length; j++)
                {
                    sum += a[j];
                }
                if (sum >= a[i])
                    return 0;
            }
            return 1;
        }


        //July 16, 2016 QNo 1//
        public static int isMeeraNumber(int a)
        {
            int factorCount = 0;
            for (int i = 2; i <= a/2; i++)
            {
                if (a % i == 0)
                    factorCount++;
            }
            if(a%factorCount == 0)
                return 1;
            return 0;
        }
    
    //July 30 2016 QNo 1//
        public static int mostOccourDigit(int a)
        {
            int[] occourance = new int[10];
            while (a != 0)
            {
                occourance[a % 10]++;
                a =a/10;
            }
            int max = occourance[0];
            int index = -1;
            for (int i = 0; i < occourance.length; i++)
            {
                if (occourance[i] > max)
                {
                    index = i;
                    max = occourance[i];
                }
                else if (occourance[i] == max)
                    index = -1;
            }
            return index;
        }

        // 20 Aug 2016 QNo 3//
        public static int isSym(int[] a)
        {
            int isSym = 1;
            for (int i = 0; i <= a.length/2; i++)
            {
                if (a[i] % 2 == a[a.length -1 - i] % 2)
                    continue;
                isSym = 0;
                break;
            }
                return isSym;
        }
    

    // Sept 3rd 2016 QNo 1//
    public static int factorTwoCount(int a){
            int count = 0;
            while (a % 2 == 0)
            {
                count++;
                a /= 2;
            }
            return count;
        }
    // Sept 3rd 2016 QNo 3//
        public static int goodSpread(int[] a)
        {
            int goodSpread = 1;
            int currentCount = 0;
            boolean finalBreak = false;
            for (int i = 0; i < a.length; i++)
            {
                if (finalBreak)
                    break;
                currentCount = 0;
                for (int j = 0; j < a.length; j++)
                {
                    if (a[i] == a[j])
                        currentCount++;
                    if (currentCount > 3)
                    {
                        finalBreak = true;
                        goodSpread = 0;
                        break;
                    }
                }
            }
            return goodSpread;
        }
    
    //October 1st, 2016 Qno 1//
    public static int isFancy(int a){
        int fancy = 1;
        int x=1;
        int y=1;
        if(a==1)
            return 1;
        while(fancy < a){
            fancy = x*2 + y*3;
            x=y;
            y=fancy;
            if(a==fancy)
                return 1;            
        }
         return 0;
    }
    
    //October 1st, 2016 Qno 3//
    public static int isBean(int[] a){
        int isBean = 0;
        boolean finalBreak = false;
        for(int i = 0; i<a.length; i++){
            if(finalBreak)
                break;
            for(int j = 0; j<a.length; j++){
                if(a[i]== 2*a[j] || a[i] == 2*a[j]+1 || a[i] == a[j]/2 ){
                    isBean = 1;
                    break;
                }
                isBean = 0;
                if(j==a.length -1 && isBean == 0)
                    finalBreak = true;                
            }
        }
        return isBean;
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
                    break;
                }
                isBalanced = 0;
                if(j==a.length -1 && isBalanced == 0){
                    finalBreak = true;
                }               
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
