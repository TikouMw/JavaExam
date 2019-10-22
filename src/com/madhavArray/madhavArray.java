public class madhavArray{

	public static int isMadhavArray(int[] a){
        int i = 1, index = 1, sum, num = 2;
        int ismadhav=0;
        while (index < a.length)
        {
            int temp = index * (index + 1) / 2;
            if (temp == a.length){
                ismadhav = 1;
                break;
            }
            index++;
        }
        if(ismadhav == 0) return 0;
        index=1;
        while(index<a.length){
            index += num;
            sum = 0;
            for(;i<index && i<a.length;i++)
                sum += a[i];
            if(a[0] != sum) return 0;
            i = index;
            num++;
        }   
        return ismadhav;
    }

    public static void main(String[] args){
        System.out.println(isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(isMadhavArray(new int[]{3, 1, 2, 3, 0}));
    }
}