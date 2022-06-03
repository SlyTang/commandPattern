public class Invoker{
    Command c;
    public void setCommand(Command c){
        this.c=c;
    }
    public void invoke(){
        c.execute();
    }
    public void undo(){
        c.unexecute();
    }
}
