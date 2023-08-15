package lesson6;

public class NestedSwitchRest {

    public static void main(String[] args) {

        String storageName = "Alpha";
        int gateNumber = 2;

        switch (storageName){

            case "Alpha":
                System.out.println("Storage Alpha");
                switch (gateNumber){
                    case 1:
                        System.out.println("Gate number 1");
                        break;
                    case 2:
                        System.out.println("Gate number 2");
                        break;
                    case 3:
                        System.out.println("Gate number 3");
                        break;
                    default:
                        System.out.println("Gate is not found");
                }
                break;
            case "Beta":
                System.out.println("Storage Beta");
                break;
            case "Gamma":
                System.out.println("Storage Gamma");
                break;
            default:
                System.out.println("Invalid storages name");
                break;
        }

    }
}
