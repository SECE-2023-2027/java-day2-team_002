import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();

    if (areAnagrams(s1, s2)) {
        System.out.println("Anagrams");
    } else {
        System.out.println("Not Anagrams");
    }
}

static boolean areAnagrams(String s1, String s2) {
    
    s1 = s1.replaceAll("\\s+", "").toLowerCase();
    s2 = s2.replaceAll("\\s+", "").toLowerCase();

    if (s1.length() != s2.length()) {
        return false;
    }

    char[] arr1 = s1.toCharArray();
    char[] arr2 = s2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1, arr2);
}