package lesson.seventh;

import java.io.*;

public class AppData {

    private String[] header;
    private int[][] data;

    public AppData() {        // Пустой конструктор для возможности загрузки данных из файла
    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {            // Записываем заголовок
            for (int i = 0; i < header.length; i++) {
                writer.write(header[i]);
                if (i < header.length - 1) {
                    writer.write(";");
                }
            }
            writer.newLine();

            for (int[] row : data) {            // Записываем данные
                for (int i = 0; i < row.length; i++) {
                    writer.write(String.valueOf(row[i]));
                    if (i < row.length - 1) {
                        writer.write(";");
                    }
                }
                writer.newLine();
            }
        }
    }

    public void load(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String headerLine = reader.readLine();             // Читаем заголовок, обозначаем разделитель ";" заголовков
            if (headerLine != null) {
                header = headerLine.split(";");
            }

            int rowCount = 0;             // Подсчитываем количество строк данных (исключая заголовок тк он 0)
            String line;
            while ((line = reader.readLine()) != null) {
                rowCount++;
            }

            data = new int[rowCount][header.length];            // Инициализируем массив данных подсчитанной размерности

            try (BufferedReader newReader = new BufferedReader(new FileReader(filename))) {             // Закрываем и снова открываем файл, чтобы перейти к началу
                newReader.readLine();                // Пропускаем строку с заголовком чтобы дальше счиать данные

                int rowIdx = 0;                // Читаем данные указывая наш разделитель
                while ((line = newReader.readLine()) != null) {
                    String[] values = line.split(";");
                    for (int i = 0; i < values.length; i++) {
                        data[rowIdx][i] = Integer.parseInt(values[i]);
                    }
                    rowIdx++;
                }
            }
        }
    }


    public String[] getHeader() {           // Геттеры и сеттеры
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }
}
