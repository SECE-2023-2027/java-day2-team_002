import java.util.Scanner;
void main(){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] words = s.split(" ");
    String longestWord = "";
    for(String word : words){
        if(word.length() > longestWord.length()){
            longestWord = word;
        }
    }
    System.out.print(longestWord);
}