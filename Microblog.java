package microblog;
import java.util.Scanner;

public class Microblog {
    static Scanner keyboardInt = new Scanner(System.in);
    static Scanner keyboardString = new Scanner(System.in);

    public static void menu() {
        int menuChoice;
        System.out.println("Main Menu\n" +
                "1) Create a new user\n" +
                "2) Become an existing user\n" +
                "3) Create a post as the current user\n" +
                "4) Print all posts\n" +
                "5) Print all users\n" +
                "");
    }


    public static void main(String[] args) {
        menu();
        int menuChoice = keyboardInt.nextInt();

        if (menuChoice == 1) {

            String userName = "";
            int instanceCounter = 0;
            instanceCounter++;
            int numUsers = instanceCounter;
            String[] users = new String[10];
            users[0] = "N0N@RgL3Z";
            users[1] = "Seeker4Life";
            users[2] = "SPEWForever";
            System.out.println("What is your user name? " + userName);
            userName = keyboardString.nextLine();
            users[numUsers] = userName;
            System.out.println("");

            menu();
            menuChoice = keyboardInt.nextInt();

        }

            if (menuChoice == 2) {
                System.out.println("Which user do you want to become?");
                System.out.println("");
                User[] users = userList();
                printUsers(users);
                System.out.println("");
                String becomeUser;
                becomeUser = keyboardString.nextLine();
                System.out.println("");
                System.out.println("You are " + becomeUser + ". What would you like to do next?");
                System.out.println("");
                menu();
                menuChoice = keyboardInt.nextInt();

            }

            if (menuChoice == 3) {
                String post = "";
                int instanceCounter = 0;
                instanceCounter++;
                int numPosts = instanceCounter;
                String[] postList = new String[10];
                postList[0] = "I got a new bowtruckle.  I've named it Equantia";
                postList[1] = "Did anyone else see that Quidditch match between the Cannons and the Lions?  Unbelievable!";
                postList[2] = "Snargaluffs are real!!!";
                postList[3] = "Elves deserve the vote. ";
                postList[4] = "Last summer, we were on the trail of the snorckack and Father said I could name all of the ones we found.  But, unfortunately, some nargles got us off track. ";
                System.out.println("Please enter your post below.");
                post = keyboardString.nextLine();
                postList[numPosts] = post;
                System.out.println("");
                menu();
                menuChoice = keyboardInt.nextInt();


            }






            if (menuChoice == 4) {
                System.out.println("Here are all of our current posts.");
                System.out.println("");
                Post[] posts = postList();
                printPosts(posts);
            }
            if (menuChoice == 5) {
            System.out.println("Here are all of our current users.");
            System.out.println("");
            User[] users = userList();
            printUsers(users);
            }
        }
        public static User[] userList () {
            User[] users = new User[3];

            users[0] = new User("", "N02N@RgL3Z ", "Luna Lovegood ", "L.Lovegood@Hogwarts.edu");
            users[1] = new User("", "Seeker4Life ", "Ginny Weasley ", "G.M.Weasley@Hogwarts.edu");
            users[2] = new User("", "SPEWForever ", "Hermione Granger ", "H.Granger@Hogwarts.edu");

            return users;


        }

        public static void printUsers (User[]users){

            for (int counter = 0; counter < users.length; counter++)
                System.out.println(users[counter].getUserProfile());
        }

        public static Post[] postList () {

            Post[] posts = new Post[5];

            posts[0] = new Post("I got a new bowtruckle.  I've named it Equantia. ", "N02N@RgL3Z ", 1, "");
            posts[1] = new Post("Did anyone else see that Quidditch match between the Cannons and the Lions?  Unbelievable! ", "Seeker4Life ", 3, "");
            posts[2] = new Post("Snargaluffs are real!!! ", "N02N@RgL3Z ", 4, "");
            posts[3] = new Post("Elves deserve the vote. ", "SPEWForever ", 2, "");
            posts[4] = new Post("Last summer, we were on the trail of the snorckack and Father said I could name all of the ones we found.  But, unfortunately, some nargles got us off track. ", "N02N@Rgl3Z ", 5, "");


            return posts;
        }

        public static void printPosts (Post[]posts){

            for (int counter = 0; counter < posts.length; counter++)
                System.out.println(posts[counter].getPostContent());
        }


    }


