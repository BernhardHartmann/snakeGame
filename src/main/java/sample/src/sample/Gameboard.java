package sample.src.sample;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Random;

//Labels
public class Gameboard {
    private String[] touchWall = new String[9];
    private String[] touchTail = new String[6];
    private Random rand = new Random();


    private String[] stringsTouchWall() {
        touchWall[0] = "Stop touching the wall \nas if it's your boyfriend.....";
        touchWall[1] = "You never touch me \nin the way you touched that wall :*(";
        touchWall[2] = "Walls are your favorite thing huh?";
        touchWall[3] = "The wall you touched is solid,\n no comin through";
        touchWall[4] = "Wall:1, You:0";
        touchWall[5] = "Mimimimi you dead!";
        touchWall[6] = "No one would survive this...";
        touchWall[7] = "You colored the wall, \nwhat a nice thing to do";
        touchWall[8] = "No touchy touchy le wall mi Friend! ";
        return touchWall;
    }

    private String[] stringsTouchTail() {
        touchTail[0] = "Touching yourself huh? ; )";
        touchTail[1] = "Snake ate herself in fury";
        touchTail[2] = "Not your best day is it?....";
        touchTail[3] = "Well...you tried...";
        touchTail[4] = "Stop trying...";
        touchTail[5] = "You touched that ass (tail..)!";
        return touchTail;
    }

    void setStartInfo(Group group, Stage stage) {
    	Label startInfo = new Label("\nTo move press w/a/s/d. \nDon't hit the walls!");
    	startInfo.setFont(new Font("Calibri",50));
    	startInfo.setTextFill(Color.BLACK);

        //group.getChildren().clear();
        //startInfo.relocate(200, stage.getHeight()/2-300);
        group.getChildren().add(startInfo);
    }

    public void setDeathTouchWall(Score score, Group group, Stage stage) {
        Label deathTouchWall = new Label(stringsTouchWall()[rand.nextInt(9)]
                + "\nPress R for respawn" + "\nScore: " + score.getScore());
        deathTouchWall.setFont(new Font("Calibri",80));
        deathTouchWall.setTextFill(Color.BLACK);

        group.getChildren().clear();
        deathTouchWall.relocate(200, stage.getHeight()/2-300);
        group.getChildren().add(deathTouchWall);

    }

    public void setDeathTouchTail(Score score, Group group, Stage stage) {
        Label deathTouchTail = new Label(stringsTouchTail()[rand.nextInt(6)] + "\nPress R for respawn"
                +"\nScore: " + score.getScore());
        deathTouchTail.setFont(new Font("Calibri",80));
        deathTouchTail.setTextFill(Color.BLACK);

        group.getChildren().clear();
        deathTouchTail.relocate(200, stage.getHeight()/2-200);
        group.getChildren().add(deathTouchTail);

    }

}
