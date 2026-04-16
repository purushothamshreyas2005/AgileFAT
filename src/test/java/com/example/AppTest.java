public class AppTest {
    public static void main(String[] args) {
        testCalculateFine();
    }

    public static void testCalculateFine() {
        double fine1 = App.calculateFine(7);
        assert fine1 == 0.0 : "Test Case 1 Failed: Expected Rs. 0 fine for 7 days.";

        double fine2 = App.calculateFine(10);
        double expectedFine2 = (10 - 7) * 2.00; 
        assert fine2 == expectedFine2 : "Test Case 2 Failed: Expected correct late fine calculation.";
    }
}
