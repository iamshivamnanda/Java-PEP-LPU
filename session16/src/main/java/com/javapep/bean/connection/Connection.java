package com.javapep.bean.connection;

public class Connection {
  int url;
  String userName;
  String password;
  
  public Connection() {
	  
  }
  
public Connection(int uuid, String userName, String password) {
	super();
	this.url = uuid;
	this.userName = userName;
	this.password = password;
}

public int getUuid() {
	return url;
}

public void setUuid(int uuid) {
	this.url = uuid;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
  

}
