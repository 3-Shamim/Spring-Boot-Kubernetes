package com.learningstuff.springbootmysqlwithdockerandkubernetes.repositories;

import com.learningstuff.springbootmysqlwithdockerandkubernetes.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ৯/১০/১৯
 * Time: ৮:৩৭ AM
 **/

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
