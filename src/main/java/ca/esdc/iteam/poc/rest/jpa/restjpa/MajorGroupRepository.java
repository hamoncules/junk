package ca.esdc.iteam.noc;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ca.esdc.iteam.noc.MajorGroup;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "majorgroup", path = "majorgroup")
public interface MajorGroupRepository extends PagingAndSortingRepository<MajorGroup, Long>, QuerydslPredicateExecutor<MajorGroup> {
}