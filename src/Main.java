//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        int a = 79;
        if (a>51 && a<101) {
            System.out.println("Число " +a+ " міститься в проміжку 51;101");
        }
        else
        {
            System.out.println(" Число " +a+ " не міститься в проміжку 51;101");
        }
        //2

        int n = 534;
        n= Math.abs(n);
        int firstNumber = n/100;
        int secondNumber = (n/10)%10;
        int thirdNumber = n%10;
        int maxNumber = Math.max(Math.max(firstNumber,secondNumber),thirdNumber);
        System.out.println("Найбільша цифра "+n+ " це-" +maxNumber);
        //3
        String direction = "До низу";
        int floor = 4;
        if (direction=="До гори" && floor==1){
            System.out.println("Ви піднялись на 1 поверх");
        } else if (direction=="До гори" && floor==2) {
            System.out.println("Ви піднялись на 3 поверх");
        } else if (direction=="До гори" && floor==3) {
            System.out.println("Ви піднялись на 3 поверх");
        } else if (direction=="До гори" && floor==4) {
            System.out.println("Ви піднялись на 4 поверх");
        } else if (direction=="До гори" && floor==5) {
            System.out.println("Ви піднялись на 5 поверх");
        }else if (direction=="До гори" && floor==6) {
            System.out.println("Ви піднялись на 6 поверх");
        }else if (direction=="До гори" && floor==7) {
            System.out.println("Ви піднялись на 7 поверх");
        }else if (direction=="До гори" && floor==8) {
            System.out.println("Ви піднялись на 8 поверх");
        }else if (direction=="До гори" && floor==9) {
            System.out.println("Ви піднялись на 9 поверх");
        }else if (direction=="До низу" && floor==1) {
            System.out.println("Ви спустились на 1 поверх");
        }else if (direction=="До низу" && floor==2) {
            System.out.println("Ви спустились на 1 поверх");
        }else if (direction=="До низу" && floor==3) {
            System.out.println("Ви спустились на 3 поверх");
        }else if (direction=="До низу" && floor==4) {
            System.out.println("Ви спустились на 4 поверх");
        }else if (direction=="До низу" && floor==5) {
            System.out.println("Ви спустились на 5 поверх");
        }else if (direction=="До низу" && floor==6) {
            System.out.println("Ви спустились на 6 поверх");
        }else if (direction=="До низу" && floor==7) {
            System.out.println("Ви спустились на 7 поверх");
        }else if (direction=="До низу" && floor==8) {
            System.out.println("Ви спустились на 8 поверх");
        }else if (direction=="До низу" && floor==9) {
            System.out.println("Ви спустились на 9 поверх");
        }else {
            System.out.println("Ви вказали неіснуючий поверх!");
        }
        //4
        String option = "x";
        switch(option) {
            case"Так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Невідома операція");

        }
    }
}
