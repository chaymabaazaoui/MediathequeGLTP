package mediatheque;

public class CatalogVisitors implements ItemVisitors {
    public void visit(CD item){
        System.out.println(" VISITTING  CATALOGUE : " + item.getTitle());
    }
    public void visit(Book item) {
        System.out.println("VISITING CATALOGUE : " + item);
    }
}