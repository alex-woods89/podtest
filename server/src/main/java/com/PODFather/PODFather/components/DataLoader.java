package com.PODFather.PODFather.components;

import com.PODFather.PODFather.models.Item;
import com.PODFather.PODFather.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ItemRepository itemRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){
        Item item1 = new Item("Acme Waste", "Left Over City", 2019, 1, "Sewage", 221, 200);
        itemRepository.save(item1);

        Item item2 = new Item("Sim City Council", "Mega Depot", 2018, 1, "Mixed", 596, 105);
        itemRepository.save(item2);

        Item item3 = new Item("Acme's Recycling", "Acme Compost Silo", 2019, 1, "Food Waste", 527, 567);
        itemRepository.save(item3);

        Item item4 = new Item("Acme Waste", "Left Over City", 2019, 2, "Sewage", 206, 254);
        itemRepository.save(item4);

        Item item5 = new Item("Sim City Council", "Mega Depot", 2018, 2, "Mixed", 226, 527);
        itemRepository.save(item5);

        Item item6 = new Item("Acme's Recycling", "Acme Compost Silo", 2019, 2, "Food Waste", 226, 157);
        itemRepository.save(item6);

        Item item7 = new Item("Acme Waste", "Left Over City", 2019, 3, "Sewage", 134, 112);
        itemRepository.save(item7);

        Item item8 = new Item("Sim City Council", "Mega Depot", 2018, 3, "Mixed", 111, 226);
        itemRepository.save(item8);

        Item item9 = new Item("Acme's Recycling", "Acme Compost Silo", 2019, 4, "Sewage", 198, 0 );
        itemRepository.save(item9);

        Item item10 = new Item("Acme Waste", "Left Over City", 2019, 4, "Sewage", 539, 540);
        itemRepository.save(item10);

        Item item11 = new Item("Acme Waste",	"Left Over Farm",	2019,	4,	"Agriculture",	195,	105);
        itemRepository.save(item11);

        Item item12 = new Item("Sim City Council", 	"Mega Depot",	2018,	4,	"Sewage",	135, 0);
        itemRepository.save(item12);

        Item item13 = new Item("Acme's Recycling",	"Acme Compost Silo",	2019,	4,	"Food Waste",	235,	160);
        itemRepository.save(item13);

        Item item14 = new Item("Acme's Recycling",	"Acme Compost Silo",	2019,	4,	"Food Waste",	235,	160);
        itemRepository.save(item14);

        Item item15 = new Item("Acme Waste",	"Left Over City",	2019,	5,	"Sewage",	567, 0	);
        itemRepository.save(item15);

        Item item16 = new Item("Acme Waste",	"Left Over Farm",	2019,	5,	"Agriculture",	132,	568);
        itemRepository.save(item16);

        Item item17 = new Item("Sim City Council", 	"Mega Depot",	2018,	5,	"Sewage",	231,	206);
        itemRepository.save(item17);

        Item item18 = new Item("Acme's Recycling",	"Acme Compost Silo",	2019,	5,	"Food Waste",	494,	528);
        itemRepository.save(item18);

        Item item19 = new Item("Acme Waste",	"Left Over City",	2019,	6,	"Sewage",	157,	158);
        itemRepository.save(item19);

        Item item20 = new Item("Acme Waste",	"Left Over Farm",	2019,	6,	"Agriculture",	152,	201);
        itemRepository.save(item20);

        Item item21 = new Item("Sim City Council", 	"Mega Depot",	2018,	6,	"Mixed",	536,	134);
        itemRepository.save(item21);







    }

}
