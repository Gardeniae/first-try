package demo2;

import java.util.Random;

public class People {
    private String name;
    private int blood;

    public People() {
    }

    public People(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String toString() {
        return "People{name = " + name + ", blood = " + blood + "}";
    }

    public void attack(People a) {
        //随机伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int res = a.getBlood() - hurt;
        res = res < 0 ? 0 : res;
        a.setBlood(res);
        System.out.println(this.getName() + "造成了"+a.getName()+hurt+"点伤害");
    }
}
