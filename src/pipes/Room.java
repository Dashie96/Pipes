package pipes;

import java.util.HashMap;
import java.util.Set;
/**
 * ---------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <Eric.Slaweski@gmail.com> wrote this file. As long as you retain this notice 
 * you can do whatever you want with this stuff. If we meet some day, and you 
 * think this stuff is worth it, you can buy me a beer in return. Eric Slaweski
 * ----------------------------------------------------------------------------
 * 
 * @author  Eric Slaweski
 * @version 2011.07.31
 */
public class Room
{
  private String description;
  private HashMap <String, Room> exits;
  private Item item;
  boolean itemUsed = false;

  /**
   * Create a room described "description". Initially, it has
   * no exits. "description" is something like "a kitchen" or
   * "an open court yard".
   * @param description The room's description.
   */
  public Room(String description)
  {
    this.description = description;
    exits = new HashMap<String, Room>();
  }

  /**
   * Define an exit from this room.
   */
  public void setExit(String direction, Room neighbor)
  {
    exits.put(direction, neighbor);
  }

  /**
   * @param direction The direction in question.
   * @return The direction of the exit to return.
   */
  public Room getExit(String direction)
  {
    return exits.get(direction);
  }

  /**
   * Return a long description of this room
   *  Exits: north west
   *@return: A description of the room including exits.
   */
  public String getLongDescription()
  {
    return description + ".\n" + getExitString();
  }

  public String getDescription()
  {
    return description;
  }
  
  public void itemUsed()
  {
    itemUsed = true;
  }
  
  public boolean getItemUsed()
  {
    return itemUsed;
  }
  
  public void addUsableItem(Item item)
  {
    this.item = item;
  }

  /**
   * Return a string describing the room's exits
   * e.g. "Exits : north east up"
   */
  public String getExitString()
  {
    String returnString = "Exits: ";
    Set<String> keys = exits.keySet();
    for(String exit : keys)
    {
      returnString += " " + exit;
    }
    return returnString;
  }
}
