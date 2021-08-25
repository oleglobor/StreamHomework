import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public class Appl {
        public void main(String[] args) {
            Task task1 = new Task("DUNE", "2018-02-07", Type.DONE, Arrays.asList("Book"));
            Task task2 = new Task("Gameplay ", "2010-06-01", Type.DONE, Arrays.asList("Magazine"));
            Task task3 = new Task("METRO 2033", "2020-09-01", Type.NEW, Arrays.asList("Book"));
            Task task4 = new Task("The Witcher", "2017-05-02", Type.DONE, Arrays.asList("Book"));
            Task task5 = new Task("Why I so tired?", "2019-01-01", Type.DONE, Arrays.asList("Magazine"));
            Task task6 = new Task("No. You cant!", "2021-01-02", Type.NEW, Arrays.asList("Newspaper"));
            Task task7 = new Task("Playboy", "2018-04-09", Type.DONE, Arrays.asList("Magazine"));
            Task task8 = new Task("Vusokiy Zamok", "1999-06-02", Type.NEW, Arrays.asList("Newspaper"));
            Task task9 = new Task("My computer", "2008-04-02", Type.DONE, Arrays.asList("Magazine"));
            Task task10 = new Task("Please, I read too many books", "2016-04-02", Type.READING, Arrays.asList("Book"));
            Task task11 = new Task("The Lion, the Witch & the Wardrobe", "2019-04-09", Type.READING, Arrays.asList("Book"));
            Task task12 = new Task("Terror", "2020-12-07", Type.NEW, Arrays.asList("Magazine"));
            Task task13 = new Task("Reader's Digest", "2011-01-02", Type.READING, Arrays.asList("Magazine"));
            Task task14 = new Task("USA Today", "2016-08-01", Type.NEW, Arrays.asList("Newspaper"));
            Task task15 = new Task("Newsday", "2008-02-02", Type.READING, Arrays.asList("Newspaper"));
            Task task16 = new Task("Silmarion", "2012-06-08", Type.NEW, Arrays.asList("Book"));
            Task task17 = new Task("Dream of the Red Chamber", "2019-06-02", Type.DONE, Arrays.asList("Book"));
            Task task18 = new Task("The Little Prince", "2021-05-02", Type.NEW, Arrays.asList("Book"));
            Task task19 = new Task("Express Cool", "2005-01-01", Type.DONE, Arrays.asList("Magazine"));
            Task task20 = new Task("Patterns", "2021-05-02", Type.NEW, Arrays.asList("Book"));
            Task task21 = new Task("DUNE", "2018-02-07", Type.DONE, Arrays.asList("Book"));
            Task task22 = new Task("Gameplay ", "2010-06-01", Type.DONE, Arrays.asList("Magazine"));
            Task task23 = new Task("METRO 2033", "2020-09-01", Type.NEW, Arrays.asList("Book"));
            Task task24 = new Task("The Witcher", "2017-05-02", Type.DONE, Arrays.asList("Book"));
            Task task25 = new Task("Why I so tired?", "2019-01-01", Type.DONE, Arrays.asList("Magazine"));
            Task task26 = new Task("No. You cant!", "2021-01-02", Type.NEW, Arrays.asList("Newspaper"));
            Task task27 = new Task("Playboy", "2018-04-09", Type.DONE, Arrays.asList("Magazine"));
            Task task28 = new Task("Vusokiy Zamok", "1999-06-02", Type.NEW, Arrays.asList("Newspaper"));
            Task task29 = new Task("My computer", "2008-04-02", Type.DONE, Arrays.asList("Magazine"));
            Task task30 = new Task("Please, I read too many books", "2016-04-02", Type.READING, Arrays.asList("Book"));
            Task task31 = new Task("The Lion, the Witch & the Wardrobe", "2019-04-09", Type.READING, Arrays.asList("Book"));
            Task task32 = new Task("Terror", "2020-12-07", Type.NEW, Arrays.asList("Magazine"));
            Task task33 = new Task("Reader's Digest", "2011-01-02", Type.READING, Arrays.asList("Magazine"));
            Task task34 = new Task("USA Today", "2016-08-01", Type.NEW, Arrays.asList("Newspaper"));
            Task task35 = new Task("Newsday", "2008-02-02", Type.READING, Arrays.asList("Newspaper"));
            Task task36 = new Task("Silmarion", "2012-06-08", Type.NEW, Arrays.asList("Book"));
            Task task37 = new Task("Dream of the Red Chamber", "2019-06-02", Type.DONE, Arrays.asList("Book"));
            Task task38 = new Task("The Little Prince", "2021-05-02", Type.NEW, Arrays.asList("Book"));
            Task task39 = new Task("Express Cool", "2005-01-01", Type.DONE, Arrays.asList("Magazine"));
            Task task40 = new Task("Patterns", "2021-05-02", Type.NEW, Arrays.asList("Book"));

            List<Task> tasks = new ArrayList<>();
            tasks.add(task1);
            tasks.add(task2);
            tasks.add(task3);
            tasks.add(task4);
            tasks.add(task5);
            tasks.add(task6);
            tasks.add(task7);
            tasks.add(task8);
            tasks.add(task9);
            tasks.add(task10);
            tasks.add(task11); //
            tasks.add(task12);
            tasks.add(task13);
            tasks.add(task14);
            tasks.add(task15);
            tasks.add(task16);
            tasks.add(task17);
            tasks.add(task18);
            tasks.add(task19);
            tasks.add(task20);
            tasks.add(task21);
            tasks.add(task22);
            tasks.add(task23);
            tasks.add(task24);
            tasks.add(task25);
            tasks.add(task26);
            tasks.add(task27);
            tasks.add(task28);
            tasks.add(task29);
            tasks.add(task30);
            tasks.add(task31);
            tasks.add(task32);
            tasks.add(task33);
            tasks.add(task34);
            tasks.add(task35);
            tasks.add(task36);
            tasks.add(task37);
            tasks.add(task38);
            tasks.add(task39);
            tasks.add(task40);


            tasks.stream().filter(e -> e.getType() == Type.DONE).sorted().forEach(e -> System.out.println(e)); // task 3
            tasks.stream().map(Task::getTitle).distinct().forEach(e -> System.out.println(e)); //task 4
            tasks.stream().sorted().limit(10).forEach(e -> System.out.println(e)); // task 6
            System.out.println(tasks.stream().filter(e -> e.getType() == Type.DONE).count()); //task 7
            tasks.stream().map(Task::getTags).distinct().forEach(e -> System.out.println(e)); //task 8
            tasks.stream().filter(e -> e.getType() == Type.DONE).filter(e -> e.getTags().contains("Book")).forEach(e -> System.out.println(e)); //task 9


            try {
                long i = tasks.stream().filter(e -> e.getTitle().length() <= 2).count();
                if (i > 0) {
                    throw new MinTwoSymbolsException();
                } else {
                    System.out.println("There are no title with length less than 2 symbols");
                }
            } catch (MinTwoSymbolsException e) {
                e.printStackTrace();
            }

            try {
                long i = tasks.stream().filter(e -> e.getTitle().length() >= 72).count();
                if (i > 0) {
                    throw new MoreThanSeventyTwoSymbolsException();
                } else {
                    System.out.println("There are no title with length more than 72 symbols");
                }
            } catch (MoreThanSeventyTwoSymbolsException e) {
                e.printStackTrace();
            }

            try {
                long i = tasks.stream().filter(e -> e.getTitle().contains("$")
                        || e.getTitle().contains("*") || e.getTitle().contains("#")
                        || e.getTitle().contains("(")).count();
                if (i > 0) {
                    throw new InadmissibleSymbolsException();
                } else {
                    System.out.println("There are no title that contains such symbols: '#' '*' '$' '('");
                }
            } catch (InadmissibleSymbolsException e) {
                e.printStackTrace();
            }
        }
    }
}
