package ie.cit.restapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ie.cit.restapp.entites.Item;

import java.util.List;

/*
 * @RepositoryRestResource is allowing people to be used instead of persons
 * /persons would also work in place of people 
 */
@RepositoryRestResource(collectionResourceRel = "items", path = "items")
public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {

	/*
	 * http://localhost:8088/people/search/findByLastName?name=Baggins
	 * returns entry
	 */
	List<Item> findByName(@Param("name") String name);
	
	List<Item> findById(@Param("id") long id);
	
	/*
	 * Enter http://localhost:8088/items/search/returnAllItems?
	 * and all items will be returned
	 */
	@Query(value="Select * FROM items", nativeQuery = true)
	public List<Item> returnAllItems();
}

