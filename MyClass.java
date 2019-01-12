import java.util.Scanner;
public class MyClass {
    public void printMsg(String msg) {
        System.out.println(msg);
    }

    public void guessMyNumber() {
        Scanner input = new Scanner(System.in);
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
}
