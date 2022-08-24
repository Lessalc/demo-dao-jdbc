package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
			
		System.out.println(seller);
		
		System.out.println("=== TEST 2.1: seller findByDepartment using ID 	===");
		
		List<Seller> listaSellersById = sellerDao.findByDepartmentId(2);
		
		System.out.println(listaSellersById);
		
		System.out.println("=== TEST 2.2: seller findByDepartment using Department 	===");
		
		Department dep = departmentDao.findById(1);
		
		listaSellersById = sellerDao.findByDepartment(dep);
		
		System.out.println(listaSellersById);
	}
}
