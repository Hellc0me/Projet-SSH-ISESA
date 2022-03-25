
import java.io.Console;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.jcraft.jsch.*;

import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.common.IOUtils;
import net.schmizz.sshj.connection.ConnectionException;
import net.schmizz.sshj.connection.channel.Channel;
import net.schmizz.sshj.connection.channel.direct.Session.Command;
import net.schmizz.sshj.transport.TransportException;
import net.schmizz.sshj.transport.verification.PromiscuousVerifier;
import net.schmizz.sshj.userauth.UserAuthException;
public class Connexion {
	JSch jsch;
	
	public Connexion(ModeleConnection mC) throws IOException {
		jsch = new JSch();
		 //final Console con = System.console();
		        final SSHClient ssh = new SSHClient();
		        ssh.addHostKeyVerifier(new PromiscuousVerifier());
		        try {
					ssh.connect(mC.getHost());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        net.schmizz.sshj.connection.channel.direct.Session session = null;
		        try {
		        	System.out.println(mC.getMdp());
		        	
		            ssh.authPassword(mC.getIdentifiant(), mC.getMdp());
		            session = ssh.startSession();
		            final Command cmd = session.exec("ls -l");
		            GestionnaireModele gm = new GestionnaireModele(IOUtils.readFully(cmd.getInputStream()).toString());
		            new GestionnaireControle(gm);
		            
		        } finally {
		            try {
		                if (session != null) {
		                    session.close();
		                }
		            } catch (IOException e) {
		                // Do Nothing   
		            }
		            
		            
		        }
		/*try {
			JSch.setLogger(new MyLogger());
			Session session = jsch.getSession(id, host, 22);
			session.setPassword(mdp);
			session.setConfig("StringHostKeyChecking","no");
			session.connect(30000);
			Channel channel=session.openChannel("shell");	
			channel.setInputStream(System.in);
		    channel.setOutputStream(System.out);
		    channel.connect(3*1000);
		} catch (JSchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static class MyLogger implements com.jcraft.jsch.Logger {
	    static java.util.Hashtable name=new java.util.Hashtable();
	    static{
	      name.put(new Integer(DEBUG), "DEBUG: ");
	      name.put(new Integer(INFO), "INFO: ");
	      name.put(new Integer(WARN), "WARN: ");
	      name.put(new Integer(ERROR), "ERROR: ");
	      name.put(new Integer(FATAL), "FATAL: ");
	    }
	    public boolean isEnabled(int level){
	      return true;
	    }
	    public void log(int level, String message){
	      System.err.print(name.get(new Integer(level)));
	      System.err.println(message);
	    }*/
	  }
	}
	

