public class Test {
    public static void main(String[] args) {

        String name = "Rahul";
        int age = 22;
        double score = 88.6;
        String course = "Computer Science";

        System.out.printf("===== STUDENT DETAILS =====%n");
        System.out.printf("Name          : %s%n", name);
        System.out.printf("Age           : %d years%n", age);
        System.out.printf("Course        : %s%n", course);
        System.out.printf("Percentage    : %.1f%%%n", score);

        System.out.printf("---------------------------%n");
        System.out.printf("%s is %d years old.%n", name, age);
        System.out.printf("Studying %s with %.2f marks.%n", course, score);

        System.out.printf("===== END OF REPORT =====%n");
    }
}
