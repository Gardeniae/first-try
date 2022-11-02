package demo2;

public class play {
    public static void main(String[] args) {
        People r1=new People("乔峰",100);
        People r2=new People("杨过",100);
        while(true)
        {
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"k.o"+r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood()==0)
            {
                System.out.println(r2.getName()+"K.O"+r1.getName());
                break;
            }
        }
    }
}
