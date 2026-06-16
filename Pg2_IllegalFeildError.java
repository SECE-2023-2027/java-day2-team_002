class IllegalFieldError{
    int a;
    Node node;
}

class Node{

}
public class Pg2_IllegalFeildError {
    public static void main(String[] args) {
        IllegalFieldError error = new IllegalFieldError();
        System.out.println(error.a);
        System.out.println(error.node);
    }
}