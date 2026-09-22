package chnu.edu.websecurity26.repository;


/*
  @author   george
  @project   web-security26
  @class  ItemRepository
  @version  1.0.0 
  @since 22/09/2026 - 11.35
*/

import chnu.edu.websecurity26.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
}
