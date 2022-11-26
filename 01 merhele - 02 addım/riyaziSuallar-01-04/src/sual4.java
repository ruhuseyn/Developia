public class sual4 {

    public static void foo4(){
        String sentence = "Bakida yasamaq yorucudur";

        char[] charArray = sentence.toCharArray();

        for(int i=0; i<charArray.length; i++){
            int count = 1;
            for(int j=i+1;j<charArray.length;j++){
                if(charArray[i] == charArray[j] && charArray[i]!=' '){
                    count++;
                    charArray[j] = '0';
                }
            }
            if(count>1 && charArray[i] !='0'){
                System.out.println(charArray[i] + "- elementin sayi: "+ count);
            }
        }
    }
}
