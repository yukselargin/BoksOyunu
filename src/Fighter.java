public class Fighter {
    String name;
    int weight;
    int health;
    int damage;
    double dodge;

    Fighter(String name, int weight, int health, int damage, double dodge){
        this.name = name;
        this.weight = weight;
        this.health = health;
        this.damage = damage;
        this.dodge = dodge;
    }
    int hit(Fighter foe){
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");
        if(dodge()){
            System.out.println( foe.name + " hasardan kaçındı");
            return foe.health;
        }else{
            if( foe.health-this.damage<0 )
                return 0;

            return foe.health-this.damage;
        }

    }
    boolean dodge(){
        double randomValue = Math.random()*100;
        return randomValue <= this.dodge;
    }
}
