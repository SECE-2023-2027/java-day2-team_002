import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer>lt = new ArrayList<Integer>();

    for(int i=0;i<n;i++){
        lt.add(sc.nextInt());
    }

    int idx = sc.nextInt();
    lt.remove(idx);

    System.out.print(lt);
}