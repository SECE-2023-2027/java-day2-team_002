import java.util.Scanner;
void main(){
    Scanner sc = new Scanner(System.in);
    String  s = sc.nextLine();
    
    if(!s.substring(1).contains(s.charAt(0)+"")){
        System.out.print(s.charAt(0));
        return;
    }
    else if(!s.substring(0, s.length()-1).contains(s.charAt(s.length() - 1)+"")){
        System.out.print(s.charAt(s.length()-1));
        return;
    }
    
    for(int i=1;i<s.length()-1;i++){
        if(!s.substring(0, i).contains(s.charAt(i)+"") && !s.substring(i+1).contains(s.charAt(i)+""))
        {
            System.out.print(s.charAt(i));
            return;
        }
    }

}