public class Command2 implements Command{
    Receiver r = new Receiver();
    public Command2(Receiver r){
        this.r = r;
    }
    public void execute(){
        r.action("executing Command2...");
    }
    public void unexecute(){
        r.action("undoing Command2...");
    }
}
