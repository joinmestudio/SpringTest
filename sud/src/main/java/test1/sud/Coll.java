package test1.sud;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Coll {
	List<String> list;
	Map<Integer, String> map;
	Set<Integer> set;
	Properties properties;
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public Set<Integer> getSet() {
		return set;
	}
	public void setSet(Set<Integer> set) {
		this.set = set;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Coll [list=" + list + ", map=" + map + ", set=" + set + ", properties=" + properties + "]";
	}
	public Coll(List list, Map<Integer, String> map, Set<Integer> set, Properties properties) {
		super();
		this.list = list;
		this.map = map;
		this.set = set;
		this.properties = properties;
	}
	public Coll() {
		super();
		
	}
	
}
