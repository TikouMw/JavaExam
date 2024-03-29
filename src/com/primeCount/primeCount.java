public class primeCount{

	public static int primeCount(int start, int end){
        int count = 0, i;
        if(start > end || (start == end && end == 1)) return count;
        else if(start < 0) start = 2;
        while(start <= end){
            for(i=2; i<=start/2;i++)
                if(start % i == 0) break;
            if(i > start/2) count++;
            start++;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11, 29));
        System.out.println(primeCount(20, 22));
        System.out.println(primeCount(1, 1));
        System.out.println(primeCount(5, 5));
        System.out.println(primeCount(6, 2));
        System.out.println(primeCount(-10, 6));
    }
}
