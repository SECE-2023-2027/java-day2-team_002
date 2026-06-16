import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    List<Integer> lt = new ArrayList<>();

    for(int i=0;i<n;i++){
        lt.add(sc.nextInt());
    }
    int num = sc.nextInt();
    int len = 0;
    for(int i : lt){
        if(i == num)continue;
        len++;
    }

    System.out.print(len);
}