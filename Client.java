import java.util.*;
public class Client{
    public static Stack stack = new Stack();
    public static String input;
    public static void main(String [] args){
        Invoker i = new Invoker();
        Receiver r = new Receiver();
        Command c1 = new Command1(r);
        Command c2 = new Command2(r);

        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Enter Command (0-exit, 1-Command1, 2-Command2, 3-Undo)");
            input = s.nextLine();
            if(input.equals("1")){
                stack.push(c1);
                i.setCommand(c1);
                i.invoke();
            }else if(input.equals("2")){
                stack.push(c2);
                i.setCommand(c2);
                i.invoke();
            }else{
                while(!stack.isEmpty()){
                    Command c = (Command)stack.pop();
                    c.unexecute();
                }
            }
        }while(!input.equals("0"));
        System.out.println("exiting program...");
    }
}
