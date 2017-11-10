package sachin.learn.design.pattern.creational.factory.weapon_app;

/**
 * 
 * The interface containing method for producing objects.
 * 
 */
public interface Blacksmith {

  Weapon manufactureWeapon(WeaponType weaponType);

}
