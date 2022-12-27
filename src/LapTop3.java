public class LapTop3 {
    int age = 0;
    int ram = 16;
    int ssd = 256;


    public static void main(String[] args) {
        LapTop3 hp = new LapTop3();
        LapTop3 hp1 = new LapTop3();

        double hpAge = hp.getAge(hp);
        System.out.println(hpAge);
        System.out.println(hp.calculateIndex(hp.ram, hp.ssd));

        System.out.println("index hp1 before upgrade:" + hp1.calculateIndex(hp1.ram, hp1.ssd));
        int newRam = 16;
        System.out.println("adding new RAM:" + newRam);
        int allRam = hp1.uppgradeRam (newRam);
        System.out.println("all hp1 RAM:" + allRam);
        System.out.println("index hp1 after upgrade:" + hp1.calculateIndex(hp1.ram, hp1.ssd));
    }
    double getAge (LapTop3 lapTop3) {
        return lapTop3.age;
    }

    int calculateIndex(int ram, int ssd) {
        int ramIndex = ram * 10;
        int index = ramIndex + ssd;
        return index;
    }
    int uppgradeRam(int ram) {
        int allRam = this.ram + ram;
        this.ram = allRam;
        return  allRam;
    }

}
