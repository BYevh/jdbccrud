package ua.epam.crud.controller;

import ua.epam.crud.model.Skill;
import ua.epam.crud.repository.io.SkillRepository;

import java.io.IOException;
import java.util.ArrayList;

public class SkillController {
    private final String INPUT_ID = "Input new ID:";
    private final String INPUT_SKILL = "Input new SKILL:";

    private SkillRepository skillRepository = new SkillRepository();
    private UtilsController utilsController = new UtilsController();

    public ArrayList<Skill> menuOfSkills() throws IOException {
        ArrayList<Skill> listOfSkills = skillRepository.getAll();


        int item;
        do {
            item = Integer.parseInt(utilsController.inputData());
            switch (item) {
                case 1: {                                           //1. Show all skills.
                    System.out.println(listOfSkills);
                    break;
                }
                case 2: {                                           //2. Add new skill.
                    System.out.println(INPUT_ID);
                    Long id = Long.parseLong(utilsController.inputData());
                    System.out.println(INPUT_SKILL);
                    String skill = utilsController.inputData();
                    listOfSkills = skillRepository.create(new Skill (id, skill));
                    System.out.println(listOfSkills);
                    break;
                }
                case 3: {                                           //3. Exit
                    break;
                }
            }
        } while (item != 3);

        return listOfSkills;
    }



}
