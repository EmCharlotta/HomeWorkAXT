package hw250420.task;

import java.util.*;

public class MapTask {
    private static List<String> getPeopleByCity(HashMap<String, String> map, String city) {
        List<String> logins = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(city)) {
                logins.add(entry.getKey());
            }
        }
        return logins;
    }

    public static Map<String, Integer> repeatMonths(List<String> months) {
        HashMap<String, Integer> monthMap = new HashMap<>();
        int sum = 1;
        for (int j = 0; j < months.size(); j++) {
            sum = 0;
            for (int i = 0; i < months.size(); i++) {
                if (months.get(j).equals(months.get(i))) {
                    sum++;
                }
            }
            monthMap.put(months.get(j), sum);
        }
        return monthMap;
    }

    public static Map<String, Customer> customerAge(HashMap<String, Customer> map, int from, int to) {
        HashMap<String, Customer> customerMap = new HashMap<>();
        for (Customer c : map.values()) {
            if ((c.getAge() >= from) && (c.getAge() < to)) {
                customerMap.put(c.getUuid(), c);
            }
        }
        System.out.println(customerMap);
        return customerMap;
    }

    public static void timesInText(String string, String[] strings) {
        int i = 0;
        for (String s : strings) {
            if (string.equals(s)) {
                i++;
            }
        }
        System.out.println(i);
    }

    public static void letters(String[] strings){
        HashMap<Letters, Integer> map = new HashMap<>();
        for(String s: strings){
            Letters letter = new Letters(s.length(), s);
            map.put(letter, s.length());
        }
        for (int i =1; i<20; i++){
            for (String s: strings){
               
                }
            }
        }
    }
    public static void main(String[] args) {
        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";

        System.out.println(getPeopleByCity(firstTaskMap, city));

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        System.out.println(repeatMonths(words));

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));
        System.out.println(customerMap);
        System.out.println(customerMap.get("1").getAge());
        customerAge(customerMap, 16, 49);
        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод:
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного
        //  слова в тексте
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...],
        //  в другую 2 - [on, up, no, of...]
        //  3. написать метод, который выводит в консоль топ 10 самых частых слов
        //  4. Вывести частоту встречаемости букв анг алфавита в данном тексте.
        //  Вывести в процентах для каждой буквы

        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like"; // !!! в тексте содержатся только буквы и пробельные символы !!!

        String[] strings = text.split("\\s");
        System.out.println(Arrays.toString(strings));
        timesInText("uncover",strings);
        letters(strings);
    }

}
