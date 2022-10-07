import java.util.Scanner;
public class week3 {
        public static void main(String[] args){
    Scanner newsc = new Scanner(System.in);
    System.out.println("Enter start integer");
    Integer Startno = newsc.nextInt();
    System.out.println("Enter end integer");
    Integer Endno = newsc.nextInt();
    int counter = 0;
    while(counter <= Endno - Startno ){
        if((counter + Startno) % 2 == 0){
            System.out.println(counter + Startno);
        }
        else{
             if(counter % 5 == 0 && (counter + Startno) * 3 <= 100){
            System.out.println((counter + Startno) * 3);
        }
        }
       
    counter += 1;
    }
    }
}