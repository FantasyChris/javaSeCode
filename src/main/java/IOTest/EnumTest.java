package IOTest;

public class EnumTest {
    public static void main(String[] args) {
        switch (HeroTypeEnum.ASSASSIN){
            case TANK:
                System.out.println("坦克");
                break;
            case FARMING:
                System.out.println("伐木");
                break;
            case PUSH:
                System.out.println("推进");
                break;
            case ASSASSIN:
                System.out.println("辅助");
                break;
        }
    }
}
