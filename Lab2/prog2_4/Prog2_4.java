package Lab2.prog2_4;

public class Prog2_4 {
    public static void main(String[] args) {
        String myString = Data.records;

        String[] records = myString.split(":");

        for (String record : records) {
            String[] fields = record.split(",");

            if (fields.length > 0) {
                System.out.println(fields[0]);
            }
        }
    }
}
