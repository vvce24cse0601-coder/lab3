public class Test {
    public static void main(String[] args) {

        String name = "Yash";
        int age = 21;
        double score = 95.8;

        System.out.printf("Welcome to Java Programming!%n");
        System.out.printf("Student Name: %s%n", name);
        System.out.printf("Student Age: %d years%n", age);
        System.out.printf("Exam Marks: %.1f%n", score);

        System.out.printf("Student Summary: %s is %d years old and secured %.2f marks.%n",
                          name, age, score);
    }
}
