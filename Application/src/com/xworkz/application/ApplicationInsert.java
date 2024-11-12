package com.xworkz.application;

public class ApplicationInsert {

	
	String insertQuery = "insert into application_info(id,name,email,password,phone,address,dob,gender,usnNo,city,state,country)"
			+ "VALUES"
			+ "(31,'Aditya','aditya@gmail.com','adi@26','879456123','RR Nagar','02-02-2002','male','usn50','Bangalor','Karnataka','india'),"
			+ "(32,'Padmā','padmā@gmail.com','padmā@77','847852369','DD Nagar','04-03-2002','female','usn51','Bangalor','karnataka','india'),"
			+ "(33,'Gopal','gopal@gmail.com','gopal@36','8899556622','Ram Nagar','05-04-2002','male','usn52','Bangalor','karnataka','india'),"
			+ "(34,'Kamalā','kamalā@gmail.com','kamalā@33','86609812','shivaji Nagar','06-05-2002','female','usn53','Bangalor','karnataka','india'),"
			+ "(35,'Govinda','govinda@gmail.com','govinda@99','80502196','viyaj Nagar','07-06-2002','male','usn54','Bangalor','karnataka','india'),"
			+ "(36,'Hari','hari@gmail.com','hari@18','866957462','shanti Nagar','08-07-2002','male','usn55','Bangalor','karnataka','india'),"
			+ "(37,'Janardhana','janardhana@gmail.com','janardhana@86','958674123','rajaji Nagar','09-08-2002','male','usn56','Bangalor','karnataka','india'),"
			+ "(38,'Keshava','keshava@gmail.com','keshava@16','996875432','devi Nagar','10-10-2002','male','usn57','kalaburgi','karnataka','india'),"
			+ "(39,'Gowri','gowri@gmail.com','gowri@66','9977884456','om Nagar','11-11-2002','female','usn58','kalaburgi','karnataka','india'),"
			+ "(40,'Madhava','madhava@gmail.com','madhava@14','886655997','Ganesh Nagar','12-12-2002','male','usn59','Bangalor','karnataka','india'),"
			+ "(41,'Vasudev','vasudev@gmail.com','vasudev@21','776699885','JP Nagar','13-01-2002','male','usn60','Bangalor','karnataka','india'),"
			+ "(42,'Gajakarna','gajakarna@gmail.com','gajakarna@89','987456321','KR Puram','14-02-2002','male','usn61','Bangalor','karnataka','india'),"
			+ "(43,'Gajanana','gajanana@gmail.com','gajanana@258','852369741','Ram Nagar','15-03-2002','male','usn62','Bangalor','karnataka','india'),"
			+ "(44,'Vaishnavi','vaishnavi@gmail.com','vaishnavi@789','953584165','Laxmi Nagar','16-04-2002','female','usn63','Bangalor','karnataka','india'),"
			+ "(45,'Nandika','nandika@gmail.com','nandika@86','923568741','KR Market','17-05-2002','female','usn64','Bangalor','karnataka','india'),"
			+ "(46,'Kamakshi','kamakshi@gmail.com','kamakshi@102','9586574133','Megestic','18-06-2002','female','usn64','Bangalor','karnataka','india'),"
			+ "(47,'Padmini','padmini@gmail.com','padmini@306','866475912','18th cross','19-07-2002','female','usn65','Bangalor','karnataka','india'),"
			+ "(48,'Lambodara','lambodara@gmail.com','lambodara@683','968574123','Navaranga','20-08-2002','male','usn66','kalaburgi','karnataka','india'),"
			+ "(49,'Shubha','shubha@gmail.com','shubha@786','897456123','Palace Ground','21-09-2001','female','usn67','kalaburgi','karnataka','india'),"
			+ "(50,'Pramoda','pramoda@gmail.com','pramoda@231','85296314','Ganesh Nagar','06-12-2000','male','usn68','Bangalor','karnataka','india');";

	public String getInsertQuery() {
		return insertQuery;
	}
}

