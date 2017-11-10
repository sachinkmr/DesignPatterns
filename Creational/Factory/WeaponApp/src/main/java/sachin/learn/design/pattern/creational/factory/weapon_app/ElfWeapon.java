package sachin.learn.design.pattern.creational.factory.weapon_app;

/**
 * ElfWeapon.
 */
public class ElfWeapon implements Weapon {

  private WeaponType weaponType;

  public ElfWeapon(WeaponType weaponType) {
    this.weaponType = weaponType;
  }

  @Override
  public String toString() {
    return "Elven " + weaponType;
  }

  public WeaponType getWeaponType() {
    return weaponType;
  }
}
