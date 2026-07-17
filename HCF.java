public class HCFRecursive {
    public static void main(String[] args) {
        int num1 = 60, num2 = 36;
        int hcf = findHCF(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }

    // Method to find HCF using Euclid's algorithm
    public static int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findHCF(b, a % b);
    }
}
