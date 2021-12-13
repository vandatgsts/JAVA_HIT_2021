package B1;

abstract class Person {
    private String name,address;
    public Person(String name, String address) {

        this.name = name;
        this.address = address;
    }

    protected Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    abstract void display();

}
