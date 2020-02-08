package org.lanqiao.entity;

import java.util.HashMap;
import java.util.List;

public interface studentMapper {
	
   Student queryStudentById(int id);
   List<Student> queryAllstudent();
   void  addStudent(Student student);
   void updateStudent(Student student);
   void deleteStudentById(int id);
   Student  selectConver(int id);
   List<Student> queryOrderClun(String clum);
   List<Student> queryIdorName(Student student);
   List<Student> queryAdress(Student student);
  void callquery(HashMap<String,Object> HashMap);
  List<Student> queryForech(List<Integer> list);
  Dept queryonetoone(int id);
    Class queryonetomore(int classid);
}
