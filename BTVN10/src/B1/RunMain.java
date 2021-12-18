package B1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Person> person=new ArrayList<>();
        int n=0;
        try {
            System.out.println("enter n: ");
            n=sc.nextInt();
        }
        catch (Exception ex)
        {
            System.out.println("du lieu sai : "+ ex.getMessage());
        }


        for(int i=1;i<=n;i++) {
            Person A = new Person();
            System.out.println("nhap thong tin nguoi tu " + i);
            A.Nhap();
            person.add(A);
        }

        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId()-o2.getId();
            }
        });
        System.out.println("danh sach xap xep theo id");
        for (Person A: person) {
            System.out.println(A.toString());
            
        }
        System.out.println("danh sach xap xep theo ten");
        Collections.sort(person);
        for (Person A: person) {
            System.out.println(A.toString());

        }

    }
}
