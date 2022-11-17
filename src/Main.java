public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali",115,145, 30,25.0 );
        Fighter f2 = new Fighter("Micheal Tyson", 125, 145,30,50.0);
        Ring r1 = new Ring(f1 , f2, 130,115 );
        r1.run();
    }
}