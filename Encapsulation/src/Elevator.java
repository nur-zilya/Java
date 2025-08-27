public class Elevator {
    private int minFloor;
    private int maxFloor;
    private int currentFloor = 1;

    public Elevator(int minFloor, int maxFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        if (currentFloor > minFloor) {
            currentFloor--;
        }
    }

    public void moveUp() {
        if (currentFloor < maxFloor) {
            currentFloor++;
        }
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Ошибка: этаж вне допустимого диапазона!");
            return;
        }
        if (floor == currentFloor) {
            System.out.println("Лифт уже на этом этаже.");
            return;
        }
        if (floor > currentFloor) {
            while (currentFloor < floor) {
                moveUp();
                System.out.println("Текущий этаж: " + currentFloor);
            }
        } else {
            while (currentFloor > floor) {
                moveDown();
                System.out.println("Текущий этаж: " + currentFloor);
            }
        }
    }
}

