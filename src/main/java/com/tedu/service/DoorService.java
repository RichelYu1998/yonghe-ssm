package com.tedu.service;

import java.util.List;

import com.tedu.pojo.Door;

public interface DoorService {
	/**
	 * 1.查询所有门店信息
	 * @return List<Door>
	 */
	public List<Door> findAll();
	
	/**
	 * 2.根据id删除门店信息
	 * @param id
	 */
	public void deleteById(Integer id);
	
	/**
	 * 3.添加门店信息
	 * @param door
	 */
	public void addDoor(Door door);
	
	/**
	 * 4.根据id查询门店信息
	 * @param id
	 * @returnc
	 */
	public Door findById(Integer id);
	
	/**
	 * 5.根据id修改门店信息
	 * @param door
	 * @return
	 */
	public void updateById(Door door);
	
	
	
	
}
