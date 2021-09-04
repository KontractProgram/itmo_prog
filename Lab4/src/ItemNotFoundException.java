public class ItemNotFoundException extends Exception{
    public ItemNotFoundException(Items what){}
    public String info() {return "Item not found";}

}
