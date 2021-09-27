package singilton;

import java.util.ArrayList;
import java.util.List;

public class protocol {

	private static protocol httpCon ; 
	private static protocol sshCon ; 
	private static protocol telnetCon ; 
	private static protocol scpCon ; 
	private static protocol ftpCon ; 
	
	public static final String HTTP = "Http" ;
	public static final String SSH = "Ssh" ;
	public static final String TELNET = "telent" ;
    public static final String SCP = "Scp" ;
	public static final String FTP = "Ftp" ;

	
	private static int num_connections ;
	private static List<String> all_connections = new ArrayList<>();
	
	private protocol() {}
	
	public static protocol gitInstance(String pro) {
		
		if(pro == protocol.HTTP) {
			if(httpCon == null) {
				if(protocol.num_connections <3) {
					httpCon = new protocol() ; 
					protocol.num_connections ++ ;
					all_connections.add("http");
				}else System.out.print(" #connection more than 3 ");
			}else System.out.print("This connection already exist");
			
			
			return httpCon;
		}
	//	return null;
		
		else if(pro == protocol.SSH) {
			if(sshCon == null) {
				if(protocol.num_connections <3) {
					sshCon = new protocol() ; 
					protocol.num_connections ++ ;
					all_connections.add("Ssh");
				}else System.out.print(" #connection more than 3 ");
			}else System.out.print("This connection already exist");
			
			return sshCon;
		}
		
		else if(pro == protocol.TELNET) {
			if( telnetCon == null) {
				if(protocol.num_connections <3) {
					telnetCon = new protocol() ; 
					protocol.num_connections ++ ;
					all_connections.add("telent");
				}else System.out.print(" #connection more than 3 ");
			}else System.out.print("This connection already exist");
			
			return telnetCon;
		}
		else if(pro == protocol.SCP) {
			if( scpCon  == null) {
				if(protocol.num_connections <3) {
					scpCon  = new protocol() ; 
					protocol.num_connections ++ ;
					all_connections.add("Scp");
				}else System.out.print(" #connection more than 3 ");
			}else System.out.print("This connection already exist");
			
			return scpCon ;
		}
		else if(pro == protocol.FTP) {
			if( ftpCon  == null) {
				if(protocol.num_connections <3) {
					ftpCon  = new protocol() ; 
					protocol.num_connections ++ ;
					all_connections.add("Ftp");
				}else System.out.print(" #connection more than 3 ");
			}else System.out.print("This connection already exist");
			
			return ftpCon ;
		}
		
		return null;
		
	}
	
	public static boolean relase(String pro) {
		
		if(pro == protocol.HTTP) {
			if(httpCon != null ) {
				httpCon = null ; 
				protocol.num_connections -- ;
				all_connections.remove("http");
			}else System.out.print("This connection does not fined");
			return true;
		}
		
		else if(pro == protocol.SSH) {
			if(sshCon != null ) {
				sshCon = null ; 
				protocol.num_connections -- ;
				all_connections.remove("Ssh");
			}else System.out.print("This connection does not fined");
			return true;
		}
		else if(pro == protocol.TELNET) {
			if(telnetCon != null ) {
				telnetCon = null ; 
				protocol.num_connections -- ;
				all_connections.remove("telent");
			}else System.out.print("This connection does not fined");
			return true;
		}
		else if(pro == protocol.SCP) {
			if( scpCon != null ) {
				 scpCon = null ; 
				protocol.num_connections -- ;
				all_connections.remove("Scp");
			}else System.out.print("This connection does not fined");
			return true;
		}
		
		else if(pro == protocol.FTP) {
			if( ftpCon != null ) {
				ftpCon = null ; 
				protocol.num_connections -- ;
				all_connections.remove("Ftp");
			}else System.out.print("This connection does not fined");
			return true;
		}	
		return false ;
		
	}
	
	
	public static List<String> getCurrentCunnection(){
		
		return protocol.all_connections ;
	}
	
   public void send(String message) {
	   if(this == httpCon) {
		   System.out.print("Sending" + message + "Via Http Protocol");
	   }
	   
	   else if(this == sshCon) {
		   System.out.print("Sending" + message + "Via Ssh Protocol");
	   }
	   else if(this == telnetCon) {
		   System.out.print("Sending" + message + "Via Telnet Protocol");
	   }
	   
	   else if(this ==  scpCon) {
		   System.out.print("Sending" + message + "Via scp Protocol");
	   }
	   
	   else if(this ==  ftpCon) {
		   System.out.print("Sending" + message + "Via ftp Protocol");
	   }
   }
	

}
