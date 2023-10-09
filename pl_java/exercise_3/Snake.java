package pl_java.exercise_3;

public class Snake {

/*
 * Attributes
 */
    private final String color;
    private int length;
    private String direction;


/*
 * Constructors
 */
    public Snake(String color, int length, String direction){
        this.color = color;
        this.length = length;
        setDirection(direction);
    }

    public Snake(String direction){
        this("GREEN",3, direction);
    }


/*
 * Getters
 */
    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    public String getDirection() {
        return direction;
    }


/*
 * Setters
 */
    private void setDirection(String direction){
        if (!"EAST".equals(direction) && !"WEST".equals(direction) && !"NORTH".equals(direction) && !"SOUTH".equals(direction)){
            System.out.println("Error: Invalid Input direction!");
        }else{
            this.direction = direction;
        }
    }


/*
 * Methods
 */
    public void modifyLength(int length){
        if(length <= 0){
            System.out.println("Error: Input length cannot be less than zero!");
        }
        this.length+= length;
    }

    public void turnLeft(){
        switch(direction){
            case "EAST":
                direction = "NORTH";
            break;
            case "WEST":
                direction = "SOUTH";
            break;
            case "NORTH":
                direction = "WEST";
            break;
            case "SOUTH":
                direction = "EAST";
            break;
        }
    }

    public void turnRight(){
        switch(direction){
            case "EAST":
                direction = "SOUTH";
            break;
            case "WEST":
                direction = "NORTH";
            break;
            case "NORTH":
                direction = "EAST";
            break;
            case "SOUTH":
                direction = "WEST";
            break;
        }
    }
}
