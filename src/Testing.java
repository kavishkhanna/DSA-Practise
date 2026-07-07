public class Testing {

    //  1 1 2 3 5 8 13 21
    //  a b


    public static void main(String args[]){

        int limit= 7;

        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i < limit - 2 ; i++){
            System.out.println(a + b);
            if(i %2 ==0){
                a = a + b;
            }else{
                b = a+b;
            }
        }
        printFibonacci(1, 7, 0);
    }

   static void printFibonacci(int lastVariable, int limit, int sum){

//        while(counter < limit){
//            System.out.println(lastVariable);
//            counter++;
//            printFibonacci(1, 7, 1+ lastVariable);
//
//        }
    }
}
