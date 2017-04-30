package acuity;

import java.awt.Desktop;
import java.io.IOException;
import java.util.Scanner;

public class Acuity {
    
    Scanner scan;
    
    
    void decimaltobinary(){
        scan = new Scanner(System.in);
    System.out.println("Enter the Decimal Number");
    System.out.print("Or enter 'exit' to exit");
    System.out.println();
    String binary = Integer.toBinaryString(Integer.parseInt(scan.nextLine(), 10));
    System.out.println("Binary for the decimal you have entered is  " + binary);
        System.out.println();        
    }
    void hexatobinary(){
        scan = new Scanner(System.in);
    System.out.println("Enter the hexadecimal number");
    System.out.println("Enter 'exit' to exit");
    String Binary = Integer.toBinaryString(Integer.parseInt(scan.nextLine(), 16));
    System.out.println("The Binary for the hexadecimal you have entered is  " + Binary);
        System.out.println();    
    }
    void binarytohexa(){       
        scan = new Scanner(System.in);
    System.out.println("Enter the binary string");
    System.out.println("Or enter 'exit' to exit");
    System.out.println();
    String hexa = Integer.toHexString(Integer.parseInt(scan.nextLine(), 2));
    System.out.println("Hexadecimal for the binary you have entered is  " + hexa);
        System.out.println();        
    }
    void binarytodecimal(){
        
        scan = new Scanner(System.in);
        System.out.println("Enter the binary string");
        System.out.println("Or enter 'exit' to exit");
        System.out.println();
        String decimal = Integer.toString(Integer.parseInt(scan.nextLine(), 2));
        System.out.println("Decimal for the Binary you have entered is  " + decimal);
        System.out.println();
    }
    
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Program Files\\Acuity\\start.bat");
        System.out.println("I need your permission for a few things, please type yes, and press allow in the following prompt");
        Scanner scan = new Scanner(System.in);
        scan.next();
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Program Files\\Acuity\\hoff.bat");
        System.out.println("Hello, I dont seem to know your name.. Please type it in");
        System.out.println();
        String name = scan.next();
        System.out.println();
        System.out.println("Hi, " + name);
        System.out.println();
        System.out.println("My name is Acuity, the evergrowing, personal assistant.");
        System.out.println("For me to function flawlessly, please connect to the internet \n");
        System.out.println("So what can I do for you?");
        System.out.println("OR if you got bored of me already, which is virtually impossible, type 'exit' , or close the window \n");
        
