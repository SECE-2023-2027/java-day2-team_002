import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [][]sheet = new int[n][n+1];
    for(int i=0;i<n;i++){
        int sum = 0;
        for(int j=0;j<n;j++){
            sheet[i][j] = sc.nextInt();
            sum += sheet[i][j];
        }
        sheet[i][n] = sum;
    }

    for(int i=0;i<n;i++){
        for(int j=0;j<n+1;j++){
            System.out.print(sheet[i][j]+" ");
        }
        System.out.println();
    }

}