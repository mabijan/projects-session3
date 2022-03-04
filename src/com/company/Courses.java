package com.company;
import java.util.Objects;
import java.util.Scanner;
public class Courses {
    private int KEY;

    Scanner input = new Scanner(System.in);

    public Courses(int KEY) {
        this.KEY = KEY;
    }

    public int getKEY() {
        return KEY;
    }

    public void setKEY(int KEY) {
        this.KEY = KEY;
        if (KEY == 1)
            System.out.println("you chose 1!");
    }

    public void get_info(){

            if(KEY == 1){
                int subject1;

            System.out.println("please choose the subject you wish\n" +
                    "available options:(Tafsir ==> 1)");

            subject1 = input.nextInt();

            if (subject1 == 1){
                System.out.format("""
                        ***Tafsir***
                        Course credit:%d
                        prerequisite courses:doesnt have any prerequisite courses 
                        required courses:doesnt have any required  courses
                        """, 2);
            }
            else{ System.out.println("Unknown subject!");}

            }

            else if (KEY == 2){
                int subject2;

                System.out.println("please choose the subject you wish\n" +
                        "available options:(BARNAMEH SAZI ==> 1, RIAZI2 ==> 2, FIZIK2 ==> 3, DIFRANSIEL ==> 4)");
                subject2 = input.nextInt();

                if (subject2 == 1){
                    System.out.format("""
                            ***BARNAMEH SAZI***
                            Course credit:%d
                            prerequisite courses:%s
                            required courses:%s"
                            """, 3, "MABANI", "doesnt have any required  courses");
                }

                else if (subject2 == 2){
                    System.out.format("""
                            ***RIAZI2***
                            Course credit:%d
                            prerequisite courses:%s
                            required courses:%s"
                            """, 3, "RIAZI1", "doesnt have any required  courses");

                }

                else if (subject2 == 3){
                    System.out.format("""
                            ***FIZIK2*** 
                            Course credit:%d
                            prerequisite courses:%s
                            required courses:%s"
                            """, 3, "FIZIK1, RIAZI1", "doesnt have any required  courses");

                }

                else if (subject2 == 4){
                    System.out.format("""
                            ***DIFRANSIEL***
                            Course credit:%d
                            prerequisite courses:%s
                            required courses:%s"
                            """, 3, "RIAZI1", "doesnt have any required  courses");


                }

            }
    }
}
