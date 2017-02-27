package gameFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class UserDataFile {

	public static final int MAX_INDEX = 100000;
	
	private RandomAccessFile file;
	
	public UserDataFile() throws FileNotFoundException {
		file = new RandomAccessFile("userdata.rac", "rw");
	}
	
	public int generateIndex(String userName) {
		int index = Math.abs(userName.hashCode()) % MAX_INDEX;
		return index;
	}
	
	public void save(User user) throws IOException {
		int index = this.generateIndex(user.userName);
		file.seek(index);
		file.write(user.serialize().getBytes());
	}
	
	public User load(String username) throws IOException {
		int index = this.generateIndex(username);
		file.seek(index);
		byte[] buffer = new byte[44];
		file.read(buffer);
		String rawUserString = new String(buffer);
		User user = new User();
		user.deserialize(rawUserString);
		return user;
	}
	
}
