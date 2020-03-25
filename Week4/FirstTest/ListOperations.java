
package mypackage;

import java.util.ArrayList;
import java.util.List;


public class ListOperations {
    private List<String> names;
    
    public boolean addNameToList(String name) {
        boolean result = false; //local variables do not have default values.
        //IMPORTANT: Beware that the list must be initialized in case it is empty.
        if (names == null) {
            names = new ArrayList();
        } if (names != null) {
            result = names.add(name);
        
        }
        return result;
        
    }
    
    public void removeNameToList(String name) {
        names.remove(name);
    }
    
    public int getSizeOfList() {
        return names.size();
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
    
    
}
