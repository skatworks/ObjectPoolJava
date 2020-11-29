package com.sample.ObjectPool;

public interface PoolableObjectFactory {
	
	/**
	 * makeObject
	 * 
	 * @return Object
	 * @throws Exception
	 */
	Object makeObject() throws Exception;

	/**
	 * destroyObject
	 * 
	 * @throws Exception
	 */
	void destroyObject() throws Exception;
}
