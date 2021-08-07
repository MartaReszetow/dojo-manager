package com.sda.spring.dojoManager;

import com.sda.spring.dojoManager.dtos.ClubMemberDTO;
import com.sda.spring.dojoManager.dtos.GroupDTO;
import com.sda.spring.dojoManager.dtos.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.sda.spring.dojoManager.UsersRole.USER_COACH;

@Component
public class StartupRunner implements CommandLineRunner {  // klasa która powstanie po starcie, po uruchomieniu beanów uruchomi metodę run


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Witaj w dojo!");


      GroupDTO poczatkujacy = new GroupDTO("poczatkujacy", 130);
      ClubMemberDTO child1 = new ClubMemberDTO("Ala","Niezbedna", LocalDate.of(1994,12,12),poczatkujacy);
      ClubMemberDTO child2 = new ClubMemberDTO("Staś","Niezbedna", LocalDate.of(1999,1,1),poczatkujacy);
      List<ClubMemberDTO> children = new ArrayList<>();
      children.add(child1);
      children.add(child2);
      UserDTO user1 = new UserDTO("JanekNiezbedny", "password", USER_COACH, "Jan", "Niezbedny", "janniezbedy@wp.pl", "+487776663330", children);
      System.out.println("Nowa odoba to:" + user1+ ", Majaca dzieci:"+ child1 + child2);

    }
}