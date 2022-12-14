/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* TODO: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */
    public boolean addDrivable(String ID, Drivable d_object){
        if (drivable_map.containsKey(ID)){
            return false;
        } else{
            drivable_map.put(ID, d_object);
            return true;
        }
    }




    /* TODO: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */
    public boolean hasFasterThan(int speed){
        if (drivable_map.size() < 1){
            return false;
        }
        for (String key : drivable_map.keySet()){
            if (drivable_map.get(key).getMaxSpeed() >= speed){
                return true;
            }
        }
        return false;
    }





    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */

    public ArrayList<Drivable> getTradable(){
        ArrayList<Drivable> l = new ArrayList<Drivable>(0);
        for (String key: drivable_map.keySet()){
            Drivable chosen_object = drivable_map.get(key);
            if (chosen_object instanceof Tradable){
                l.add(chosen_object);
            }
        }
        return l;
    }



    
}