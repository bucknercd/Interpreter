package havabol;

import java.util.ArrayList;

public class ResultValue {
	public int type;					// usually data type of the result
	public String value;				// value of the result
	public ArrayList<String> structure;	// primitive, fixed array, unbounded array
	public String terminatingStr;		// used for end of lists of things
        								// (e.g., a list of statements might be terminated by "endwhile")

    public ResultValue(String value) {
        this.value = value;
        structure = new ArrayList<String>();
    }
}
