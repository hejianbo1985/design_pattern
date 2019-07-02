package designpattern.state.ex01;

public class OpeningState extends LiftState {
    public void open() {
        System.out.println("电梯门开启");
    }

    public void close() {
        super.context.setLiftState(Context.closeingState);
        super.context.close();
    }

    public void run() {
    }

    public void stop() {
    }
}
