package Microblog;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList <User> users=  new ArrayList();

        ArrayList <Post> posts = new ArrayList();
        int currentUser = 0;
        int postNumber = 0;
        boolean exit = false;


        while (!exit) {
            System.out.println("welcome to microblog");
            System.out.println("Main Menu");
            System.out.println("1) create a new User");
            System.out.println("2) become a existing User");
            System.out.println("3)create a post as the current User");
            System.out.println("4) print all posts");
            System.out.println("5) print all users");
            System.out.println("6( Exit");

            if (users.size() > 0) {
                System.out.println("you are currently user\""+users.get(currentUser).getUserName() + "\" what would you like to do");

            }
            int selection = keyboard.nextInt();
            if (selection == 1) {
                keyboard.nextLine();
                System.out.println("please enter a user name");
                String username = keyboard.nextLine();
                System.out.println("please enter a avatar pictures");
                String avatarpictures = keyboard.nextLine();
                System.out.println("please enter real name");
                String realname = keyboard.nextLine();
                System.out.println("please enter a Email");
                String Email = keyboard.nextLine();
                // create a new user to store above inputs

                // add the user we created above to arraylist (hint: use .add())
                users.add(new User(username, avatarpictures, realname, Email));
            } else if (selection == 2) {
                keyboard.nextLine();
                System.out.println("please select the user you would like to become");
                for (int i = 0; i < users.size(); i++) {
                    System.out.println((i + 1+ ")" + users.get(i).getUserName()));
                }
                currentUser = keyboard.nextInt() - 1;
            } else if (selection == 3) {
                keyboard.nextLine();
                if (posts.size()>0){
                    for (int i = posts.size()-1;i>=0; i--){
                        if (posts.get(i).getUserName().equals(users.get(currentUser).getUserName())){
                            posts.get(i).printPost();
                            i=0;

                        }
                    }
                }
                System.out.println("please enter your post ");
                String Post = keyboard.nextLine();

                 posts.add(new Post(users.get(currentUser).getUserName(),Post,postNumber));
                postNumber++;

            } else if (selection == 4) {
                for (int i = posts.size() - 1; i >= 0; i--) {
                    posts.get(i).printPost();

                }

            } else if (selection == 5) {

                for (int i = 0; i < users.size(); i++) {
                    System.out.println((i + 1) + "," + users.get(i).getUserName());
                }
            } else if (selection == 6) {
                exit = true;
            } else {
                System.out.println("that is not a valid option");
            }
        }
    }
}