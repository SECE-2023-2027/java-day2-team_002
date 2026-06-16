import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    StringBuilder compressed = new StringBuilder();
    int count = 1;
    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == s.charAt(i - 1)) {
            count++;
        } else {
            compressed.append(s.charAt(i - 1));
            compressed.append(count);
            count = 1;
        }
    }
    compressed.append(s.charAt(s.length() - 1));
    compressed.append(count);
    System.out.println(compressed.toString());
}