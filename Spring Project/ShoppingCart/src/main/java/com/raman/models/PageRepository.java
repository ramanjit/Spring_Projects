package com.raman.models;


 import org.springframework.data.jpa.repository.JpaRepository;

/* CrudRepository provides generic CRUD operations 
and extends Repository which is base class  for all 
repository providing access to data stores.

Page represent - Page.java
Integer represent - Id in page


JPARepositiory ----->   PagingAndSortingRepository   ---> CrudRepository
*/
public interface PageRepository extends JpaRepository<Page, Integer> {

	
	
}
