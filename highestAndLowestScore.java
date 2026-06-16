import java.util.Scanner;
class Student{
    String name;
    String id;
    int score;
    Student(String name, String id, int score){
        this.name = name;
        this.id = id;
        this.score = score;
    }
}
void main(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Student[] students = new Student[n];
    for(int i=0;i<n;i++){
        String name = sc.next();
        String id = sc.next();
        int score = sc.nextInt();
        students[i] = new Student(name, id, score);
    }
    
    Student maxScoreStudent = students[0];
    Student minScoreStudent = students[0];
    
    for(int i=1;i<n;i++){
        if(students[i].score > maxScoreStudent.score){
            maxScoreStudent = students[i];
        }
        if(students[i].score < minScoreStudent.score){
            minScoreStudent = students[i];
        }
    }
    
    System.out.println(maxScoreStudent.name+" "+maxScoreStudent.id);
    System.out.println(minScoreStudent.name+" "+minScoreStudent.id);
}