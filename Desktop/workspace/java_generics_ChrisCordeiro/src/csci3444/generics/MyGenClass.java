package csci3444.generics;

public class MyGenClass<K, V> implements MyGenInterface<K,V>{

	public K key;
	public V value;
	
	public MyGenClass(K _key,V _value) {
		key=_key;
		value=_value;
	}
	
	@Override
	public K getKey() {
		return key;
	}
	
	@Override
	public V getValue() {
		return value;
	}
}
