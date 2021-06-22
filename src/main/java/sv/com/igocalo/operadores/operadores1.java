package sv.com.igocalo.operadores;


public class operadores1 {
    
     public static void main(String [] args) {
        //byte, short, int, long tios de datosenteros
        byte byteVar = 15;
        System.out.println("bytevar = " + byteVar);
            System.out.println("bits en el tipo bytes:" + Byte.SIZE);
            System.out.println("bits en el tipo bytes:" + Byte.BYTES);
            System.out.println("bits en el tipo bytes:" + Byte.MIN_VALUE);
            System.out.println("bits en el tipo bytes:" + Byte.MAX_VALUE);
            
            short shortVar = 1000;
            System.out.println("short var = " + shortVar);
            System.out.println("Bits en el tipo short:" + Short.SIZE);
            System.out.println("Bits en el tipo short:" + Short.BYTES);
            System.out.println("Bits en el tipo short:" + Short.MIN_VALUE);
            System.out.println("Bits en el tipo short:" + Short.MAX_VALUE);
}
}