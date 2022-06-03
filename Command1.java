public class Command1 implements Command{
    Receiver r = new Receiver();
    public Command1(Receiver r){
        this.r = r;
    }
    public void execute(){
        r.action("executing Command1...");
    }
    public void unexecute(){
        r.action("undoing Command1...");
    }
}
