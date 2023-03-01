package pruebaoperadores;

public class pruebaoperadores {

        int x;
            int y = 2;
            double z = 3.0;
            public void calculos() {
                
                x = 5;
        System.out.println("x + y + z = " + (x + y + z));
        x += y;
        y++;
        z--;
        z *= x;
        System.out.println("x + y + z = " + (x + y + z));
        
        }
    public static void main(String[] args) {
       pruebaoperadores nuevaprueba = new pruebaoperadores();
       nuevaprueba.calculos();}

}