package oopClass1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Random;

public class Player {
    static int id = 1;
    String name;
    LocalDate birthday;
    int number;
    String position;
    int quality;
    int yellowCards;
    int redCards;
    boolean suspended;
    boolean treined;

    public Player() {
    }

    public Player( String name, LocalDate birthday, int number, String position, int quality) {
        id = id++;
        this.name = name;
        this.birthday = birthday;
        this.number = number;
        this.position = position;
        this.quality = quality;
        yellowCards = 0;
        redCards = 0;
        suspended = false;
        treined = false;
    }
    public void isSuspended() {
        suspended = yellowCards > 2 || redCards > 0;
    }

    public void applyYellowCard(int numberOfYellowCards){
        yellowCards += numberOfYellowCards;
        isSuspended();
    }
    public void applyRedCard(int numberOfRedCards){
        redCards += numberOfRedCards;
        isSuspended();
    }
    public void fulfillSuspension(){
        if(suspended){
            redCards = 0;
            yellowCards = 0;
            suspended = false;
        }else{
            System.out.println(name + " isn't suspended");
        }
    }
    public void isEscalated(){
        treined = false;
    }

    public void runTraining(){
        if (!treined){
            Random random = new Random();
            int addedPoints = (random.nextInt(3)+1);
            quality += addedPoints;
            treined = true;
            System.out.printf("%s quality has gone up %d points and is now at %d\n",name, addedPoints,quality);
        }else{
            System.out.println(name + " has already completed training for the next match");
        }
    }

    public void getInjured(){
        Random random = new Random();
        int probability = random.nextInt(100)+1;
        if (probability <= 5){
            quality *= 0.85;
            System.out.printf("%s quality has gone down %d points and is now at %d\n", name, (int)(quality*0.15),quality);
        } else if (probability <= 15) {
            quality *= 0.9;
            System.out.printf("%s quality has gone down %d points and is now at %d\n", name, (int)(quality*0.10),quality);
        } else if (probability <= 30) {
            quality *= 0.95;
            System.out.printf("%s quality has gone down %d points and is now at %d\n", name, (int)(quality*0.05),quality);
        } else if (probability <= 60) {
            quality -= 2;
            if (quality < 0){
                quality = 0;
            }
            System.out.printf("%s quality has gone down %d points and is now at %d\n", name, 2,quality);
        }else {
            quality -= 1;
            if (quality < 0){
                quality = 0;
            }
            System.out.printf("%s quality has gone down %d points and is now at %d\n", name, 1,quality);
        }

    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyy-MM-dd");

        return  position + ": " +
                number + " - " +
                name + " - " +
                birthday + " " +
                "CONDITION: " +
                (!suspended ? "Can play".toUpperCase() :"Can't play".toUpperCase())
                ;
    }
}
