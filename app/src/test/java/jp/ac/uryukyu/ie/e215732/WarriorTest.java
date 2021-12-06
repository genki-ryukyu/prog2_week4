package jp.ac.uryukyu.ie.e215732;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /**
     * 倒れたはずの敵は攻撃できないことを検証。
     * 検証手順
     *  (1) ヒーローと敵を準備。
     *  (2) ヒーローが殴り、敵も殴る。ヒーローの攻撃力が1.5倍の火力になっていることを確認する
     */
    @Test
    void attackTest() {
        int defaultHeroHp = 100;
        Warrior demoHero = new Warrior("デモ勇者", defaultHeroHp, 100);
        int slimeHP = 450;
        Enemy slime = new Enemy("スライムもどき", slimeHP, 100);
        slime.attack(demoHero);
        assertEquals(defaultHeroHp, demoHero.attack);
         
       for(int i = 0; i<3; i++){
        demoHero.attackWithWeponSkill(slime);
    }

    }
}
