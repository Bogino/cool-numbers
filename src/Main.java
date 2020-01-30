import java.util.*;
import java.util.regex.Pattern;

public class Main {

    private static String REGEX_NUMBER = "[А-Я]{1}+\\d{3}[А-Я]{2}+\\d{0,3}";
    private static ArrayList<String> list = new ArrayList<>();
    private static TreeSet<String> treeSet = new TreeSet<>();
    private static  HashSet<String> hashSet = new HashSet<>();
    private static String words = "СМТВАРОНЕУ";
    private static boolean isFind;



    public static void main(String[] args) {

        //Номера с одинаковыми цифрами и буквами

        for (int currentWord = 0; currentWord <= 9; currentWord++)
        {
            for (int currentNumber = 0; currentNumber <= 9; currentNumber++) {
                for (int index = 1; index <= 197; index++) {

                    //System.out.printf(words.charAt(currentWord) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + "%2$02d%n",words.charAt(currentWord) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord),index);

                    if (index < 10)
                    {
                        //System.out.println(words.charAt(currentWord) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(0) + Integer.toString(index));
                        list.add(words.charAt(currentWord) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(0) + Integer.toString(index));
                    }
                    else
                        {
                            //System.out.println(words.charAt(currentWord) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(index));
                            list.add(words.charAt(currentWord) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(index));

                        }
                }
            }
        }

        //Номера с одинаковыми буквами и разными цифрами
        for (int currentWord = 0; currentWord <= 9; currentWord++)
        {
            for (int currentNumber = 0; currentNumber <= 999; currentNumber++) {
                for (int index = 1; index <= 197; index++)
                {
                    if (currentNumber < 100)
                    {
                        if (currentNumber < 10)
                        {
                            if (index < 10)
                            {
                                //System.out.println(words.charAt(currentWord) + Integer.toString(0) + Integer.toString(0) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(index));
                                list.add(words.charAt(currentWord) + Integer.toString(0) + Integer.toString(0) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(index));
                            }
                            else
                                {
                                    //System.out.println(words.charAt(currentWord) + Integer.toString(0) + Integer.toString(0) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(index));
                                    list.add(words.charAt(currentWord) + Integer.toString(0) + Integer.toString(0) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(index));
                                }

                        }
                        else
                            {
                                if (index < 10)
                                {
                                    //System.out.println(words.charAt(currentWord) + Integer.toString(0)  + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(0) + Integer.toString(index));
                                    list.add(words.charAt(currentWord) + Integer.toString(0)  + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(0) + Integer.toString(index));
                                }
                                else
                                    {
                                        //System.out.println(words.charAt(currentWord) + Integer.toString(0)  + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(index));
                                        list.add(words.charAt(currentWord) + Integer.toString(0)  + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(index));
                                    }
                            }
                    }
                    else
                    {
                        if (index < 10)
                        {
                            //System.out.println(words.charAt(currentWord) +  Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(0) + Integer.toString(index));
                            list.add(words.charAt(currentWord) +  Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(0) + Integer.toString(index));
                        }
                        else
                        {
                            //System.out.println(words.charAt(currentWord)   + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(index));
                            list.add(words.charAt(currentWord)   + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + Integer.toString(index));
                        }
                    }
                }
            }
        }

        //Номера с разными буквами и одинаковыми цифрами
        for (int currentWord = 0; currentWord <= 9; currentWord++)
        {
            for (int currentNumber = 0; currentNumber <= 9; currentNumber++) {
                for (int index = 1; index <= 197; index++) {



                    //System.out.printf(words.charAt(currentWord) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + "%2$02d%n",words.charAt(currentWord) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord),index);

                    if (index < 10)
                    {
                        //System.out.println(words.charAt((int) (Math.random() * 9)) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt((int) (Math.random() * 9)) + words.charAt((int) (Math.random() * 9)) + Integer.toString(0) + Integer.toString(index));
                        list.add(words.charAt((int) (Math.random() * 9)) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt((int) (Math.random() * 9)) + words.charAt((int) (Math.random() * 9)) + Integer.toString(0) + Integer.toString(index));
                    }
                    else
                    {
                        //System.out.println(words.charAt((int) (Math.random() * 9)) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt((int) (Math.random() * 9)) + words.charAt((int) (Math.random() * 9)) + Integer.toString(index));
                        list.add(words.charAt((int) (Math.random() * 9)) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt((int) (Math.random() * 9)) + words.charAt((int) (Math.random() * 9)) + Integer.toString(index));

                    }
                }
            }
        }

        //Номера с одинаковыми цифрами и разными буквами
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String suffix, xNNNyz;

        for (int index = 1; index <= 197; index++)
        {
            for (int count = 0; count < 10; count++)
            {
               for (String letter1 : letters)
               {
                   for (String letter2 : letters)
                   {
                       for (String letters3 : letters)
                       {
                       if (index < 10)
                       {
                           suffix = letter2 + letters3 + Integer.toString(0) + index;
                           xNNNyz = letter1 + count + count + count + suffix;
                       }
                       else
                       {
                           suffix = letter2 + letters3 + index;
                           xNNNyz = letter1 + count + count + count + suffix;
                       }

                       //System.out.println(xNNNyz);
                       list.add(xNNNyz);
                       }
                   }

               }
            }

        }

            //System.out.printf(words.charAt(currentWord) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord) + "%2$02d%n",words.charAt(currentWord) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + Integer.toString(currentNumber) + words.charAt(currentWord) + words.charAt(currentWord),index);






        System.out.println("Всего найдено блатных номеров: " + list.size());

        for (;;) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Введите номер");

            String number = sc.nextLine();

            if (Pattern.matches(REGEX_NUMBER, number))
            {
                arrayList(list, number);
                collection(list, number);
                treeSet(list, number);
                hashSet(list, number);
            }
            else {
                System.out.println("Error");
                continue;
            }
        }

    }

    private static void arrayList(ArrayList<String> al, String number)
    {
        System.out.println("====================================================");
        System.out.println("Способ 1 через ArrayList");
        long start = System.nanoTime();
        isFind = al.contains(number);
        long duration = System.nanoTime() - start;
        if (isFind)
        {
            System.out.println("Поиск в ArrayList: номер " + number + " найден, поиск занял " + duration + " нс");
        }
        else {
            System.out.println("Номера " + number + " нет :(" + "\nПоиск занял " + duration + " нс");
        }
    }
    private static void collection(ArrayList<String> al, String number)
    {
        System.out.println("====================================================");
        System.out.println("Способ 2 через collection");
        Collections.sort(al);
        long start = System.nanoTime();
        int index = Collections.binarySearch(al, number);
        long duration = System.nanoTime() - start;
        if (index >= 0)
        {
            System.out.println("Поиск в collection: номер " + number + " найден, поиск занял " + duration + " нс");
        }
        else {
            System.out.println("Номера " + number + " нет :(" + "\nПоиск занял " + duration + " нс");
        }

    }
    private static void treeSet (ArrayList<String> al, String number)
    {
        System.out.println("====================================================");
        System.out.println("Способ 3 через treeSet");
        treeSet.addAll(al);
        long start = System.nanoTime();
        isFind = treeSet.contains(number);
        long duration = System.nanoTime() - start;
        if (isFind)
        {
            System.out.println("Поиск в treeSet: номер " + number + " найден, поиск занял " + duration + " нс");
        }
        else {
            System.out.println("Номера " + number + " нет :(" + "\nПоиск занял " + duration + " нс");
        }
    }
    private static void hashSet (ArrayList<String> al, String number)
    {
        System.out.println("====================================================");
        System.out.println("Способ 4 через hashSet");
        hashSet.addAll(al);
        long start = System.nanoTime();
        isFind = hashSet.contains(number);
        long duration = System.nanoTime() - start;
        if (isFind)
        {
            System.out.println("Поиск в hashSet: номер " + number + " найден, поиск занял " + duration + " нс");
        }
        else {
            System.out.println("Номера " + number + " нет :(" + "\nПоиск занял " + duration + " нс");
        }
    }
}
