package DESCISIONMAKINGSTATEMENTS;

public class SwitchStatement {
    public static void main(String[] args) {
        int months = 7;
        String mont = " ";
        switch (months) {
            case 1:
                mont = "1-January";
                break;
            case 2:
                mont = "2-February";
                break;
            case 3:
                mont = "3-March";
                break;
            case 4:
                mont = "4-April";
                break;
            case 5:
                mont = "5-May";
                break;
            case 6:
                mont = "6-June";
                break;
            case 7:
                mont = "7-July";
                break;
            case 8:
                mont = "8-August";
                break;
            case 9:
                mont = "9-September";
                break;
            case 10:
                mont = "10-October";
                break;
            case 11:
                mont = "11-November";
                break;
            case 12:
                mont = "12-December";
                break;
            default:
                System.out.println("invalid month");
                break;
        }
        System.out.println(mont);
    }
}
