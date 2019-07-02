package designpattern.reponsibilitychain.ex01;

public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    /**
     * 能处理的级别
     */
    private int level;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public final void handleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else if (this.nextHandler != null) {
            this.nextHandler.handleMessage(women);
        } else {
            System.out.println("没地方请示了");
        }
    }

    protected abstract void response(IWomen women);
}
