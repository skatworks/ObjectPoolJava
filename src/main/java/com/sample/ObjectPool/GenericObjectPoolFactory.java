package com.sample.ObjectPool;

public class GenericObjectPoolFactory implements ObjectPoolFactory {

	protected PoolableObjectFactory _factory = null;
	
	/**
	 * コンストラクタ
	 */
	public GenericObjectPoolFactory(PoolableObjectFactory pof) {
		_factory = pof;
	}

	/**
	 * createPool
	 * ObjectPool型オブジェクトを生成し、返す
	 * 
	 * @return {@code ObjectPool}
	 */
	public ObjectPool createPool() {
		return new GenericObjectPool(_factory);
	}

}
