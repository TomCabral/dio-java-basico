public class User extends Tv {

    public static void main(String[] args) {
        Tv tv = new Tv();
        
        System.out.println(tv.power);
        System.out.println("Current Chanel: " + tv.chanel);
        System.out.println("Volume: " + tv.volume);

        tv.defineChanel(36);
    }
   
}