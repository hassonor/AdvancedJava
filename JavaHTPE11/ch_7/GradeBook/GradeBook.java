package JavaHTPE11.ch_7.GradeBook;

public class GradeBook {
    private String courseName;
    private int[][] grades;

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void processGrades() {
        outputGrades();
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());
        outputBarChart();
    }

    public int getMinimum() {
        int lowGrade = grades[0][0];

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }

        return lowGrade;
    }


    public int getMaximum() {
        int highGrade = grades[0][0];

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade > highGrade) {
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }

    public double getAverage(int[] setOfGrades) {
        int total = 0;

        for (int grade : setOfGrades) {
            total += grade;
        }

        return (double) total / setOfGrades.length;
    }

    public void outputBarChart() {
        System.out.println("Overall grade distribution:");

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        // for each grade in GradeBook, increment the appropriate frequency
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                ++frequency[grade / 10];
            }
        }

        // for each grade frequency, print bar in chart
        for (int count = 0; count < frequency.length; count++) {
            // output bar label ("00-09: ", ..., "90-99: ", "100: ")
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ",
                        count * 10, count * 10 + 9);
            }

            // print bar of asterisks
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("            "); // align column heads

        // create a column heading for each of the tests
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d  ", test + 1);
        }

        System.out.println("Average"); // student average column heading

        // create rows/columns of text representing array grades
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student]) { // output student's grades
                System.out.printf("%8d", test);
            }

            // call method getAverage to calculate student's average grade;
            // pass row of grades as the argument to getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
