package designpattern.state.ex01;

public class ClosingState extends LiftState {
    public void open() {
        super.context.setLiftState(Context.closeingState);
        super.context.run();
    }

    public void close() {
        System.out.println("电梯门关闭...");
    }

    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.run();
    }

    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.run();
    }
}
