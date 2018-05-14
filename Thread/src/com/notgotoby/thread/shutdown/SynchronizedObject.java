package com.notgotoby.thread.shutdown;

/**
 * 使用stop()释放锁会给数据造成不一致的后果。如果出现这种情况，程序处理的数据可能遭到破坏，最终导致
 * 程序流程出错
 * @author notogoby
 *
 */
public class SynchronizedObject {
	
	private String username = "a";
	
	private String password = "aa";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public synchronized void printString(String username, String password){
		try {
			this.username = username;
			Thread.sleep(100000);
			this.password = password;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
