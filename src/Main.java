import java.util.TreeMap;
/*
Практика 1: ДЗ на коллекции (обязательное)
Исходные данные: У вас есть код, который проводит расчет BMI.
На текущий момент он реализован через if-else. Это хороший краткий код, но плохо расширяемый.

Задание: Напишите код, который вместо if-else использовал бы подходящую коллекцию для хранения границ сообщений и самих текстовых сообщений.

Какую коллекцию вы выберете?

Обоснование: В этом случае, если бы потребовалось добавить новые граничные условия или подкорректировать существующие,
то не пришлось бы менять логические блоки кода, можно было бы просто подправить данные. Более того, эти данные можно было бы подкачивать из БД/файла/сети.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(bmiInterpretation(100));
    }

    static String bmiInterpretation(double bmi) {
        // Создаем список вывода, где ключ - это граница, а значение - соответствующее сообщение
        TreeMap<Double, String> bmiMessages = new TreeMap<>();
        bmiMessages.put(Double.MIN_VALUE, "Выраженный дефицит массы тела");
        bmiMessages.put(16.0, "Недостаточная (дефицит) масса тела");
        bmiMessages.put(18.5, "Норма");
        bmiMessages.put(25.0, "Избыточная масса тела (предожирение)");
        bmiMessages.put(30.0, "Ожирение");
        bmiMessages.put(35.0, "Ожирение резкое");
        bmiMessages.put(Double.MAX_VALUE, "Очень резкое ожирение");

        // возвращает сообщение, от введенных данных
        return bmiMessages.floorEntry(bmi).getValue();
    }
}
