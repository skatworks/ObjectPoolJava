package com.sample.ObjectPool;

public interface ObjectPoolFactory {
	
	/**
	 * createPool
	 * ObjectPool型オブジェクトを生成し、返す
	 * 
	 * @return {@code ObjectPool}
	 */
	ObjectPool createPool();
}
