public class main {
    public static void main(String[] args) {
        int personalAccount = 1000;
        int bonusReplenishment = 0;
        int replenishment = 200;
        if (bonusReplenishment >= 1000)
        System.out.println("bonusReplenishment = true");

        {bonusReplenishment = replenishment / 100;}
        System.out.println(bonusReplenishment + replenishment + personalAccount);

    }
}
