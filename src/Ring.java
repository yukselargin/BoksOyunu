
public class Ring {
    Fighter f1;
    Fighter f2;

    Fighter fx;
    int maxweight;
    int minweight;
    Ring(Fighter f1, Fighter f2, int maxweight, int minweigt){
        this.f1 = f1;
        this.f2 = f2;
        this.maxweight = maxweight;
        this.minweight = minweigt;
    }
    void run(){
        if( isCheck()){
            double randomAttack = Math.random()*100;
            while(f1.health>0 && f2.health>0){
                System.out.println("======== YENİ ROUND ===========");
                if(randomAttack<=50) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }else{
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }

                }
                printScore();
            }
        }else{
            System.out.println("Sporcuların ağırlıkları uyuşmuyor");
        }

    }
    boolean isCheck() {
        return (f1.weight >= this.minweight && f1.weight <= this.maxweight && f2.weight >= this.minweight && f2.weight <= this.maxweight);
    }
     boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }
        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }

}
