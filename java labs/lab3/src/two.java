import java.io.*;


public class two {


    public static void main(String[] args) {
        String fileName = "students.txt";
        int numStudents = 1;
        int numMarks = 5;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < numStudents; i++) {
                String name = "";
                String group = "";
                int[] marks = new int[numMarks];
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Введите ФИО студента №" + (i+1) + ":");
                name = reader.readLine();
                System.out.println("Введите группу студента №" + (i+1) + ":");
                group = reader.readLine();
                System.out.println("Введите оценки за экзаменационную сессию студента№" + (i+1) + ":");
                for (int j = 0; j< numMarks; j++) {
                    boolean validInput = false;
                    do {
                        System.out.println("Оценка №" + (j+1) + ":");
                        String input = reader.readLine();
                        try {
                            int mark = Integer.parseInt(input);
                            if (mark >= 1 && mark <= 10) {
                                marks[j] = mark;
                                validInput = true;
                            } else {
                                System.out.println("Оценка должна быть от 1 до 10");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Некорректный ввод, введите число от 1 до 10");
                        }
                    } while (!validInput);
                }
                writer.write(name + " " + group + " ");
                for (int mark : marks) {
                    writer.write(mark + " ");
                }
                writer.write(System.lineSeparator());
            }
            writer.close();
            System.out.println("Файл " + fileName + " был успешно создан");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
