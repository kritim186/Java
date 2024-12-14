public class Arrays01 {
    public static void main(String[] args) {
       //Store a name
        String My_name = "Kriti Mishra";
       //Store a roll number
       int Roll_number = 9;
       //Store five roll numbers
       //so here comes array into picture
// syntax goes something like this 

// datatype variable_name = new datatype[size of the array]

         int new_array[] = new int[12];
        int names[] = {1, 23, 34, 45, 56};
//can be declared in two ways
// new keyword is used to create an object in the memory in java
       int roll[];//Declaration of an array, here roll is getting defined in the stack
      roll = new int[2];//initialisation; object is created, Actual memory creation happens here
//internally array may not be continuous because it depends on JVM
      System.out.println(names[0]);
    //   so names[0]---> element at 0th index of name array
    System.out.println(names[4]);

for (int i=0; i<=4; i++){
   System.out.println(names[i]);
}

    }
    
}
