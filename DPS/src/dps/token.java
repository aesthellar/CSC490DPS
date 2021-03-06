/*
 * Part of the DPS app created by Ray Cockerham, Mei Lin Dong, Spencer Whyatt, 
 * Greg Purvine, and Phillip Jones.
 * Built for Senior Capstone.
 */
package dps;

/**
 * This is the class that defines the tokens used to represent players, NPCs, 
 * and Creatures on the map. Used mostly by the Map Controller, and can be 
 * accessed by the DM and sometimes the players, depending on settings.
 * @author Phillip
 */
public class token {
    public int xPos;
    public int yPos;
    public String owner;
    public String type; //maaaay not actually need, to be determined
    
    
    /**
     * Default constructor. Does require a few args, but they're easy to get.
     * @param x
     * @param y
     * @param kind 
     */
    public token(int x, int y, String kind){
        owner = "DM";
        type = kind;
        xPos = x;
        yPos = y;
    }
}
