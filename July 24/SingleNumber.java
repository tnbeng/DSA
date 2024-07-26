class SingleNumber {
    public static void main(String args[]) {
        int[] arr = {4,5,5,1,1,19,8,8};

        int val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            val = val ^ arr[i];
            
        }

        System.out.println(val);
    }
}
