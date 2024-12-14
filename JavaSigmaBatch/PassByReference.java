class PassByReference{

    static void updateArray(int[] marks, int num){
        for(int i = 0; i < marks.length; i++){
            marks[i] += 1;
        }
        num = 98;
    }
    public static void main(String[] args) {
        int marks[] = {1, 3, 4};
        int nonChangeable = 90;
        updateArray(marks, nonChangeable);
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println(nonChangeable);
    }
}