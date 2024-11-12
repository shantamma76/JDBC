package com.xworkz.studentInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentInsert {

	String inserQuery = "insert into student_details(id,name,email,password,phone,address,dob,gender,rollNo,city,state,country)"
			+ "VALUES"
			+ "(1,'Ram','ram@gmail.com','ram@26','879456123','RR Nagar','02-02-2002','male','usn101','Bangalor','Karnataka','india'),"
			+ "(2,'Sita','sita@gmail.com','sita@86','147852369','DD Nagar','04-03-2002','female','usn102','Bangalor','karnataka','india'),"
			+ "(3,'Khush','khush@gmail.com','khush@86','8899556622','Ram Nagar','05-04-2002','male','usn103','Bangalor','karnataka','india'),"
			+ "(4,'Radha','radha@gmail.com','radha@86','86609812','shivaji Nagar','06-05-2002','female','usn104','Bangalor','karnataka','india'),"
			+ "(5,'krishna','krish@gmail.com','krish@86','80502196','viyaj Nagar','07-06-2002','male','usn105','Bangalor','karnataka','india'),"
			+ "(6,'Arjuna','arju@gmail.com','acchu@86','866957462','shanti Nagar','08-07-2002','male','usn106','Bangalor','karnataka','india'),"
			+ "(7,'Nakul','nakul@gmail.com','nakul@86','958674123','rajaji Nagar','09-08-2002','male','usn107','Bangalor','karnataka','india'),"
			+ "(8,'Shiva','shiv@gmail.com','shiv@86','996875432','devi Nagar','10-10-2002','male','usn108','kalaburgi','karnataka','india'),"
			+ "(9,'Gowri','gowri@gmail.com','gowri@86','9977884456','om Nagar','11-11-2002','female','usn109','kalaburgi','karnataka','india'),"
			+ "(10,'Ganesha','ganesh@gmail.com','ganesh@86','886655997','Ganesh Nagar','12-12-2002','male','usn110','Bangalor','karnataka','india'),"
			+ "(11,'Kartik','kartik@gmail.com','kartik@86','776699885','JP Nagar','13-01-2002','male','usn111','Bangalor','karnataka','india'),"
			+ "(12,'Bhrama','bram@gmail.com','brama@86','987456321','KR Puram','14-02-2002','male','usn112','Bangalor','karnataka','india'),"
			+ "(13,'Vishnu','vishnu@gmail.com','vishnu@86','852369741','Ram Nagar','15-03-2002','male','usn113','Bangalor','karnataka','india'),"
			+ "(14,'Laxmi','laxmi@gmail.com','laxmi@86','953584165','Laxmi Nagar','16-04-2002','female','usn114','Bangalor','karnataka','india'),"
			+ "(15,'Saraswati','saru@gmail.com','saru@86','923568741','KR Market','17-05-2002','female','usn115','Bangalor','karnataka','india'),"
			+ "(16,'Parvati','paru@gmail.com','paru@86','9586574133','Megestic','18-06-2002','female','usn116','Bangalor','karnataka','india'),"
			+ "(17,'Janaki','janu@gmail.com','janu@86','866475912','18th cross','19-07-2002','female','usn117','Bangalor','karnataka','india'),"
			+ "(18,'Gopala','gopal@gmail.com','gopal@86','968574123','Navaranga','20-08-2002','male','usn118','kalaburgi','karnataka','india'),"
			+ "(19,'Bhargavi','bhargavi@gmail.com','bargu@86','897456123','Palace Ground','21-09-2001','female','usn119','kalaburgi','karnataka','india'),"
			+ "(20,'Srinivasha','srinivash@gmail.com','srinivasha@86','85296314','Ganesh Nagar','06-12-2000','male','usn120','Bangalor','karnataka','india');";

	public String getInsertQuery() {
		return inserQuery;
	}

}
