package homework5;

public class HomeWork5 {
    public static void main(String[] args) {

        String quote = "I like Java!!!";
        getSomeString(quote);
        getLastCharacterOfString(quote);
        checkIfStringEndsWith(quote);
        checkIfStringStartsWith(quote);
        checkIfStringContainsSomeText(quote);
    }

    // Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    public static void getSomeString(String str) {
        System.out.println("Метод принял в качестве параметра строку: " + str);
    }

    // Распечатать последний символ строки. Используем метод String.charAt().
    public static void getLastCharacterOfString(String str) {
        int lastIndex = str.length();
        System.out.println("Последний символ строки - это “" + str.charAt(lastIndex - 1) + "“");
    }
// Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().

    public static void checkIfStringEndsWith(String str) {
        System.out.println("Заканчивается ли моя строка подстрокой “!!!“? - " + str.endsWith("!!!"));
    }

    // Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().

    public static void checkIfStringStartsWith(String str) {
        System.out.println("Начинается ли моя строка подстрокой “I like”? - " + str.startsWith("I like"));
    }

// Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().

    public static void checkIfStringContainsSomeText(String str) {
        System.out.println("Содержит ли моя строка подстроку “Java”? - " + str.contains("Java"));
    }
// Найти позицию подстроки “Java” в строке “I like Java!!!”.


}
