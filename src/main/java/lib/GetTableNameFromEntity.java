package lib;

import javax.persistence.Entity;

import exceptions.NotEntityException;

public class GetTableNameFromEntity {
	public static String getTableName(Class entityClass) {
		Entity entityAnnotation = (Entity) entityClass.getAnnotation(Entity.class);
		if (entityAnnotation == null) {
			throw new NotEntityException(entityClass);
		} else {
			String name = entityAnnotation.name();
			if (name == null) {
				return entityClass.toString();
			} else {
				return name;
			}
		}		
	}
}
