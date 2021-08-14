import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + "нажмите чтобы выстрелить"
                        + " -1 чтобы выйти%n",
                player.getSlotCount()
        );

        int slot;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            slot = scanner.nextInt();
            if (slot == -1) {
                System.out.println("Вы вышли из программы");
                break;
            }
            player.shotWithWeapon(slot - 1);
        }
    }
}