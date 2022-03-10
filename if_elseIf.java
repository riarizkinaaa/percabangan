public class if_elseIf {
    public static void main(String[] args) {
        // if else if mempunyai kondisi lebih dari satu
        /*
         * if(ekspresi){
         * aksi(statement)
         * }else if(kondisi){
         * aksi(statement)
         * }else(
         * 
         * )
         * 
         * 
         */
        int a = 30;
        int b = 20;
        if (a == b) {
            System.out.println("anda benar sekali");
        } else if (a <= b) {
            System.out.println("anda benar");
        } else {
            System.out.println("salah(mikir dulu dong!)");
        }
    }

}
