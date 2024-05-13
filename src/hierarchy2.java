class Child1 extends Parent implements Printable {
    String name;
    int age;

    public Child1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Child1: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
