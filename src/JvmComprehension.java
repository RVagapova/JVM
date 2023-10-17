public class JvmComprehension {

    public static void main(String[] args) { ///Bootstrap ClassLoader подгружает класс String из JDK в метаспейс. Создается фрейм main в стеке
        int i = 1;                      // 1 //во фрейме main создается переменная i со значением 1
        Object o = new Object();        // 2 //Bootstrap ClassLoader подгружает класс Object из JDK в метаспейс. Создается объект класса Object в куче, а в стек в переменную o записывается ссылка на объект в куче
        Integer ii = 2;                 // 3 //Bootstrap ClassLoader подгружает класс Integer из JDK в метаспейс. Создается объект класса Integer в куче, в стек помещаем переменную ii со ссылкой на объект, а также присваиваем значение 2
        printAll(o, i, ii);             // 4 //создается новый фрейм printAll в стеке , куда передаются ссылки на o, i и ii
        System.out.println("finished"); // 7 //создается новый фрейм в стеке, куда передается готовая строка "finished"
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 //создается ссылка uselessVar в стеке (во фрейме printAll) на объект Integer в куче и присваеивается значение 700
        System.out.println(o.toString() + i + ii);  // 6 //создается новый фрейм в стеке, куда передаются ссылки на o, i и ii. По ссылке на объект ксласса Object вызывается метод toString()
    }
}