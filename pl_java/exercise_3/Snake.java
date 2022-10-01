package pl_java.exercise_3;

public class Snake {

/*
 * Attributes
 */
    private final String color;
    private int length;
    private String currentDirection;


/*
 * Constructors
 */
    public Snake(String color, int length, String direction){
        this.color = color;
        this.length = length;
        setDirection(direction);
    }

    public Snake(String direction){
        this("GREEN",1, direction);
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

    public String getCurrentDirection() {
        return currentDirection;
    }


/*
 * Setters
 */
    private void setDirection(String direction){
        if (!"EAST".equals(direction) && !"WEST".equals(direction) && !"NORTH".equals(direction) && !"SOUTH".equals(direction)){
            System.out.println("Error: Invalid Input direction!");
        }else{
            currentDirection = direction;
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
        switch(currentDirection){
            case "EAST":
                currentDirection = "NORTH";
            break;
            case "WEST":
                currentDirection = "SOUTH";
            break;
            case "NORTH":
                currentDirection = "EAST";
            break;
            case "SOUTH":
                currentDirection = "WEST";
            break;
        }
    }

    public void turnRight(){
        switch(currentDirection){
            case "EAST":
                currentDirection = "SOUTH";
            break;
            case "WEST":
                currentDirection = "NORTH";
            break;
            case "NORTH":
                currentDirection = "WEST";
            break;
            case "SOUTH":
                currentDirection = "EAST";
            break;
        }
    }
}
