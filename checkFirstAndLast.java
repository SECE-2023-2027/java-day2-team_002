import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    if(arr[0] == arr[n-1]){
        System.out.print("true");
    }
    else{
        System.out.print("false");
    }
}
