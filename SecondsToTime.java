import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of seconds:");
    int seconds = sc.nextInt();
    
    int hours = seconds / 3600;
    int minutes = (seconds % 3600) / 60;
    int remainingSeconds = seconds % 60;
    
    System.out.println("Time: " + hours + " hours, " + minutes + " minutes, " + remainingSeconds + " seconds");
}