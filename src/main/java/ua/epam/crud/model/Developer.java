package ua.epam.crud.model;

import java.util.HashSet;
import java.util.Set;

public class Developer {
     private Long id;
     private String name;
     private Set<Skill> skills;
     private Account account;

     public Developer(Long id, String name, HashSet<Skill> skills, Account account) {
          this.id = id;
          this.name = name;
          this.skills = skills;
          this.account = account;
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Set<Skill> getSkills() {
          return skills;
     }

     public void setSkills(HashSet<Skill> skill) {
          this.skills = skill;
     }

     public Account getAccount() {
          return account;
     }

     public void setAccount(Account account) {
          this.account = account;
     }

     @Override
     public String toString() {
          return "\n\nDeveloper: id=" + id +"; name: " + name +
                  "\n" + skills +
                  "\n" + account;
     }
}
