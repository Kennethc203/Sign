public class Main {
    public static void main(String[] args){
        System.out.println("end this existence pls");
        Sign signalling = new Sign("Everything on sale, please come in", 17);
        System.out.println(signalling.getLines());
        System.out.println(signalling.numberOfLines());
        System.out.println();

        //Test cases...
        Sign signa = new Sign("ABC222DE", 3);
        System.out.println(signa.numberOfLines());
        System.out.println(signa.getLines());
        System.out.println(signa.getLines());
        System.out.println();

        signa = new Sign("ABCD", 10);
        System.out.println(signa.numberOfLines());
        System.out.println(signa.getLines());
        System.out.println();

        signa = new Sign("ABCDEF", 6);
        System.out.println(signa.numberOfLines());
        System.out.println(signa.getLines());
        System.out.println();

        signa = new Sign("", 4);
        System.out.println(signa.numberOfLines());
        System.out.println(signa.getLines());
        System.out.println();

        signa = new Sign("AB_CD_EF", 2);
        System.out.println(signa.numberOfLines());
        System.out.println(signa.getLines());
    }
}
