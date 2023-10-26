package com.mx.tec.people.people2.controller;

import com.mx.tec.people.people2.dto.PeopleVO;
import com.mx.tec.people.people2.exception.PeopleDataException;
import com.mx.tec.people.people2.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.mx.tec.people.people2.commons.Constants.*;

@RestController
@RequestMapping("/v1/people")
public class PeopleController {

    private PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }


    @PostMapping(value = "")
    public @ResponseBody PeopleVO created(@RequestBody PeopleVO peopleEntity) {
        return this.peopleService.crated(peopleEntity);
    }

    @GetMapping()
    public List<PeopleVO> getPeopleAll() throws PeopleDataException {
        return this.peopleService.getPeopleAll();
    }

    @GetMapping("/{id}")
    public PeopleVO getPeopleById(@PathVariable Integer id) throws  PeopleDataException{

        return this.peopleService.getPeopleById(id);
    }
    @PutMapping
    public PeopleVO updatePeople(@RequestBody PeopleVO peopleEntity) throws  PeopleDataException{
        return this.peopleService.updatePeople(peopleEntity);
    }
    @DeleteMapping("/{id}")
    public PeopleVO deletePeople(@PathVariable Integer id) throws PeopleDataException{
       return this.peopleService.deletePeople(id);
    }

}
