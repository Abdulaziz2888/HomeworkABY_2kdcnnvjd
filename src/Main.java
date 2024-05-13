public class Main {
    public static Parent createObject(String className) {
        switch (className) {
            case "2й":
                return new Child1("abu", 15);
            case "3й":
                return new Child2("Ростовская 55");
            case "4й":
                return new Child3("Программист");
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Parent obj1 = createObject("2й");
        Parent obj2 = createObject("3й");
        Parent obj3 = createObject("4й");

        Parent[] objects = {obj1, obj2, obj3};

        for (Parent obj : objects) {
            if (obj instanceof Printable) {
                ((Printable) obj).print();
            }
        }
    }
}
