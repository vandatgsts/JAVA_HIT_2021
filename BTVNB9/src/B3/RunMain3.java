package B3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<News> arrayNews = new ArrayList();

        while (true) {
            System.out.println("1. Insert News");
            System.out.println("2. View list News");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            int select;
            select = sc.nextInt();
            switch (select) {
                case 1: {
                    Select1(arrayNews);
                }
                break;
                case 2: {
                    Select2(arrayNews);
                    break;
                }
                case 3:
                    Select3((arrayNews));
                    break;
                case 4:
                    System.exit(0);
            }
        }

    }

    public static void Select1(ArrayList<News> x) {
        News news = new News();
       sc.nextLine();
        System.out.println("Enter Title: ");
        news.setTitle(sc.nextLine());
        System.out.println("Enter pushlishDate: ");
        news.setPublishDate(sc.nextLine());
        System.out.println("Enter author: ");
        news.setAuthor(sc.nextLine());
        System.out.println("Enter content: ");
        news.setContent(sc.nextLine());
        System.out.println("Endter rate: ");
        news.InputRateList();
        x.add(news);
    }

    public static void Select2(ArrayList<News> x) {
        for (int i = 0; i < x.size(); i++)
            x.get(i).Dispay();
    }

    public static void Select3(ArrayList<News> x) {
        for (int i = 0; i < x.size(); i++) {
            x.get(i).Calculate();
            x.get(i).Dispay();
            System.out.println("******************************************");
        }
    }
}


