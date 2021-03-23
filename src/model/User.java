package model;

import java.io.Serializable;

public class User implements Serializable {
    private String nickName;
    private String password;
    private String money;

    public User() {
    }

    public User(String nickName, String password, String money) {
        this.nickName = nickName;
        this.password = password;
        this.money = money;
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

