package singilton;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// will create a new object and return a TELNET protocol 
		protocol telnetprotocol = protocol.gitInstance(protocol.TELNET);
		// will return the current TELNET protocol
		protocol telnetprotocol2= protocol.gitInstance(protocol. TELNET);
		// will create a new object
		protocol sshprotocol = protocol.gitInstance(protocol.SSH);

		// will create a new object
		protocol httpprotocol = protocol.gitInstance(protocol.HTTP);
		// will throw an expectation telling the user he can't create more than 3 protocols! 
		protocol scpprotocol = protocol.gitInstance (protocol.SCP);
		
		// will return the current SSH protocol

		protocol sshprotocol2 = protocol.gitInstance(protocol.HTTP);

		// will delete the current TELNET protocol and return true,
		//and it will return false if there is no TELNET protocol at all. 
		boolean isReleased= protocol.relase (protocol. TELNET);

		// will create a new FTP protocol and return it.

		protocol ftpprotocol = protocol.gitInstance(protocol.FTP);

		// return a list of current protocols as protocol objects
  List<String> currentprotocols= protocol. getCurrentCunnection();

		//Will print a message says: Sending [My message] vi FTP protocol.
ftpprotocol.send("My message");
//Will print a message says: Sending [My message] vi SSH protocol. 
sshprotocol.send("My message");

}
}