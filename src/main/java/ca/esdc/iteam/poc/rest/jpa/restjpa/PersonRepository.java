package ca.esdc.iteam.poc.rest.jpa.restjpa;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ca.esdc.iteam.poc.rest.jpa.restjpa.Person;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>, QuerydslPredicateExecutor<Person> {

    @Override
    @RestResource(exported = false)
    void delete(Person entity);

    @Override
    @RestResource(exported = false)
    void deleteAll();

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Person> entities);

    @Override
    @RestResource(exported = false)
    void deleteById(Long aLong);

    @RestResource(path = "byLastName", rel = "findByLastName")
    Person findByLastName(@Param("lastName") String lastName);
    
    @RestResource(path = "byFirstName", rel = "findByFirstName")
    Person findByFirstName(@Param("firstName") String firstName);
    
    @RestResource(path = "byFirstAndLastName", rel = "findByFirstNameAndLastName")
    Person findByFirstNameAndLastName(@Param("firstName") String firstName,@Param("lastName") String lastName);
}