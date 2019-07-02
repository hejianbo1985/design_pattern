package designpattern.reponsibilitychain.ex01;

public class FatherHandler extends Handler {

    public FatherHandler() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    protected void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
