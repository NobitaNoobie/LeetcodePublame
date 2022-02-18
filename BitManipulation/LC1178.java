class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        //create a hashmap to access the letters of the albhabet by a number
        // we will reference these letters later when we will need to check their presence in the puzzle 
        /*         map:
        letter -> bit it stands for
        a --> stands for 0th bit 
        z --> stands for 25th bit
        */
        
        //Letter --> Index in HashMap
        HashMap<Character , Integer> map1 = new HashMap<>();
        for (int i=97; i<=122; i++)
        {
            int index = 0;
            map1.put ((char)i, index); //ASCII codes to detect characters
            index ++;
        }
        
        //build bitmask of words and store in an ArrayList
        ArrayList<Integer> wordbitmask = new ArrayList<Integer>();
        int n = words.length;
        for (int i=0; i<n; i++)
        {
            //each word in the word array
            //each word will have an array of bits as its bitmask
            StringBuilder sb = new StringBuilder();
            int[]nums = new int[26]; Arrays.fill(nums,0);
            for (int j=0; j<words[i].length(); j++)
            {
                nums[map1.getValue(words[i].charAt(i))] = 
            }
        }
        
        //Letter --> bitmask of words which contains map.getKey(i)
        HashMap<Character , Integer> map2 = new HashMap<>();
        
    }
}
