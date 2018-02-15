


   import static java.lang.System.out;
    public class CalculatorMethod {
        public static int add(int a, int b) {
            int answer = (int) a + (int) b;
            return a + b;
        }

        public static int subtract(int a, int b) {
            int answer = (int) a - (int) b;
            return a - b;
        }

        public static int multiply(int a, int b)

        {
            int answer = (int) a * (int) b;
            return a * b;
        }
        public static int divide(int a, int b)
            {
                int answer = (int) a / (int) b;
                return a / b;
            }


        public static void main(String[] args) {

// gets saved in the variable x.
            int x = add(5, 7);

            System.out.println("5 plus 7 equals " + x);
// Now we do the same kind of call, but in a single line,
// without needing 'x' as a temporary variable in between.
            System.out.println("3 plus 5 equals " + add(3, 5));
            System.out.println("1 plus 2 equals " + add(1, 2));

// The subtraction results are wrong
// because the subtract() method is incomplete. Fix it!
            System.out.println("9 minus 4 equals " + subtract(9, 4));
            System.out.println("9 minus 3 equals " + subtract(9, 3));

// because the multiply() method is incomplete. Fix it!
            System.out.println("3 times 3 equals " + multiply(3, 3));
            System.out.println("2 times 4 equals " + multiply(2, 4));
// Now it's your turn! Create a divide() method and write some
// print statements to test that it works right.
            System.out.println("6 divide 3 equals " + divide(6, 3));
            System.out.println("10 divide 2 equals " + divide(10, 2));
        }
    }