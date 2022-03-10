public class latihan_ifBersarang {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a == 20) {
            if (b == 20) {
                System.out.println("benar,, dimana a=10 dan b=20");
            } else {
                System.out.println("nilai a=10 tapi nilai b bukan 20");
            }
        }
        if (a == 30) {
            if (b == 20) {
                System.out.println("benar,,,di mana s=10 dan b=20");
            } else {
                System.out.println("nilai salah");
            }
        }
        if (a == 40) {
            if (b == 20) {
                System.out.println("benar,,,,di mana a=10 dan b=20");
            } else {
                System.out.println("nilai salah");
            }
        } else {
            System.out.println("salah semua");
        }
    }

}
