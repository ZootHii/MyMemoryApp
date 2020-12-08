
package Memory;

public abstract class MemoryDeficit {
    protected String deficit_id;
    protected String memory_loss;
    protected static int totalDeficit = 0;

    public MemoryDeficit(String deficit_id, String memory_loss) {
        this.deficit_id = deficit_id;
        this.memory_loss = memory_loss;
        totalDeficit = totalDeficit+1;
    }

    @Override
    public String toString() {
        return "---------------------\nDeficit ID: " + deficit_id + "\nMemory Loss: " + memory_loss;
    }
  
    public static int getTotalDeficit(){
        return totalDeficit;
    }
    
    public String getDeficit_id(){
        return deficit_id;
    }

    /*public void setDeficit_id(String deficit_id) {
        this.deficit_id = deficit_id;
    }

    public void setMemory_loss(String memory_loss) {
        this.memory_loss = memory_loss;
    }*/
    
}
