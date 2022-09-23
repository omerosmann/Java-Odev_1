
public class Main {
    public static void main(String[] args) {
        
        String mesaj = "Bugün hava çok güzel.";
        //System.out.println(mesaj);
        
        /*System.out.println("Eleman Sayısı : " + mesaj.length());  //İfadenin elaman sayısını belirtiyor.
        System.out.println("5. eleman : " + mesaj.charAt(4));  // Belirtilen indexteki ifadeyi yazdırıyor.
        System.out.println(mesaj.concat(" Yaşasın"));   //İfadenin sonuna ekliyor.
        System.out.println(mesaj.startsWith("A"));      //Başladığı harfi soruyor.
        System.out.println(mesaj.endsWith("."));        //Bittiği harfi soruyor.
        char[] karakterler = new char[5]; 
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);                  //Seçilen indexler arasını yazdırıyor.  
        System.out.println(mesaj.indexOf('a'));         //Baştan başlayarak ilk bulduğu a 'da durup index sayısını söylüyor.
        System.out.println(mesaj.lastIndexOf('a'));*/     //Sondan başlayarak ilk bulduğu a 'da durup index sayısını söylüyor.
        
        String yeniMesaj = mesaj.replace(" ", " - ");   //replace değiştirme görevi yapıyor.
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));         //Seçilen indexten itibaren yazdırıyor.
        System.out.println(mesaj.substring(2,5));       //Seçili olan index aralığını alıyor.
        
        for(String kelime : mesaj.split(" ")){       //Kelimeleri alt alta yazdırıyor.
            System.out.println(kelime);
        }
  
        System.out.println(mesaj.toLowerCase());  //Küçük harflerin hepsini büyük harf yapar.
        System.out.println(mesaj.trim());           //İfadenin başındaki ve sonundaki boşlukları alır.
    }
}
