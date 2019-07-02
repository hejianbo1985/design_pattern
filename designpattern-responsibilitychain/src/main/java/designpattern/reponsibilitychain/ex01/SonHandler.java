package designpattern.reponsibilitychain.ex01;

public class SonHandler extends Handler {

    public SonHandler() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    protected void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是： 同意\n");
    }
}
