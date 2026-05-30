 class Main {
    public static void main(String[] args) {

        int[] arr = {10, -5, 20, -15, 30};

        int positive = 0;
        int negative = 0;

        for(int num : arr) {
            if(num >= 0)
                positive++;
            else
                negative++;
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
    }
}
