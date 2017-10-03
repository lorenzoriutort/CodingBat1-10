public class Runner {

    public static void main(String[] args) {
        System.out.print(sleepIn(false, true));
        int[] x = new int[5];
        x[0] = 1;
        x[1] = 1;
        x[2] = 2;
        x[3] = 2;
        x[4] = 1;
        int[] y = new int[2];
        x[0] = 3;
        x[1] = 3;
        int[] q = new int[4];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;
        int[] g = new int[2];
        x[0] = 10;
        x[1] = 10;
        System.out.print(noTriples(x));
        System.out.print(nonStart("Java", "Code"));
        System.out.print(double23(y));
        System.out.print(teenSum(13,2));
        System.out.print(loneSum(3,2,3));
        System.out.print(oneTwo("tca"));
        System.out.print(sumDigits("aa11b33"));
        System.out.print(no14(q));
        System.out.print(canBalance(g));
    }


    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        }else {
            return false;
        }
    }



    public static boolean noTriples(int[] x) {
        for (int i = 0; i < x.length - 2; i++) {
            int numWereOn = x[i];
            if (x[i + 1] == numWereOn && x[i + 2] == numWereOn) {
                return false;
            }
        }
        return true;
    }



    public static String nonStart(String a, String b) {
        String word1 = a.substring(1);
        String word2 = b.substring(1);
        return word1 + word2;
    }



    public static boolean double23(int[] nums) {
        for (int i=0; i<nums.length - 1; i++){
            int number = nums[i];
            if ((number == 2 && nums[i+1] == 2) || (number == 3 && nums[i+1] == 3)){
                return true;
            }
        }
        return false;
    }


    public static int teenSum(int a, int b) {
        if ((a <= 19 && a >= 13) || (b <= 19 && b >= 13)){
            return 19;
        }else{
            return a + b;
        }
    }


    public static int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            a = 0;
            b = 0;
            c = 0;
        } else if(a == b){
            a = 0;
            b = 0;
        }else if (a == c){
            a = 0;
            c = 0;
        }else if (b == c){
            b = 0;
            c = 0;
        }
        return a + b + c;
    }


    public static String oneTwo(String str){
        String rtnStr = "";
        for (int i = 0; i < str.length() / 3; i++) {
            rtnStr += str.substring(3*i + 1, 3*i + 2) + str.substring(3*i + 2, 3*i + 3) + str.substring(3*i, 3*i + 1);
        }
        return rtnStr;
    }


    public static int sumDigits(String str) {
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int current = Integer.parseInt(str.substring(i, i + 1));
                x += current;
            }
        }
        return x;
    }


    public static boolean no14(int[] nums) {
        for (int i=0; i<nums.length ; i++){
            int x = nums[i];
            if(x==1){
                for(int a = 0; a<nums.length; a++){
                    if(nums[a]==4){
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static boolean canBalance(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            int count2 = 0;
            for (int p = nums.length -1; p > i; p--){
                count2 += nums[p];
            }
            if (count == count2){
                return true;
            }
        }
        return false;
    }



}