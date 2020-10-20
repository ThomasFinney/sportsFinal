import java.util.Scanner;
 
class Main {
public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);
   System.out.println ("Hello, what's your username?");
   String userName = scan.next();
 
System.out.println("Do you like running?");
boolean running = scan.nextBoolean();
 
 
 
System.out.println("Do you know how to throw a football?");
boolean quarterback = scan.nextBoolean();
 
 
System.out.println("Can you kick a football good?");
boolean kicker = scan.nextBoolean();
 
System.out.println("Can you run fast and do you have good foot work?");
boolean runningBack = scan.nextBoolean();
 
System.out.println("Can you catch a football and block too?");
boolean tightEnd = scan.nextBoolean();
 
System.out.println("Can you stick next to a target when running?");
boolean defenciveBack = scan.nextBoolean();
 
System.out.println("On defence do you like to run but you don't want stick to a person constantly?");
boolean saftey =scan.nextBoolean();
 
System.out.println("Can you stand your ground?");
boolean lineMan = scan.nextBoolean();
 
System.out.println("Can you catch a football very well?");
boolean wideReceiver = scan.nextBoolean();
 
 
System.out.println("How tall are you in inches?");
int height = scan.nextInt();
 
System.out.println("How much do you weigh in pounds?");
double weight = scan.nextDouble();
 
System.out.println("How much can you squat in pounds?");
int squat = scan.nextInt();
 
System.out.println("How much can you deadlift in punds?");
int deadLift = scan.nextInt();
 
boolean squatCheck = squat/weight >= 1.25;
 
boolean deadliftCheck = deadLift/weight >= 1.5;
 
if (deadliftCheck && squatCheck) {
System.out.println("You're overall pretty strong");
} else {
System.out.println("You need to work out more to play football");
}
// I didn't come to tutoring for this problem becuase I have other commetments at that time, also I can't go and tell my carpool that they have to stay later becuase I got tutoring to go to on a short notice
// I tried to fix this error, I watched 3 diffrent videos on it, looked back into RuneStone but I still couldn't figure this out
boolean lineManSize = weight >=195 && height >= 71;
 
boolean weightCheck = weight <= 175;
 
if (weightCheck)
{
System.out.println("You can't play football right now, put on some pounds");
}
// now that sounds crule if someone isn't of this weight but that means they could get seriously hurt and that means haven't been working out
if (running && wideReceiver){
 System.out.println("You'll like playing wide receiver");
}
if (runningBack){
 System.out.println("You'll like playing tight end or running back");
}
if (kicker){
 System.out.println("You'll be playing kicker");
}
if (defenciveBack){
 System.out.println("You'll like playing defenciveBack");
 }
if (lineMan && lineManSize){
 System.out.println("You'll be a good lineman");
 }
if (saftey){
 System.out.println("You'll be a good saftey");
 }
if (tightEnd){
 System.out.println("You could be a good tightEnd");
}
 
 

 
 
 
 
 
 
// there are 11 questions, 4 are int quetions
 }
}
 

