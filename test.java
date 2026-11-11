public class Test {
    public static void main(String[] args) {

        String name = "Rahul";
        int age = 21;
        double score = 95.75;

        System.out.printf("Welcome to Java Programming!%n");
        System.out.printf("Student Name: %s%n", name);
        System.out.printf("Student Age: %d years%n", age);
        System.out.printf("Exam Score: %.1f%n", score);

        System.out.printf(
            "Student Details: %s is %d years old and obtained %.2f marks.%n",
            name, age, score
        );
    }
}
