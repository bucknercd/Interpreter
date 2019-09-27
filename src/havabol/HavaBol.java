package havabol;

public class HavaBol {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a .hav program for the HavaBol interpreter.");
            System.exit(1);
        }
        try {
          SymbolTable st = new SymbolTable();
          Parser parser = new Parser(args[0], st);
          while (! parser.scan.getNext().isEmpty()) {
            parser.statements(false);
          }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
