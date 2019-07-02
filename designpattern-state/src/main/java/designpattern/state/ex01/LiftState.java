package designpattern.state.ex01;

public abstract class LiftState {
    public void setContext(Context context) {
        this.context = context;
    }

    public Context context;

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
