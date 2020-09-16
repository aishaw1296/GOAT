package generalized.occupational.aptitude.test;

/*
 * File: G.O.A.T.java
 * Author: Aisha Williams
 * Date: November 7, 2015
 * Purpose: This program will
 * test the user in order to decide
 * their future occupation
 */

import java.util.*;

/**
 *
 * @author Aisha
 */
public class GeneralizedOccupationalAptitudeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declare and initialize variables
        int science = 0;
        int speech = 0;
        int melee = 0;
        int sneak = 0;
        int medicine = 0;
        int unarmed = 0;
        int explosives = 0;
        int bigGuns = 0;
        int smallGuns = 0;
        int barter = 0;
        int lockPick = 0;
        int energyWeapons = 0;
        int repair = 0;
        
        // Utilize the scanner class to ask for user input
	Scanner scannerIn = new Scanner(System.in);
        
        // Welcome statement
        System.out.println("Welcome to the Vault-Tec Generalized " +
                "Occupational Aptitude Test!");
        System.out.println("Or as I like to call it: The G.O.A.T!");
        System.out.println("Please answer each question to the best of " +
                "your ability.");
        System.out.println("Select \"A\", \"B\", \"C\", or \"D\" "
                + "for each question.");
        System.out.println("Enter any button to begin the test.");
        
        // Prompt user for input
        String answer = scannerIn.next();
        System.out.println("");
        
        // Ask question 1
        System.out.println("Question 1:");
        System.out.println("You are approached by a frenzied Vault " +
                "scientist, who yells, ");
        System.out.println("\"I'm going to put my quantum " +
                "harmonizer in your photonic resonation chamber!\"");
        System.out.println("What's your response? \n");
        
        System.out.println("A. \"But doctor, wouldn't that cause a " +
                "parabolic destabilization of the fission singularity?\"");
        System.out.println("B. \"Yeah? Up yours too, buddy!\"");
        System.out.println("C. Say nothing, grab a nearby pipe and hit the " +
                "scientist in the head to knock him out.");
        System.out.println("   For all you knew, he was planning to blow " +
                "up the vault.");
        System.out.println("D. Say nothing, but slip away before the " +
                "scientist can continue his rant.");
        
        // Prompt user for input
        answer = scannerIn.next();
        System.out.println("");
        
        // if and else-if statements
        if(answer.equalsIgnoreCase("A")) {
            science++;
        }
        else if(answer.equalsIgnoreCase("B")) {
            speech++;
        }
        else if(answer.equalsIgnoreCase("C")) {
            melee++;
        }
        else if(answer.equalsIgnoreCase("D")) {
            sneak++;
        } else {
            System.out.println("Oops! You did not enter one of the four " +
                    "choices. Please try again.");
        }
        
        // Ask question 2
        System.out.println("Question 2:");
        System.out.println("While working as an intern in the Clinic, " +
                "a patient with a strange infection on");
        System.out.println("his foot stumbles through the door. The " +
                "infection is spreading at an alarming rate,");
        System.out.println("but the doctor has stepped out for a while.");
        System.out.println("What do you do? \n");
        
        System.out.println("A. Amputate the foot before the infection spreads");
        System.out.println("B. Scream for help");
        System.out.println("C. Medicate the infected area to the best " +
                "of your abilities");
        System.out.println("D. Restrain the patient, and merely observe " +
                "as the infection spreads");
        
        // Prompt for user input
        answer = scannerIn.next();
        System.out.println("");
        
        // if and else-if statements
        if(answer.equalsIgnoreCase("A")) {
            melee++;
        }
        else if(answer.equalsIgnoreCase("B")) {
            speech++;
        }
        else if(answer.equalsIgnoreCase("C")) {
            medicine++;
        }
        else if(answer.equalsIgnoreCase("D")) {
            science++;
        } else {
            System.out.println("Oops! You did not enter one of the four " +
                    "choices. Please try again.");
        }
        
        // Ask question 3
        System.out.println("Question 3:");
        System.out.println("You discover a young boy lost in the lower " +
                "levels of the Vault.");
        System.out.println("He's hungry and frightened, but also appears " +
                "to be in possession of stolen property.");
        System.out.println("What do you do? \n");
        
        System.out.println("A. Give the boy a hug and tell him everything " +
                "will be okay");
        System.out.println("B. Confiscate the property by force, and leave " +
                "him there as punishment");
        System.out.println("C. Pick the boy's pocket to take the stolen " +
                "property for yourself,");
        System.out.println("   and leave the boy to his fate");
        System.out.println("D. Lead the boy to safety, then turn him over " +
                "to the overseer");
        
        // Prompt for user input
        answer = scannerIn.next();
        System.out.println("");
        
        // if and else-if statements
        if(answer.equalsIgnoreCase("A")) {
            speech++;
        }
        else if(answer.equalsIgnoreCase("B")) {
            unarmed++;
        }
        else if(answer.equalsIgnoreCase("C")) {
            sneak++;
        }
        else if(answer.equalsIgnoreCase("D")) {
            
        } else {
            System.out.println("Oops! You did not enter one of the four " +
                    "choices. Please try again.");
        }
        
        // Ask question 4
        System.out.println("Question 4:");
        System.out.println("Congratulations! You made one of the Vault " +
                "101 baseball teams!");
        System.out.println("Which position do you prefer? \n");
        
        System.out.println("A. Pitcher");
        System.out.println("B. Catcher");
        System.out.println("C. Designated Hitter");
        System.out.println("D. None, you wish the vault had a soccer team");
        
        // Prompt for user input
        answer = scannerIn.next();
        System.out.println("");
        
        // if and else-if statements
        if(answer.equalsIgnoreCase("A")) {
            explosives++;
        }
        else if(answer.equalsIgnoreCase("B")) {
            bigGuns++;
        }
        else if(answer.equalsIgnoreCase("C")) {
            melee++;
        }
        else if(answer.equalsIgnoreCase("D")) {
            unarmed++;
        } else {
            System.out.println("Oops! You did not enter one of the four " +
                    "choices. Please try again.");
        }
        
        // Ask question 5
        System.out.println("Question 5:");
        System.out.println("Your grandmother invites you to tea, but you're " +
                "surprised when she gives you a pistol");
        System.out.println("and orders you to kill another Vault resident.");
        System.out.println("What do you do? \n");
        
        System.out.println("A. Obey your elder and kill the Vault resident " +
                "with the pistol.");
        System.out.println("B. Offer your most prized possession for the " +
                "resident's life.");
        System.out.println("C. Ask granny for a minigun instead. After all, " +
                "you don't want to miss.");
        System.out.println("D. Throw your tea in granny's face");
        
        // Prompt for user input
        answer = scannerIn.next();
        System.out.println("");
        
        // if and else-if statements
        if(answer.equalsIgnoreCase("A")) {
            smallGuns++;
        }
        else if(answer.equalsIgnoreCase("B")) {
            barter++;
        }
        else if(answer.equalsIgnoreCase("C")) {
            bigGuns++;
        }
        else if(answer.equalsIgnoreCase("D")) {
            explosives++;
        } else {
            System.out.println("Oops! You did not enter one of the four " +
                    "choices. Please try again.");
        }
        
        // Ask question 6
        System.out.println("Question 6:");
        System.out.println("Old Mr. Abernathy has locked himself in his " +
                "quarters again,");
        System.out.println("and you've been ordered to get him out.");
        System.out.println("How do you proceed? \n");
        
        System.out.println("A. Use a bobby pin to pick the lock on the door.");
        System.out.println("B. Trade a Vault hoodlum for his cherry bomb and " +
                "blow open the lock.");
        System.out.println("C. Go to the armory, retrieve a laser pistol, " +
                "and blow the lock off.");
        System.out.println("D. Walk away, and let the old coot rot.");
        
        // Prompt for user input
        answer = scannerIn.next();
        System.out.println("");
        
        // if and else-if statements
        if(answer.equalsIgnoreCase("A")) {
            lockPick++;
        }
        else if(answer.equalsIgnoreCase("B")) {
            explosives++;
            barter++;
        }
        else if(answer.equalsIgnoreCase("C")) {
            energyWeapons++;
        }
        else if(answer.equalsIgnoreCase("D")) {
            repair++;
        } else {
            System.out.println("Oops! You did not enter one of the four " +
                    "choices. Please try again.");
        }
        
        // Ask question 7
        System.out.println("Question 7:");
        System.out.println("Oh, no! You've been exposed to radiation, " +
                "and a mutated and has grown out of your stomach!");
        System.out.println("What's the best course of treatment? \n");
        
        System.out.println("A. A bullet to the brain");
        System.out.println("B. Large doses of anti-mutagen agent");
        System.out.println("C. Prayer. Maybe God will spare you in exchange " +
                "for a life of pious devotion.");
        System.out.println("D. Removal of the mutated tissue with a " +
                "precision laser");
        
        // Prompt for user input
        answer = scannerIn.next();
        System.out.println("");
        
        // if and else-if statements
        if(answer.equalsIgnoreCase("A")) {
            smallGuns++;
        }
        else if(answer.equalsIgnoreCase("B")) {
            medicine++;
        }
        else if(answer.equalsIgnoreCase("C")) {
            barter++;
        }
        else if(answer.equalsIgnoreCase("D")) {
            energyWeapons++;
        } else {
            System.out.println("Oops! You did not enter one of the four " +
                    "choices. Please try again.");
        }
        
        // Ask question 8
        System.out.println("Queston 8:");
        System.out.println("A fellow Vault 101 resident is in possession of " +
                "a Grognak the Barbarian comic book, issue number 1.");
        System.out.println("You want it. What's the best way to obtain it? \n");
        
        System.out.println("A. Trade the comic book for one of your own " +
                "valuable possessions");
        System.out.println("B. Steal the comic book at gunpoint");
        System.out.println("C. Sneak into the resident's quarters, and " +
                "steal the comic book from his desk");
        System.out.println("D. Slip some knock out drops into the " +
                "resident's Nuka-Cola, and ");
        System.out.println("   take the comic book when he's unconscious.");
        
        // Prompt for user input
        answer = scannerIn.next();
        System.out.println("");
        
        // if and else-if statements
        if(answer.equalsIgnoreCase("A")) {
            barter++;
        }
        else if(answer.equalsIgnoreCase("B")) {
            smallGuns++;
        }
        else if(answer.equalsIgnoreCase("C")) {
            sneak++;
        }
        else if(answer.equalsIgnoreCase("D")) {
            medicine++;
        } else {
            System.out.println("Oops! You did not enter one of the four " +
                    "choices. Please try again.");
        }
        
        // Ask question 9
        System.out.println("Question 9:");
        System.out.println("You decide it would be fun to play a prank " +
                "on your father.");
        System.out.println("You enter his private restroom when no one " +
                "is looking, and....\n");
        
        System.out.println("A. Loosen some bolts on some pipes.");
        System.out.println("   When the sink is turned on, the room will flood.");
        System.out.println("B. Put a firecracker in the toilet. That's sure " +
                "to cause some chaos");
        System.out.println("C. Break into the locked medicine cabinet");
        System.out.println("   and replace his high blood pressure medication " +
                "with sugar pills");
        System.out.println("D. Manipulate the power wattage on his razor, " +
                "so he'll get an electric shock next time he shaves");
        
        // Prompt for user input
        answer = scannerIn.next();
        System.out.println("");
        
        // if and else-if statements
        if(answer.equalsIgnoreCase("A")) {
            repair++;
        }
        else if(answer.equalsIgnoreCase("B")) {
            explosives++;
        }
        else if(answer.equalsIgnoreCase("C")) {
            medicine++;
        }
        else if(answer.equalsIgnoreCase("D")) {
            lockPick++;
        } else {
            System.out.println("Oops! You did not enter one of the four " +
                    "choices. Please try again.");
        }
        
        // Ask question 10
        System.out.println("Question 10:");
        System.out.println("Who is indisputably the most important person " +
                "in Vault 101:");
        System.out.println("He who shelters us from the harshness of the " +
                "atomic wasteland,");
        System.out.println("and to whom we owe everything we have, " +
                "including our lives? \n");
        
        System.out.println("A. The Overseer");
        System.out.println("B. The Overseer");
        System.out.println("C. The Overseer");
        System.out.println("D. The Overseer");
        
        // Prompt for user input
        answer = scannerIn.next();
        System.out.println("");
        
        // Print output statements
        System.out.println("The results are in!");
        
        if(barter > bigGuns&&barter > energyWeapons&&barter > explosives
                &&barter > lockPick&&barter > medicine&&barter > melee
                &&barter > repair&&barter > science&&barter > smallGuns
                &&barter > sneak&&barter > speech&&barter > unarmed) {
            System.out.println("\"They say the G.O.A.T never lies.");
            System.out.println("According to this, you're slated to be "
                    + "the next vault... Chaplain. God help us all.\"");
        } else if(bigGuns > barter&&bigGuns > energyWeapons&&bigGuns > explosives
                &&bigGuns > lockPick&&bigGuns > medicine&&bigGuns > melee
                &&bigGuns > repair&&bigGuns > science&&bigGuns > smallGuns
                &&bigGuns > sneak&&bigGuns > speech&&bigGuns > unarmed) {
            System.out.println("\"Well according to this, you're in line to "
                    + "be trained as a laundry cannon operator.");
            System.out.println("First time for everything indeed.\"");
        } else if(energyWeapons > barter&&energyWeapons > bigGuns
                &&energyWeapons > explosives&&energyWeapons > lockPick
                &&energyWeapons > medicine&&energyWeapons > melee
                &&energyWeapons > repair&&energyWeapons > science
                &&energyWeapons > smallGuns&&energyWeapons > sneak
                &&energyWeapons > speech&&energyWeapons > unarmed) {
            System.out.println("\"It's nice to know I can still be surprised. "
                    + "Pedicurist!");
            System.out.println("I might have guessed Manicurist, or even "
                    + "Masseuse. But apparently you're a foot person.\"");
        } else if(explosives > barter&&explosives > bigGuns
                &&explosives > energyWeapons&&explosives > lockPick
                &&explosives > medicine&&explosives > melee
                &&explosives > repair&&explosives > science
                &&explosives > smallGuns&&explosives > sneak
                &&explosives > speech&&explosives > unarmed) {
            System.out.println("\"It says here you're perfectly suited for a ]"
                    + "career as a Waste Management Specialist.");
            System.out.println("A specialist, mind you, not just a dabbler. "
                    + "Congratulations!\"");
        } else if(lockPick > barter&&lockPick > bigGuns
                &&lockPick > energyWeapons&&lockPick > explosives
                &&lockPick > medicine&&lockPick > melee
                &&lockPick > repair&&lockPick > science
                &&lockPick > smallGuns&&lockPick > sneak
                &&lockPick > speech&&lockPick > unarmed) {
            System.out.println("\"Huh. \"Vault Loyalty Inspector\"... I "
                    + "thought that had been phased out decades ago.");
            System.out.println("Well, sounds like a job right up your "
                    + "alley, hmm?\"");
        } else if(medicine > barter&&medicine > bigGuns
                &&medicine > energyWeapons&&medicine > explosives
                &&medicine > lockPick&&medicine > melee
                &&medicine > repair&&medicine > science
                &&medicine > smallGuns&&medicine > sneak
                &&medicine > speech&&medicine > unarmed) {
            System.out.println("\"Interesting. \"Clinical Test Subject\"... "
                    + "sounds like something you should excel at.");
            System.out.println(" I guess you and your dad will be "
                    + "working together.\"");
        } else if(melee > barter&&melee > bigGuns
                &&melee > energyWeapons&&melee > explosives
                &&melee > lockPick&&melee > medicine
                &&melee > repair&&melee > science
                &&melee > smallGuns&&melee > sneak
                &&melee > speech&&melee > unarmed) {
            System.out.println("\"Looks like the diner's going to get a new "
                    + "Fry Cook.");
            System.out.println("I'll just say this once: hold the mustard, "
                    + "extra pickles. Ha ha ha.\"");
        } else if(repair > barter&&repair > bigGuns
                &&repair > energyWeapons&&repair > explosives
                &&repair > lockPick&&repair > medicine
                &&repair > melee&&repair > science
                &&repair > smallGuns&&repair > sneak
                &&repair > speech&&repair > unarmed) {
            System.out.println("\"Thank goodness. We're finally getting a "
                    + "new Jukebox Technician.");
            System.out.println("That thing hasn't worked right since old "
                    + "Joe Palmer passed.\"");
        } else if(science > barter&&science > bigGuns
                &&science > energyWeapons&&science > explosives
                &&science > lockPick&&science > medicine
                &&science > melee&&science > repair
                &&science > smallGuns&&science > sneak
                &&science > speech&&science > unarmed) {
            System.out.println("\"Well, well. Pip-Boy Programmer, eh?");
            System.out.println("Stanley will finally have someone to "
                    + "talk shop with.\"");
        } else if(smallGuns > barter&&smallGuns > bigGuns
                &&smallGuns > energyWeapons&&smallGuns > explosives
                &&smallGuns > lockPick&&smallGuns > medicine
                &&smallGuns > melee&&smallGuns > repair
                &&smallGuns > science&&smallGuns > sneak
                &&smallGuns > speech&&smallGuns > unarmed) {
            System.out.println("\"Huh. I wonder who will be brave enough to be "
                    + "your first customer as the vault's new Tattoo Artist?");
            System.out.println("I promise it won't be me.\"");
        } else if(sneak > barter&&sneak > bigGuns
                &&sneak > energyWeapons&&sneak > explosives
                &&sneak > lockPick&&sneak > medicine
                &&sneak > melee&&sneak > repair
                &&sneak > science&&sneak > smallGuns
                &&sneak > speech&&sneak > unarmed) {
            System.out.println("\"Apparently you're management material. "
                    + "You're going to be trained as a Shift Supervisor.");
            System.out.println("Could I be talking to the next Overseer? "
                    + "Stranger things have happened.\"");
        } else if(speech > barter&&speech > bigGuns
                &&speech > energyWeapons&&speech > explosives
                &&speech > lockPick&&speech > medicine
                &&speech > melee&&speech > repair
                &&speech > science&&speech > smallGuns
                &&speech > sneak&&speech > unarmed) {
            System.out.println("\"Wow. Wow. Says here you're going to be the "
                    + "vault's Marriage Counselor.");
            System.out.println("Almost makes me want to get married, just "
                    + "to be able to avail myself of your services.\"");
        } else if(unarmed > barter&&unarmed > bigGuns
                &&unarmed > energyWeapons&&unarmed > explosives
                &&unarmed > lockPick&&unarmed > medicine
                &&unarmed > melee&&unarmed > repair
                &&unarmed > science&&unarmed > smallGuns
                &&unarmed > sneak&&unarmed > speech) {
            System.out.println("\"I always thought you'd have a career in "
                    + "professional sports.");
            System.out.println("You're the new vault Little League coach! "
                    + "Congratulations!\"");        
        } else {
            System.out.println("Could not compute... beep boop.");
        }
    }
}
