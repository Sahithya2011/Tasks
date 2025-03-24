import java.util.Stack;
public class BalanceGatesDesign {
    public static void main(String[] args) {
        String s = ")))(((";  // Example input

        if (isBalanced(s)) {
            System.out.println("Balanced gates");
        } else {
            System.out.println("Not Balanced gates");
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);  // Push opening bracket
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false; // More ')' than '('
                }
                stack.pop();  // Pop matching '('
            }
        }
        return stack.isEmpty(); // If empty, it is balanced
    }
}
