package com.sample.ObjectPool;

import java.util.LinkedList;

public class GenericObjectPool extends BaseObjectPool implements ObjectPool {

	private PoolableObjectFactory _factory = null;
	private LinkedList<Object> _pool = null;
	
	/**
	 * コンストラクタ
	 */
	public GenericObjectPool(PoolableObjectFactory pof) {
		_factory = pof;
		_pool = new LinkedList<Object>();
	}
	
	@Override
	public Object borrowObject() throws Exception {
		try {
			if (_pool == null || _pool.size() == 0) {
				return _factory.makeObject();
			} else {
				return _pool.removeFirst();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void returnObject(Object obj) throws Exception {
		_pool.addLast(obj);
	}

}
