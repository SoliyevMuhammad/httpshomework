package com.example.lesson_72_3.repository;

import com.example.lesson_72_3.entity.StudentEntity;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
//StudentEntity findByPhone(String phone);
Optional<StudentEntity> findByPhone(String phone);//from StudentEntity where phone=:phone
    List<StudentEntity> findByName(String name);//from StudentEntity where name=:name
    List<StudentEntity>findAllByName(String name);//from StudentEntity where name=:name
    //from StudentEntity where name=:name and surname=:surname
    StudentEntity findByNameAndSurname(String name, String surname);
    //from StudentEntity where name=:name or phone=phone
    StudentEntity findByNameOrPhone(String name, String phone);
    //from StudentEntity where age between =:ageFrom and :ageTo
    StudentEntity findByAgeBetween (Integer ageFrom, Integer ageTo);
    StudentEntity findByCreatedDateBetween(LocalDateTime dateFrom, LocalDateTime dateTo);
    //-- 01.04.2023 00:00:00
    //01.04.2023 12:50
    //02.04.2023 12:50
    //03.04.2023 12:50
    //04.04.2023 12:50
    List<StudentEntity> findByNameOrSurnameLikeOrAgeBetween(String name, String surname,
                                                            Integer ageFrom, Integer ageTo);
    List <StudentEntity> findByNameOrderByAge (String name);
    List<StudentEntity>findFirstBySurnameOrderByAge(String name); //limit 1;

}
