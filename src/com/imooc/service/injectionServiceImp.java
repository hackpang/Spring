package com.imooc.service;

import com.imooc.Dao.injectionDao;

public class injectionServiceImp implements injectionService{
	private injectionDao injectionDao;
	//��ֵע��
	public void setInjectionDao(injectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}

	public void save(String arg) {
		//ģ��ҵ�����
		System.out.println("service���ܲ���"+arg);
		arg = arg+":"+this.hashCode();
		injectionDao.save(arg);
	}

}
