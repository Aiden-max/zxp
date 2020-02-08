package org.lanqiao.entity;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMyBatis {
	//查询单个
	public static void queryStudentById(int id) throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml") ;
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
		//session - connection
		SqlSession session = sessionFactory.openSession() ;
		
		studentMapper studentMapper = session.getMapper(studentMapper.class);
		Student person=studentMapper.queryStudentById(id);
		System.out.println(person);
		session.close(); 
	}
	public static void queryAllstudent() throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml") ;
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
		//session - connection
		SqlSession session = sessionFactory.openSession() ;
		studentMapper studentMapper = session.getMapper(studentMapper.class);
		List<Student> persons = studentMapper.queryAllstudent();
		System.out.println(persons);
		session.close(); 
	}
	public static void addstudent() throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml") ;
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
		//session - connection
		SqlSession session = sessionFactory.openSession() ;
		studentMapper studentMapper = session.getMapper(studentMapper.class);
		Student student =new Student(3,"xuqq",5,false,null);
		studentMapper.addStudent(student);
		
		//提交事务
		session.commit();
		System.out.println("增加成功");
		
		session.close(); 
	}
	public static void deleteStudentById(int id) throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml") ;
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
		//session - connection
		SqlSession session = sessionFactory.openSession() ;
		studentMapper studentMapper = session.getMapper(studentMapper.class);
		studentMapper.deleteStudentById(id);
		session.commit();
		System.out.println("删除成功");
		session.close(); 
	}
	public static void updateStudent() throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml") ;
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
		//session - connection
		SqlSession session = sessionFactory.openSession() ;
		studentMapper studentMapper = session.getMapper(studentMapper.class);
		
		Student student =new Student();
		//修改哪个人
		student.setId(1);
		//修改成什么样子
		student.setAge(111);
		student.setName("zsaas");
		student.setSex(true);
		studentMapper.updateStudent(student);
		System.out.println("修改成功");
		session.commit(); 
		session.close();  
	}
	public static void selectConver(int id) throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml") ;
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
		//session - connection
		SqlSession session = sessionFactory.openSession() ;
		studentMapper studentMapper = session.getMapper(studentMapper.class);
		Student person = studentMapper.selectConver(id);
		System.out.println(person);
		session.close();  
	}
	public static void queryOrderClun(String clum) throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml") ;
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
		//session - connection
		SqlSession session = sessionFactory.openSession() ;
		
		studentMapper studentMapper = session.getMapper(studentMapper.class);
		List<Student> persons = studentMapper.queryOrderClun(clum);
		System.out.print(persons);
		session.close(); 
	}
	public static void queryIdorName() throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml") ;
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
		//session - connection
		SqlSession session = sessionFactory.openSession() ;
		
		studentMapper studentMapper = session.getMapper(studentMapper.class);
		Student student = new Student();
		student.setId(1);
		student.setName("x");
		List<Student> person=studentMapper.queryIdorName(student);
		
		System.out.println(person);
		session.close(); 
	}
	//嵌套查询
	public static void queryAdress() throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml") ;
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
		//session - connection
		SqlSession session = sessionFactory.openSession() ;
		
		studentMapper studentMapper = session.getMapper(studentMapper.class);
		Student student = new Student();
		Adress adress = new Adress();
		adress.setHomeadress("cc");
		student.setAdress(adress);
		List<Student> person=studentMapper.queryAdress(student);
		System.out.println(person);
		System.out.println(adress);
		session.close(); 
	}
	//调用存储过程
	public static void callquery() throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml") ;
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
		//session - connection
		SqlSession session = sessionFactory.openSession() ;
		
		studentMapper studentMapper = session.getMapper(studentMapper.class);
		HashMap<String, Object> hashMap = new HashMap<String,Object>();
		hashMap.put("gName", "ls");
		studentMapper.callquery(hashMap);
		Object count=hashMap.get("scount");
		System.out.print(count);
		session.close(); 
	}
	//通过foreach查询
	public static void queryForech() throws IOException {
		Reader reader = Resources.getResourceAsReader("config.xml") ;
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
		//session - connection
		SqlSession session = sessionFactory.openSession() ;
		
		studentMapper studentMapper = session.getMapper(studentMapper.class);
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		List<Student> person=studentMapper.queryForech(arrayList);
		System.out.println(person);
		session.close(); 
	}
	//一对一表连接
		public static void queryonetoone() throws IOException {
			Reader reader = Resources.getResourceAsReader("config.xml") ;
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
			//session - connection
			SqlSession session = sessionFactory.openSession() ;
			
			studentMapper studentMapper = session.getMapper(studentMapper.class);
			Dept person = studentMapper.queryonetoone(1);
			System.out.println(person);
			session.close(); 
		}
		//一对多表连接
				public static void queryonetomore() throws IOException {
					Reader reader = Resources.getResourceAsReader("config.xml") ;
					SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
					//session - connection
					SqlSession session = sessionFactory.openSession() ;
					studentMapper studentMapper = session.getMapper(studentMapper.class);
					Class person = studentMapper.queryonetomore(1);
					
					System.out.println(person.getClassid()+","+person.getClassname());
					List<Students> studentss=person.getStudents();
					for(Students students:studentss){
						System.out.println(students.getId()+","+students.getName());
						
					}
					session.close(); 
				}
	
	public static void main(String[] args) throws IOException {
		//updateStudent() ;
		//deleteStudentById();
		//queryAllstudent();
		 //addstudent();
		//selectConver(); 
		//queryStudentById(1);
		//queryOrderClun("id");
		//queryIdorName();
		//queryAdress();
		//callquery();
		//queryForech();
		//queryonetoone();
		queryonetomore();
		
	}
}
