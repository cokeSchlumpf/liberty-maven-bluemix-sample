package ws;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("ws")
public class Application extends javax.ws.rs.core.Application {

  @Override
  public Set<Class<?>> getClasses() {
      HashSet<Class<?>> classes = new HashSet<Class<?>>();
      classes.add(CoinService.class);
      return classes;
  }
  
}