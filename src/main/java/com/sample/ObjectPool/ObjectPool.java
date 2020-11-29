package com.sample.ObjectPool;

public interface ObjectPool {
	Object borrowObject() throws Exception;
	void returnObject(Object obj) throws Exception;
}
