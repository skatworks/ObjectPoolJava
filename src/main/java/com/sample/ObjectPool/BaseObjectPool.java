package com.sample.ObjectPool;

public abstract class BaseObjectPool implements ObjectPool {

	public abstract Object borrowObject() throws Exception;
	public abstract void returnObject(Object obj) throws Exception;
}
