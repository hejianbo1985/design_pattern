package designpattern.reponsibilitychain.ex01;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        //定义三个请示对象
        Handler father = new FatherHandler();
        Handler husband = new HusbandHandler();
        Handler son = new SonHandler();

        //设置请示顺序
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        for (IWomen women : arrayList) {
            father.handleMessage(women);
        }
    }
}
