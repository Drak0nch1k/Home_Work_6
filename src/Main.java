public class Main {
    public static void main(String[] args) {
        Boss objectBoss = new Boss();
        objectBoss.setBoss("Alukard");
        objectBoss.setBossHp(1000);
        objectBoss.setBossDmg(250);
        System.out.println("Name: " + objectBoss.getBoss()
                + " \nHealth point: " + objectBoss.getBossHp()
                + " \nDamage: " + objectBoss.getBossDmg());

    }
}