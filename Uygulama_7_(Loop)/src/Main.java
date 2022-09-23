
public class Main {
    public static void main(String[] args) {
        
        //FOR
        //1 ile 10 arasındaki sayıları teker teker yazdırma...
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        
        System.out.println("Döngü Bitti...");
        
        System.out.println("**************************");
        System.out.println("**************************");
   
        //2 ile 10 arasındaki çift sayıları yazma...
        for(int i = 2; i <= 10; i+=2){ 
            System.out.println(i);
        }
        
        System.out.println("For Döngüsü Bitti...");
        
        System.out.println("**************************");
        System.out.println("**************************");
        
        int i = 1;
        //WHILE
        while(i < 10){
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Bitti...");
        
        
        System.out.println("**************************");
        System.out.println("**************************");

        //DO - WHILE
        int j = 1;
        do{
             System.out.println(j);
            j++;
        }while(j < 10);
        
        System.out.println("Do-While Döngüsü Bitti...");

    }
}
