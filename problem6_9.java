class problem6_9 {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {
            if (i % 2 == 1){
                for (int j = 9; j >= 1; j--) {
                    System.out.println(i + "×" + j + "=" + (i*j));;
                }
            }
        }
    }
}
