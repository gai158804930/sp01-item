package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.User;

public interface UserService {
	/**
	 * 获取用户
	 * @param id
	 * @return
	 */
	User getUser(Integer id);
	
	/**
	 * 添加积分
	 * @param id
	 * @param score
	 */
	void addScore(Integer id, Integer score);
}
