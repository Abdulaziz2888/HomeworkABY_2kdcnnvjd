class Child2 extends Parent implements Printable {
    String address;

    public Child2(String address) {
        this.address = address;
    }

    @Override
    public void print() {
        System.out.println("Адрес: ");
        System.out.println("Address: " + address);
    }
}
