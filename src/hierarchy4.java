class Child3 extends Parent implements Printable {
    String profession;

    public Child3(String profession) {
        this.profession = profession;
    }

    @Override
    public void print() {
        System.out.println("Профессия: ");
        System.out.println("Profession: " + profession);
    }
}
