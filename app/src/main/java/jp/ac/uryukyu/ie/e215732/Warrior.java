package jp.ac.uryukyu.ie.e215732;

public class Warrior extends LivingThing {
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    
    
    public void attackWithWeponSkill(LivingThing opponent){
        int damage = (int)(1 *  attack * 150 / 100); // 固定ダメージにはかるため、ランダムではなく1と置いた。

        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage); 
}
    

}
