public class nUpCount{
	
	public static int nUpCount(int[] a, int n){
        int upcount = 0, partial_sum = 0;
        for(int i=0; i < a.length; i++){
            partial_sum += a[i];
            upcount += (partial_sum > n && partial_sum-a[i] <= n) ? 1 : 0;
        }
        return upcount;
    }

    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5));
        System.out.println(nUpCount(new int[]{6, 3, 1}, 6));
    }
}