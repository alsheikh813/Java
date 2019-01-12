import java.util.Scanner;
public class MyClass {
    Scanner input = new Scanner(System.in);
    public void printMsg(String msg) {
        System.out.println(msg);
    }

    public void guessMyNumber() {
        int rand =(int) Math.floor(Math.random() * 10);

        for (int i =0; i < 3 ; i++){
            System.out.println("please guess Number between 0 - 10 :");
            int number = input.nextInt();
            if(number == rand ){
                System.out.println("Congratulation!! You win!!");
                return;
            }else{
                System.out.println("Sorry !! Wrong guess Please try again :");

            }
        }
        System.out.println("Sorry !! Game Over the number is :" + rand);
    }
    public void acceptAndReverse(){
         int[] array = new int[5];
        System.out.println("Please Enter 5 numbers :");
        for (int i = 0; i < 5; i++) {
             array[i] = input.nextInt();
        }
        for (int i = 4; i >= 0 ; i--) {
            System.out.println(array[i]);
        }

    }

}
