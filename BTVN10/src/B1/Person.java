package B1;

import java.util.Scanner;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private String address;
    public Person(){};
    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("enter id: ");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("enter Name: ");
            name=sc.nextLine();
            System.out.println("enter address: ");
            address=sc.nextLine();
        }
        catch (Exception ex)
        {
            System.out.println("du lieu sai");
        }

    }
    @Override
    public int compareTo(Person o) {
        if(getName().compareTo(o.getName())==0){
            return getAddress().compareTo(o.getAddress());}
        return getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
