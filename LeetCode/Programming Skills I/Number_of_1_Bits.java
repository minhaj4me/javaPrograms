/**
 * Number_of_1_Bits
 */
public class Number_of_1_Bits {

    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int count=0;
       while(n!=0){
           n=n&(n-1);   //removing the last bit and letting n tends to zero;
           count++;
       }
            return count;
        }
    }
    
    
    // public class Solution {
    //     // you need to treat n as an unsigned value
    //     public int hammingWeight(int n) {
    //         int count=0;
    //    while(n!=0){
    //        if((n&1)==1){
    //            count++;
    //        }
    //        n=n>>1;
    //    //right shift the last bit and letting n tends to zero;
    //    }
    //         return count;
    //     }
    // }
    
    
    
    
    /*
         int binary=0;
            while(n!=0){
               int remainder=n%2;
                binary=remainder+binary*10;
        // System.out.println (binary);
        n/=2;
            }
            int count=0;
          while(n!=0){
              int rem=n%10;
          
              
          if(rem==1){
                    count++;
                }
                n=n/10;
          }
            return count;
    */
}