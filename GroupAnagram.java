//TC - O(n∗k)
//SC - O(n)

// Approach - We use mathematical property that product of prime numbers is always unique.
// We assign a prime number to each character.
class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {

        Double primeProduct;
        HashMap<Double, List<String>> map = new HashMap<>();

        // base case
        if(strs== null || strs.length==0){
            return null;
        }

        // iterating through words and creating output map of anagrams if product of two words is equal.
        for(String str : strs){
            primeProduct = getPrimeProduct(str);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            }

            map.get(primeProduct).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private Double getPrimeProduct(String str){

        // prime array
        int[] primes = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101
        };

        Double primeCount = 1d;

        // calculating product of primes
        for (char c : str.toCharArray()) {
            primeCount *= primes[c - 'a'];
        }

        return primeCount;
    }
}