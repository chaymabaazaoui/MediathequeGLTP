package mediatheque;

public class CDVisitors implements ItemVisitors{

	public void visit(CD item){
        System.out.println("VISITING CD : " + item);
    }
    public void visit(Book item) {
       // System.out.println("Book : " + item);
    }

}
