package com.opensource.repository;

public interface CustomQuery {

	//nativeQuery
	String USER_CHECKDUPLICATE_USERNAME = 
			"select exists(select u from User u where u.username = :username)";
	
	//nativeQuery
	String USER_CHECK_EXISTED_OTHER_ADMIN= 
			"SELECT count(*) FROM user u JOIN user_role ur ON u.user_id = ur.user_id JOIN role r ON ur.role_id = r.role_id where role_name='ROLE_ADMIN'";

	String USERINFO_UPDATE_USER_INFO = 
			"update UserInfo set firstName=:firstName, lastName=:lastName, email=:email,phone=:phone where userId=:userId";
	
	//nativeQuery
	String USER_FIND_USER_ID_WITH_ROLE_ADMIN = 
			"SELECT  u.user_id FROM user u JOIN user_role ur ON u.user_id = ur.user_id JOIN role r ON ur.role_id = r.role_id where role_name='ROLE_ADMIN'";
	
	String USER_UPDATE_ADMIN_LOGIN_DATA = 
			"update User set username=:username,password=:password where userID=:userID";
	
	String CATEGORY_SEARCH_CATEGORYID=
			"select p from Product p where categoryId=:categoryId";
}
