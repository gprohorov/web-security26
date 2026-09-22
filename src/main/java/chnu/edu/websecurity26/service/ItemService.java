package chnu.edu.websecurity26.service;


/*
  @author   george
  @project   web-security26
  @class  ItemService
  @version  1.0.0 
  @since 02/09/2026 - 21.10
*/

import chnu.edu.websecurity26.model.Item;
import chnu.edu.websecurity26.repository.ItemRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    private List<Item> items = new ArrayList<>();

    {
        items.add(new Item("1", "name1", "description1"));
        items.add(new Item("2", "name2", "description2"));
        items.add(new Item("3", "name3", "description3"));
    }

    @PostConstruct
    void init(){
        itemRepository.deleteAll();
      items.forEach(this::createItem);

    }

   public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

   public Item createItem(Item item){
//item.setCreatedBy("George");

        return itemRepository.save(item);
   }

   public Item getItem(String id){
        return itemRepository.findById(id).orElse(null);
   }

   public Item updateItem(Item item){
       return itemRepository.save(item);
   }

   public void deleteItem(String id){
        itemRepository.deleteById(id);
   }
}
