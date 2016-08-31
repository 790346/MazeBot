public class MazeWalker
{
    public void walkMaze(MazeBot mazeBot){
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnLeft();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnRight();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnRight();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnLeft();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnLeft();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnRight();
        mazeBot.moveForward();
        mazeBot.moveForward();
        while mazeBot.canMoveForward(){
            mazeBot.moveForward()
        }
            
        if(mazeBot.didReachGoal()){
            mazeBot.signalSuccess();
        }
        else{
            mazeBot.signalError();
        }
    }
}
