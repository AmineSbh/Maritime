package Moteur;

import java.util.Timer;
import java.util.TimerTask;

import GuiPort.Moteur;
import Port.PortAlli�;

public class Chronometre {

    private int gold;
    private int wood;
    private int food;
    private int steel;
    private int enCours;

    public Chronometre(PortAlli� portAllie,int enCours,int temps) {
        this.gold=portAllie.getDonn�esPort().getGold();
        this.wood=portAllie.getDonn�esPort().getWood();
        this.food=portAllie.getDonn�esPort().getFood();
        this.steel=portAllie.getDonn�esPort().getSteel();
        this.enCours=enCours;

        if(enCours==1) {
            Timer chrono = new Timer();
            chrono.schedule(new TimerTask(){

                public void run() {
                    gold+=3;

                    wood+=4;

                    food+=5;

                    steel++;
                }

            },1000,temps);
        }
    }

    public int getGold() {
        return gold;
    }


    public void setGold(int gold) {
        this.gold = gold;
    }


    public int getWood() {
        return wood;
    }


    public void setWood(int wood) {
        this.wood = wood;
    }


    public int getFood() {
        return food;
    }


    public void setFood(int food) {
        this.food = food;
    }


    public int getSteel() {
        return steel;
    }


    public void setSteel(int steel) {
        this.steel = steel;
    }
}
