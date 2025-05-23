import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static final String LAVENDER = "\u001B[38;5;183m";

    public static final String AZUL = "\u001B[38;5;159m";

    public static final String CREME = "\u001B[38;5;229m";

    public static final String ROSA = "\u001B[38;5;218m";

    public static final String BROWN = "\u001B[38;5;130m";

    public static final String RESET = "\u001B[0m";

  
    public static void main(String[] args) {

        int opPrincipal = 2;


        System.out.print(LAVENDER + "=================================================" + RESET);
        System.out.print(LAVENDER + "\n" +
                "     _                 _   _            _       \n" +
                "    | | __ ___   _____| |_| |_ ___ _ __(_) __ _ \n" +
                " _  | |/ _` \\ \\ / / _ \\ __| __/ _ \\ '__| |/ _` |\n" +
                "| |_| | (_| |\\ V /  __/ |_| ||  __/ |  | | (_| |\n" +
                " \\___/ \\__,_| \\_/ \\___|\\__|\\__\\___|_|  |_|\\__,_|\n" +
                "                                                \n" + RESET);
        System.out.println(LAVENDER + " \t\t\t\t  ((    ___    \n" +
                " \t\t\t\t   ))  \\___/_  \n" +
                " \t\t\t\t  |" + (BROWN + "~~" + RESET) + (LAVENDER + "| /" + RESET) +
                (BROWN + "~~~" + RESET) + (LAVENDER + "\\ \\" + RESET) + "\n" +
                "\t\t\t\t" + (LAVENDER + " C|__| \\___/" + RESET));

        System.out.println(LAVENDER + "=================================================" + RESET);
        System.out.println(LAVENDER + "\n\n     ✧˖°. Seja bem-vinde a Javetteria! ✧˖°.\n" + RESET);

      
        System.out.println(CREME + "  _______________________ " + RESET);
        System.out.println(CREME + " |                       |" + RESET);
        System.out.println(CREME + " | [1] LOGIN             |" + RESET);
        System.out.println(CREME + " | [2] CADASTRO          |" + RESET);
        System.out.println(CREME + " | [3] SAIR              |" + RESET);
        System.out.println(CREME + " |                       |" + RESET);
        System.out.println(CREME + "  ----------------------- " + RESET);

        System.out.println(CREME + "\n>> Selecione uma opção: " + RESET);
        opPrincipal = input.nextInt();
    
        do{
            switch(opPrincipal){
                case 1:
                    System.out.println("Logando");
                    break;
                case 2:
                    System.out.println("Cadastrando");
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;

            }
        } while (opPrincipal != 3);

    }
}
