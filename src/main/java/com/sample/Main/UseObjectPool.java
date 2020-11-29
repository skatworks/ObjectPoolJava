package com.sample.Main;

import com.sample.ObjectPool.*;

public class UseObjectPool {

	public static void main(String[] args) {
		// poolを使用
		PoolableObjectFactory pof = new MyObject();
		ObjectPoolFactory opf = new GenericObjectPoolFactory(pof);
		ObjectPool op = opf.createPool();
		
		long start_point_pool = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			try {
				MyObject mo = (MyObject) op.borrowObject();
				op.returnObject(mo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		long end_point_pool = System.currentTimeMillis();
		
		// poolを使用しない
		long start_point_nopool = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			try {
				MyObject mo = new MyObject();
				mo = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		long end_point_nopool = System.currentTimeMillis();
		
		System.out.println("プールを使用した場合に、要した時間＝" + (end_point_pool - start_point_pool));
		System.out.println("プールを使用せずに都度newした場合に、要した時間＝" + (end_point_nopool - start_point_nopool));
	}

}
