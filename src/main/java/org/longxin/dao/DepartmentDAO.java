package org.longxin.dao;

import java.util.List;

import org.longxin.domains.Department;

/**
 * comments
 * @author zer8szh
 *
 */
public interface DepartmentDAO {

	public List<Department> getAllDepartments();
	
	public void deleteDepartmentByID(int departmentID);

	public void saveDepartment(Department department);
}
