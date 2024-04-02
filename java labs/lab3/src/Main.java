import java.io.*;


public class Main {


    public static void main(String[] args) {
        String fileName = "file.txt";
        int linesToRemove = 3;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String[] lines = reader.lines().toArray(String[]::new);
            reader.close();
            if (lines.length <= linesToRemove) {
                System.out.println("Файл содержит меньше или равно трех строк, удаление невозможно");
            } else {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                for (int i = 0; i < lines.length - linesToRemove; i++) {
                    writer.write(lines[i] + System.lineSeparator());
                }
                writer.close();
                System.out.println("Последние три строки были удалены изфайла " + fileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
