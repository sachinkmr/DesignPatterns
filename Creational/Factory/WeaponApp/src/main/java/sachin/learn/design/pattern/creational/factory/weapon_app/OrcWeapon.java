package sachin.learn.design.pattern.creational.factory.weapon_app;

/**
 * OrcWeapon.
 */
public class OrcWeapon implements Weapon {

  private WeaponType weaponType;

  public OrcWeapon(WeaponType weaponType) {
    this.weaponType = weaponType;
  }

  @Override
  public String toString() {
    return "Orcish " + weaponType;
  }

  public WeaponType getWeaponType() {
    return weaponType;
  }
}
