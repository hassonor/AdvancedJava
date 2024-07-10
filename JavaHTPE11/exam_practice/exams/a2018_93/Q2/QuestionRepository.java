package JavaHTPE11.exam_practice.exams.a2018_93.Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionRepository {
    private List<Question> questions;
    private Random random;

    public QuestionRepository() {
        questions = new ArrayList<>();
        random = new Random();

        questions.add(new Question("Apple", new String[]{"תפוח", "בננה", "תפוז", "ענב"}, "תפוח"));
        questions.add(new Question("Car", new String[]{"רכב", "אופניים", "מטוס", "סירה"}, "רכב"));
        questions.add(new Question("House", new String[]{"בית", "דירה", "חדר", "ביתן"}, "בית"));
        questions.add(new Question("Book", new String[]{"ספר", "מחברת", "עיתון", "מגזין"}, "ספר"));
        questions.add(new Question("Water", new String[]{"מים", "יין", "בירה", "קפה"}, "מים"));
    }

    public Question getQuestion() {
        int index = random.nextInt(questions.size());
        return questions.get(index);
    }
}
