public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());

        Cylinder cylinder1 = new Cylinder(1.5);

        System.out.println(cylinder1.getArea());
        System.out.println(cylinder1.getHeight());
        System.out.println(cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(5, 2);

        System.out.println(cylinder2.getArea());
        System.out.println(cylinder2.getHeight());
        System.out.println(cylinder2.getVolume());



    }
}
