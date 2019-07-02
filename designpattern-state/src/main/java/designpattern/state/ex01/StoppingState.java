package designpattern.state.ex01;

public class StoppingState extends LiftState {
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.run();
    }

    public void close() {

    }

    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.run();
    }

    public void stop() {
        System.out.println("电梯停止了");
    }
}
