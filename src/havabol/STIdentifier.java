package havabol;

import java.util.ArrayList;

public class STIdentifier extends STEntry

{
    public static final int SCALAR = 100;
    public static final int ARRAY = -100;
    public int structure;
    public StorageManager array;

    public STIdentifier (String symbol, int primClassif, int subClassif)
    {
        super(symbol, primClassif, subClassif);
        this.subClassifStr = "IDENTIFIER";
        this.structure = SCALAR;
    }
    // array identifier creation which has a storage manager for array manipulation and storage
    public STIdentifier (Parser parser, String symbol, int primClassif, int subClassif, int size, int type)
    {
        super(symbol, primClassif, subClassif);
        this.subClassifStr = "IDENTIFIER";
        this.array = new StorageManager(parser, size, type);
        this.structure = ARRAY;
        this.array.init(size, type);
    }

    public void setValue(int index, String item) {
    	int len = item.length();
    	String last = "";
    	// create first substring
    	String first = this.value.substring(0, index);
    	String res = first + item;
    	if (this.value.length() > res.length()) {
    		last = value.substring(res.length(), this.value.length());
    	}
    	res += last;
    	this.value = res;
    }

    public String getValue(int index, Parser parser) throws Exception {
        String res = "";
    	char [] charArray = this.value.toCharArray();
        try {
            res = String.valueOf(charArray[index]);
        } catch (Exception e) {
            parser.errorNoTerm("Out of bounds");
        }
        return res;
    }

    public StorageManager getArray() {  // maybe not needed. can just access array directly
        return this.array;
    }

    @Override
    public String toString()
    {
        return "STIdentifier [symbol= "+symbol+"  value= "+this.value+" primClassifStr= "+primClassifStr
        +", type= "+ subClassifStr+" dataType= " +type+"]";
    }
}
