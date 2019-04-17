package ca.esdc.iteam.poc.rest.jpa.restjpa;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ca.esdc.iteam.poc.rest.jpa.restjpa.Address;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends PagingAndSortingRepository<Address, Long>, QuerydslPredicateExecutor<Address> {
}