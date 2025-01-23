package HW6;

public class Skeleton extends Boss {
    private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("    Number of arrows = " + this.numberOfArrows);
    }
}
