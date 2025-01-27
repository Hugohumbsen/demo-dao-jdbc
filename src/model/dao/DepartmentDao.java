package model.dao;

import java.util.List;

import model.entites.Department;

public interface DepartmentDao {
	
	void insert (Department obj);
	void update(Department obj);
	void deleteByid(Integer id);
	Department finById(Integer id);
	List<Department> findAll();
	
	
}
