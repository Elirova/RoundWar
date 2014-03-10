package Attacks;

import Entities.LivingEntity;

public class Attack {
	public enum AttackType {NONE, NEAR, RUN, FAR, INAREA, NORMAL, COLLISION};
	private static float damage;
	
	public static boolean doAttack(LivingEntity entity, AttackType type, float posX, float posY, RangeAttack range) {
		if (range.inRange(posX, posY)){
			switch(type) {
			case NEAR:
				entity.updateMana(-10);
				damage = 10;
				break;
			case FAR:
				damage = 60;
				break;
			case RUN:
				damage = 40;
				break;
			case INAREA:
				damage = 80;
				break;
			default:
				damage = 0;
				break;
		}
		} else {
			
		}
		return false;
	}
	
}
