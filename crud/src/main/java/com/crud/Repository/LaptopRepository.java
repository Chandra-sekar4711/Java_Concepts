package com.crud.Repository;


	
	import com.crud.Model.Laptopmodel;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	@Repository
	public interface LaptopRepository extends JpaRepository<Laptopmodel, Integer> {
	}


