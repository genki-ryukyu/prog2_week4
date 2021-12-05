package jp.ac.uryukyu.ie.e215732;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    /**
     * コンストラクタ。名前。最大HP。攻撃力
     * @param name 名前
     * @param maximumHP　最大HP
     * @param attack 攻撃力
     */
    
    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead(){
        return this.dead;
    }

    public String getName(){
        return this.name;
    }

    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if (hitPoint < 0 ){
            dead = true;
            attack = 0;
            System.out.printf("%sは倒れた。\n", name);
    }
    
    }
}

