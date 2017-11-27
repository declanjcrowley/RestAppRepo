package ie.cit.restapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ie.cit.restapp.entites.Person;

import java.util.List;

/*
 * @RepositoryRestResource is allowing people to be used instead of persons
 * /persons would also work in place of people 
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

	/*
	 * http://localhost:8088/people/search/findByLastName?name=Baggins
	 */
	List<Person> findByLastName(@Param("name") String name);
	
	/*
	 * http://localhost:8088/people/search/findById?id=1
	 */
	List<Person> findById(@Param("id") long id);
	
	/*
	 * Enter http://localhost:8088/people/search/returnAllPersons?
	 * and all items will be returned
	 * 
	 * @Query notation only works if class Persons has "@Table notation for 'persons'
	 */
	@Query(value="Select * FROM persons", nativeQuery = true)
	public List<Person> returnAllPersons();

}
