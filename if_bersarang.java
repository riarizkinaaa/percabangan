public class if_bersarang {
    public static void main(String[] args) {
        // if bersarang
        /*
         * if(ekspresi){
         * if(ekspresi){
         * statement
         * }else{
         * statemen;
         * }
         * }else{
         * statement
         * }
         */
        // jika nilai b benar tapi nilai a salah maka menjadi else(nilai a salah),jika
        // awalnya salah maka salah semuanya
        int a = 4;
        int b = 30;
        if (a == 12) {
            if (b == 30) {
                System.out.println("anda benar di mana a=12 dan b=30");
            } else {
                System.out.println("a=12 dan b bukan 30");
            }
        } else {
            System.out.println("nilai a salah");
        }
    }

}
