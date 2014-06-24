package pipes;

/**
 * ---------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <Eric.Slaweski@gmail.com> wrote this file. As long as you retain this notice 
 * you can do whatever you want with this stuff. If we meet some day, and you 
 * think this stuff is worth it, you can buy me a beer in return. Eric Slaweski
 * ----------------------------------------------------------------------------
 * 
 * @author (Eric Slaweski) 
 * @version (5/3/14)
 */
public class Item
{
  private String name;
  private int damage;
  private Room roomUsedIn;
  private String description;
  private String usedDescription;
  /**
   * Constructor for objects of class Items
   */
  public Item(String name, int damage, String description, String usedDescription, Room roomUsedIn)
  {
    this.name = name;
    this.damage = damage;
    this.description = description;
    this.usedDescription = usedDescription;
    this.roomUsedIn = roomUsedIn;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getDamage()
  {
    return damage;
  }

  public String getDescription()
  {
    return description;
  }
  
  public String getUsedDescription()
  {
    return usedDescription;
  }
  
  public Room getRoomUsedIn()
  {
    return roomUsedIn;
  }
}

