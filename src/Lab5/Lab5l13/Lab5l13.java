package Lab5.Lab5l13;

import java.util.Scanner;

class User{
    protected String name;

    public User(String name){
        this.name = name ;
    }

    public int getClearanceLevel(){
        return 1 ;
    }
}

class Developer extends User{
    protected int projects;

    public Developer(String name, int projects){
        super(name) ;
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel(){
        return 2 ;
    }
}

class Admin extends Developer{
    protected String adminKey;

    public Admin(String name, int projects, String adimKey){
        super(name, projects);
        this.adminKey = adimKey;
    }

    @Override
    public int getClearanceLevel(){
        return 3;
    }

    public String getAdimKey(){
        return adminKey;
    }
}

public class Lab5l13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Dev name : ");
        String inDevName = scanner.nextLine();

        System.out.print("Enter Projects : ");
        int inputDevProjects = scanner.nextInt();

        scanner.nextLine() ;

        System.out.print("Enter Admin name : ");
        String inAdminName = scanner.nextLine();

        System.out.print("Enter Projects : ");
        int inAdminProjects = scanner.nextInt();


        scanner.nextLine() ;

        System.out.print("Enter Admin key : ");
        String inputKey = scanner.nextLine();

        User user = new User("Guest");

        Developer developer = new Developer(inAdminName, inAdminProjects);

        Admin admin = new Admin(inAdminName, inAdminProjects, inputKey);

        User[] UserOut = new User[3];
        
        UserOut[0] = user;
        UserOut[1] = developer;
        UserOut[2] = admin;

        System.out.println("-----------------------------------");

        int totalclearance = 0 ;

        for(User u : UserOut){
            totalclearance += u.getClearanceLevel();
        }

        for(User u : UserOut){
            if(u instanceof Admin){
                Admin admininputObject = (Admin) u;
                System.out.println(admininputObject.getAdimKey());
            }
        }
        System.out.println(totalclearance);

        scanner.close();
    }
}
