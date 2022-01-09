                                                           /*NAIVE APPROACH*/
class Solution {
    public int kthFactor(int n, int k) {
        //NAIVE APPROACH
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i=1; i<=n ; i++){
            if (n%i == 0)
                list.add(i);
        }
        
        if (list.size() < k){
            return -1;
        }
        
        return list.get(k-1);
    }
}


                                                           /*SIEVE OPTIMIZED*/
class Solution {
    public int kthFactor(int n, int k) {
        // SIEVE OPTIMIZED
        boolean[] sieve = new boolean[n+1];
        Arrays.fill(sieve , false);
        int count = 0;
        for (int i=1; i*i<=n; i++)
        {
            if (n%i == 0){
                sieve[i] = true;
                sieve[n/i] = true;
                
                count = count+2;
                
                if (i==n/i)
                    count = count -1;
            }
        }
        
        if (count < k)
            return -1;
        int ans = -1;
        for (int i = 0; i<=n; i++){
            if (sieve[i] == true)
                k--;
            
            if (k==0){
                ans = i;
                break;
            }
        }
        return ans;
    }
}

                                                          /*BEST SOLUTION*/
class Solution {
    public int kthFactor(int n, int k) {
        for (int x = 1; x < n / 2 + 1; ++x) {
            if (n % x == 0) {
                --k;
                if (k == 0) 
                    return x;    
            }    
        }
        
        return k == 1 ? n : -1;
    
    }
}
