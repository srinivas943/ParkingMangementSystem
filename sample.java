public class CodeAnalysisTest {

    public static void main(String[] args) {
        // Simulate a buggy method
        int result = buggyMethod(10, 0);

        // Simulate analysis and testing
        if (analyzeCode(10, 0)) {
            System.out.println("Analysis suggests an issue. Running test...");
            runTest(10, 0);
        } else {
            System.out.println("Analysis did not find an issue.");
        }

        //Simulate another test case
        result = buggyMethod(5, 2);
        if (analyzeCode(5, 2)) {
            System.out.println("Analysis suggests an issue. Running test...");
            runTest(5, 2);
        } else {
            System.out.println("Analysis did not find an issue.");
        }

    }

    // A method with a potential bug (division by zero)
    public static int buggyMethod(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
            return -1; // Indicate an error
        }

    }

    // Simulate code analysis (simplified)
    public static boolean analyzeCode(int a, int b) {
        // In a real scenario, this would involve more complex logic
        // For this example, we simply check if 'b' is zero.
        if (b == 0) {
            return true; // Potential division by zero
        }
        return false;
    }

    // Simulate running a test
    public static void runTest(int a, int b) {
        int result = buggyMethod(a, b);
        if (result == -1) {
            System.out.println("Test failed: Division by zero occurred.");
        } else {
            System.out.println("Test passed: Result = " + result);
        }
    }
}
