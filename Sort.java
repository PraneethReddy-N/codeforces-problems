public class Sort{
    public static void main(String[] args){
        int [] array = {74,44,22,9,1};
        int [] y = {100,21,22,90,1};
        int temp = 0;
        for(int i = 0;i<array.length;i++){
            for(int j = i+1;j<array.length;j++){
                 if(array[j] < array[i]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;

                    int tempb = y[j];
                    y[j] = y[i];
                    y[i] = tempb;
                 }
            }
            System.out.println(array[i] +" array");
            System.out.println(y[i] + " Y");
        }   
    }
}