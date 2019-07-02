package designpattern.state.ex01;

public class RunningState extends LiftState {
    public void open() {

    }

    public void close() {

    }

    public void run() {
        System.out.println("电梯上下运行...");
    }

    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.stop();
    }
}
