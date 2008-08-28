package negocio.leitor;

import java.io.File;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;

import negocio.leitor.Interface.PluginInterface;

public class LeitorDeModelo {
	private final String DIRBASE = "plugins/";
	private LinkedList< String > list;
	private PluginInterface pl;
	private LinkedList< String > lista;
	
	public HashMap< String, LinkedList< String >> getNomesExtensoes() {
		HashMap< String, LinkedList< String >> nE = new HashMap< String, LinkedList< String >>();
		list = getJars();
		
		return nE;
	}
	
	public LinkedList< String > getObjetos( String arquivo ) {
		list = getJars();
		
		
	}
	
	private LinkedList< String > getJars() { // retorna uma lista de jars no diretorio
		LinkedList< String > l = new LinkedList< String >();
		File f = new File( DIRBASE );
		for( File fi : f.listFiles() ){
			String s = fi.toString();
			if( s.endsWith( ".jar" ) ){
				l.add( s );
				System.out.println( "Jar: " + s );
			}
		}
		return l;
	}
	
	/**
	 * Busca a classe "principal" do jar.
	 * 
	 * @param arquivo
	 * @return
	 */
	private PluginInterface getClasseJar( String arquivo ) {
		URLClassLoader load;
		try{
			URL url = new URL( "jar", "", "file:" + arquivo + "!/" );
			
			JarURLConnection jar = ( JarURLConnection ) url.openConnection(); // abro o url pro jar
			Enumeration arq = jar.getJarFile().entries(); // pego os arquivos que estao no jar
			load = new URLClassLoader( new URL[] { url } ); // pra ler a classe do jar
			
			while( arq.hasMoreElements() ){
				Object object = arq.nextElement();
				
				if( object.toString().contains( ".class" ) && !object.toString().contains( "PluginInterface.class" ) ){
					Class cl = load.loadClass( object.toString().replace( ".class", "" ) );
					System.out.println( cl.getInterfaces().toString() );
					// pl = ( PluginInterface ) cl.newInstance();
				}
			}
		} catch( MalformedURLException e ){
			e.printStackTrace();
		} catch( IOException e ){
			e.printStackTrace();
		} catch( ClassNotFoundException e ){
			e.printStackTrace();
		} catch( InstantiationException e ){
			e.printStackTrace();
		} catch( IllegalAccessException e ){
			e.printStackTrace();
		}
		return pl;
	}
}
