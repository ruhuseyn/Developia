public class sual2 {

    public static void foo2(){
        String cumle1 = "    Salam men bugun.gelmeyecem ";
        int say = 1;

        String cumle = cumle1.trim();

        for (int i = 0; i<cumle.length(); i++){
            if (((cumle.charAt(i) == ' ')||(cumle.charAt(i) == '.')||(cumle.charAt(i) == ',')) && (cumle.charAt(i + 1) != ' '))
            {
                say++;
            }
        }
        System.out.println(say);
    }
}
