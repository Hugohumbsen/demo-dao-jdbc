package model.dao;

import java.util.List;

import model.entites.Seller;

public interface SellerDao {
	void insert (Seller seller);
	void update(Seller obj);
	void deleteByid(Integer id);
	Seller finById(Integer id);
	List<Seller> findAll();

}
