public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Automat(),
                new Gun(),
                new RPG(),
                new Slingshot(),
                new Waterpistol()
        };
    }

    public int getSlotCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        Weapon weapon = weaponSlots[slot];

        weapon.shot();
    }
}