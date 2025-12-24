package Lab3l11;

import java.util.Scanner;

class SystemConfig{

    private static SystemConfig instance;
    private String serverUrl;
    private int maxConnections;

    private SystemConfig(){
        serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    public static SystemConfig getInstance(){
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUrl(){
        return serverUrl;
    }

    public void setServerUrl(String url){
        this.serverUrl = url;
    }

    public int getMaxConnections(){
        return maxConnections;
    }

    public String setMaxConnections(int count){
        if(count > 0){
            this.maxConnections = count;
            return ""; 
        }
        else{
            return "Invalid Count" + "\n";
        }
    }
}

public class Lab3l11 {
    public static void main(String[] args){
        Scanner Getvalue = new Scanner(System.in);

        StringBuilder finalOutput = new StringBuilder(); 

        System.out.print("Enter Amount Of Your Command: ");

        int N = 0;
        
        if(Getvalue.hasNextInt()){
            N = Getvalue.nextInt();
        }

        Getvalue.nextLine();

        for(int i = 0; i < N; i++){
            System.out.print("Enter Your Command: ");

            String command = Getvalue.nextLine().trim().toUpperCase();

            SystemConfig configInstance = SystemConfig.getInstance();

            if(command.equals("SET_URL")){
                System.out.print("Enter Your URL : ");
                String newUrl = Getvalue.nextLine().trim();
                configInstance.setServerUrl(newUrl);
            }
            else if(command.equals("SET_MAX")){
                System.out.print("Enter Your Max Connection: ");
                
                if(Getvalue.hasNextInt()){
                    int newMax = Getvalue.nextInt();
                    
                    finalOutput.append(configInstance.setMaxConnections(newMax));
                }
                else{
                     System.out.println("Invalid input for Max Connection.");
                }

                Getvalue.nextLine();

            }
            else if (command.equals("SHOW")){
                finalOutput.append("URL: ").append(configInstance.getServerUrl()).append("\n");
                finalOutput.append("MAX: ").append(configInstance.getMaxConnections()).append("\n");
            }
        }

        System.out.println("-------------------------------------------");

        System.out.print(finalOutput.toString());

        Getvalue.close();
    }
}