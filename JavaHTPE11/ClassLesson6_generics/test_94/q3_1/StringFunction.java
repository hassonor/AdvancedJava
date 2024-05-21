package JavaHTPE11.ClassLesson6_generics.test_94.q3_1;

public class StringFunction implements Function<String, Integer> {

    @Override
    public Integer transform(String arg) {
        try {
            return Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            return null;
        }
    }


}
