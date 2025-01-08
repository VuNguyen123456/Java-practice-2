/**
 * A class called OneItemBag represents a bag that can hold any single type of object (decided at bag-creation time), and only one item of that type at a time.
 * 
 * @author Vu Nguyen
 * @param <T> the type of object that can be stored in the bag
 */
public class OneItemBag<T> {
    /**
     * A field that store the item that is in the bag.
     */
    private T item;
    
    /** 
     * Add the item into the bag if the bag is empty.
     * 
     * @param item to put in the bag
     * @return boolean
     */
    public boolean addItem(T item){
        if(item == null){
            return false;
        }
        if(hasItem() == true){
            return false;
        }
        this.item = item;
        return true;
    }

    /** 
     * Remove the item in the bag if it's full.
     * 
     * @return T
     */
    public T removeItem(){
        if(this.item == null){
            return null;
        }
        T removed = item;
        this.item = null;
        return removed;
    }

    /** 
     * Check to see if the bag already have a item in it already or not.
     * 
     * @return boolean
     */
    public boolean hasItem(){
        if(this.item  != null){
            return true;
        }
        return false;
    }
}
