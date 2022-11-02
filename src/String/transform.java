package String;
import java.util.Scanner;
public class transform {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("请输入金额");
        int index=sc.nextInt();
        String money="";
        while(index!=0)
        {
            int ge=index%10;
            String temp=trans(ge);
            money=temp+money;
            index/=10;
        }
        int len=money.length();
        for(int i=7-len;i>0;i--)
        {
            money="零"+money;
        }
        String result="";
        String []arr={"佰","拾","万","千","佰","拾","圆"};
        for (int i = 0; i < money.length(); i++) {

            result=result+money.charAt(i)+arr[i];
        }
        System.out.println(result);

    }
    public static String trans(int num)
    {
        String []arr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[num];
    }
}