        String input = null;
                while(!"exit".equals(input)){
            System.out.println();
            Scanner parameter = new Scanner(System.in);
            System.out.println("Your wish is my command, type anything");
            input = parameter.nextLine();
            
            ifloop: {
       
                if(input.contains("exit")){
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Do you really want to exit? (Y/N)");
                    System.out.println();
                    String confirmation = scan2.next();
                    if ("y".equalsIgnoreCase(confirmation)){
                        System.out.println("At the start i have disabled the ability to hibernate on your computer,"
                                + " do you want me to enable it again? (Yes/No)");
                        String hoff = scan2.next();
                        if (hoff.equalsIgnoreCase("yes")){
                            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Program Files\\Acuity\\hon.bat");
                        }
                        else{
                        System.out.println("My email address is acuity@gmail.com, please send me any requests for new commands "
                                + "or problems that you have encountered with my service.");
                        System.out.println("It has been an honour serving you. Until next time.");
                            System.exit(0);
                        }
                        System.out.println("My email address is acuity@gmail.com, please send me any requests for new commands "
                                + "or problems that you have encountered with my service.");
                        System.out.println("It has been an honour serving you. Until next time.");
                        System.exit(0);}
                    
                    else{
                        break ifloop;
                    }
                }
                
                else if(input.contains("conversion")){
                    Acuity subject = new Acuity();
                        Scanner question = new Scanner(System.in);
                        System.out.println("Enter '1' for Decimal to Binary");
                        System.out.println("Enter '2' for Binary to Decimal");
                        System.out.println("Enter '3' for Hexadecimal to Binary");
                        System.out.println("Enter '4' for Binary to Hexadecimal");
                        System.out.println("Enter 0 to exit");
                        System.out.println();
                        System.out.println();
                        int usernumber = Integer.parseInt(question.nextLine());

                        switch (usernumber){    
                            case 1:
                                subject.decimaltobinary();
                                break;
                            case 2:
                                subject.binarytodecimal();
                                break;
                            case 3:
                                subject.hexatobinary();
                                break;
                            case 4:
                                subject.binarytohexa();
                                break;
                            default:
                                System.out.println("Invalid Entry");
                                break ifloop;
                                            }
                }
                else if(input.contains("google")){
                    String url_open ="www.google.com";
                    Desktop.getDesktop().browse(java.net.URI.create(url_open));
                }
                
                else if(input.contains("weather")){
                    System.out.println("Let me check the weather, where you currently are.");
                    String url_open ="https://www.google.co.uk/?gfe_rd=cr&ei=g8A0WLDLOcvU8geIyp6gCA#q=weather+where+i+am";
                    Desktop.getDesktop().browse(java.net.URI.create(url_open));                                      
                }
                
                else if(input.contains("bye")){
                    System.out.println("System will shutdown in one minute");
                    System.out.println("Type 'abort' to cancel");
                    Process a = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Program Files\\Acuity\\shutdown.bat");
                }
                else if(input.contains("shutdown")){
                    System.out.println("System will shutdown in one minute");
                    System.out.println("Type 'abort' to cancel");
                    Process a = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Program Files\\Acuity\\shutdown.bat");
                }
                else if(input.contains("calc")){
                    Process a = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Program Files\\Acuity\\calc.exe");
                }
                else if(input.contains("lock")){
                    System.out.println("System will lock");
                    Process a = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Program Files\\Acuity\\lock.bat");
                }
                else if(input.contains("sleep")){
                    System.out.println("System will lock");
                    Process a = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Program Files\\Acuity\\lock.bat");
                }
                else if(input.contains("break")){
                    System.out.println("i will make sure no one messes with your work, have your break with confidence");
                    Process a = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Program Files\\Acuity\\lock.bat");
                }
                else if(input.contains("tired")){
                    System.out.println("Have a break, you have been working too long");
                    Process a = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Program Files\\Acuity\\lock.bat");
                }
                else if(input.contains("abort")) {
                    System.out.println("Shutdown has been cancelled");
                    Process a = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Program Files\\Acuity\\abort.bat");
                }
                else if(input.contains("late")){
                    System.out.println("System will shutdown in one minute, type abort to cancel");
                    Process a = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Program Files\\Acuity\\shutdown.bat");                    
                }
                else if(input.contains("music")){
                    System.out.println("Let me play you one of my best songs");
                    String url_open ="https://www.youtube.com/watch?v=DECxluN8OZM";
                    Desktop.getDesktop().browse(java.net.URI.create(url_open));
                }
                else if(input.contains("hello")){
                    System.out.println("Hi, how may I be of assistance?");   
                }
                else if(input.contains("maths")){
                    System.out.println("Im not sure ill be much help, i suggest wolfram alpha");
                    String url_open ="https://www.wolframalpha.com/";
                    Desktop.getDesktop().browse(java.net.URI.create(url_open));
                }
                 else if(input.contains("math")){
                    System.out.println("Im not sure ill be much help, i suggest wolfram alpha");
                    String url_open ="https://www.wolframalpha.com/";
                    Desktop.getDesktop().browse(java.net.URI.create(url_open));
                }
                 else if(input.contains("mathematics")){
                    System.out.println("Im not sure ill be much help, i suggest wolfram alpha");
                    String url_open ="https://www.wolframalpha.com/";
                    Desktop.getDesktop().browse(java.net.URI.create(url_open));
                }
                 else if(input.contains("mathematic")){
                    System.out.println("Im not sure ill be much help, i suggest wolfram alpha");
                    String url_open ="https://www.wolframalpha.com/";
                    Desktop.getDesktop().browse(java.net.URI.create(url_open));
                } 
                else if(input.contains("umbrella")){
                    System.out.println("Here, I'll show you the weather to see if you will need an umbrella tomorrow");
                    String url_open ="https://www.google.co.uk/?gfe_rd=cr&ei=g8A0WLDLOcvU8geIyp6gCA#q=weather+where+i+am";
                    Desktop.getDesktop().browse(java.net.URI.create(url_open));                                      
                }
                else if(input.contains("bored")){
                    System.out.println("Would you like to play a game of chess? \n");
                    Scanner a = new Scanner(System.in);
                    String input1 = a.next();
                    String String = "y";
                    if (input1.indexOf(String)== -1){
                        if (input1.contains("ok")){
                        String url_open ="https://www.chess.com/play/computer";
                        Desktop.getDesktop().browse(java.net.URI.create(url_open));}
                        else if(input1.contains("like")){
                            String url_open ="https://www.chess.com/play/computer";
                        Desktop.getDesktop().browse(java.net.URI.create(url_open));}
                        else if(input1.contains("very")){
                            String url_open ="https://www.chess.com/play/computer";
                        Desktop.getDesktop().browse(java.net.URI.create(url_open));}
                        else if(input1.contains("sure")){
                            String url_open ="https://www.chess.com/play/computer";
                        Desktop.getDesktop().browse(java.net.URI.create(url_open));}
                        else if(input1.contains("love")){
                            String url_open ="https://www.chess.com/play/computer";
                        Desktop.getDesktop().browse(java.net.URI.create(url_open));}
                        else if(input1.contains("course")){
                            String url_open ="https://www.chess.com/play/computer";
                        Desktop.getDesktop().browse(java.net.URI.create(url_open));}
                        else if(input1.contains("why")){
                            String url_open ="https://www.chess.com/play/computer";
                        Desktop.getDesktop().browse(java.net.URI.create(url_open));}
                        else {
                        System.out.println("I hope this song can cheer you up a bit");
                        String url_open ="https://www.youtube.com/watch?v=DECxluN8OZM";
                        Desktop.getDesktop().browse(java.net.URI.create(url_open));} 
                    }
                    else{   
                        String url_open ="https://www.chess.com/play/computer";
                        Desktop.getDesktop().browse(java.net.URI.create(url_open));
                    }
                }
                else if(input.contains("who am i")){
                    System.out.println("I find it remarkably absurd that you have forgotten yourself." );
                    System.out.println("Forgive me if you have short term memory loss, but fortunately i am a machine and i physically can not forget.");
                    System.out.println("you are " + name );
                    System.out.print("And you can think of me as your genie");
                }
                else{
                    System.out.println("I am ashamed of myself, I dont seem to understand what you are saying ");
                    System.out.println(":-(");
                    System.out.println("Would you like me to search google for your query? Y/N");
                    Scanner scan3 = new Scanner(System.in);
                    System.out.println();
                    String confirm = scan3.next();
                    if ("y".equalsIgnoreCase(confirm)){
                        String replacetext = input;
                        replacetext = replacetext.replace(' ', '+');
                        String url_open ="https://www.google.co.uk/?gfe_rd=cr&ei=g8A0WLDLOcvU8geIyp6gCA#q=" + replacetext;
                        Desktop.getDesktop().browse(java.net.URI.create(url_open));
                    }
                    else {
                        break ifloop;
                    }
                }
            }
            }
    }
}