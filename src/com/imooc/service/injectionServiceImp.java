package com.imooc.service;

import com.imooc.Dao.injectionDao;

public class injectionServiceImp implements injectionService{
	private injectionDao injectionDao;
	//设值注入
	public void setInjectionDao(injectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}

	public void save(String arg) {
		//模拟业务操作
		System.out.println("service接受参数"+arg);
		arg = arg+":"+this.hashCode();
		injectionDao.save(arg);
	}

}
