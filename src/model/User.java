package model;

import java.io.Serializable;

public class User implements Serializable {
    private String nickName;
    private String password;
    private String money;

    public User() {
    }

    public User(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPassword() {
        return password;
    }

	public String getMoney() {
		return money;
	}

}

