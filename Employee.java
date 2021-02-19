public class Employee extends aClass implements IFamily,IFriend{
    @Override
    public void pay() {
        System.out.println("Maaşı Ödendi.");
    }

    @Override
    public void live() {
        System.out.println("Ailede Yaşıyor.");
    }

    @Override
    public void hangUp() {
        System.out.println("Arkadaşlarıyla Geziyor.");
    }
}
