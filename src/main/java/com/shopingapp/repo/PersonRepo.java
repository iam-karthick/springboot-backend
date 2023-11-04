package com.shopingapp.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.shopingapp.model.Person;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepo {

	private List<Person> list = new ArrayList<Person>();

	public void getAll() {
		List<Person> list = List.of(new Person(1, "John", "Developer", true, "1995-01-01"),
				new Person(2, "Karthik", "Banker", false, "1999-01-01"));
		for (Person person : list) {
			list.add(person);
		}

	}

	public List<Person> listPerson() {
		return list;
	}

	public List<Person> search(String name) {
		return list.stream().filter(x -> x.getName().startsWith(name)).collect(Collectors.toList());
	}

	public String add(Person p) {
		Person obj = new Person();
		obj.setId(p.getId());
		obj.setName(p.getName());
		obj.setGender(p.isGender());

		list.add(obj);
		return null;
	}

	public String delete(Integer id) {
		list.removeIf(x -> x.getId() == (id));
		return null;
	}

	public String edit(Person person) {
		int idx = 0;
		int id = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == (person.getId())) {
				id = person.getId();
				idx = i;
				break;
			}
		}

		Person p = new Person();
		p.setId(id);
		p.setName(person.getName());
		p.setGender(person.isGender());
		list.set(idx, p);

		return null;
	}
}
