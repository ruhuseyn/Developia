public class sual3 {

    public static void foo3(){
        int[] array = new int[1000];
        int min = 1;
        int max = 100;


        for (int k = 1; k<array.length; k++){
            array[k] = (int) (Math.random()*(max-min+1)+min);
        }

        for(int i = 0; i<array.length; i++){
            int count = 1;
            for(int j=i+1;j<array.length; j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            System.out.println("element: "+array[i]+" element sayi: "+count);
        }
    }
}
