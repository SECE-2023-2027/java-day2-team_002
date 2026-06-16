import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    s = s.replace("Python", "Java");
    System.out.print(s);
}