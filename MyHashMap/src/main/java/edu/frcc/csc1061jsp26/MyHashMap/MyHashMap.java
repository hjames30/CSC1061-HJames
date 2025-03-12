package edu.frcc.csc1061jsp26.MyHashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K, V> implements Map<K, V> {
	private static final int INTIAL_NUM_BUCKETS = 4;
	private int size = 0;
	private static final double LOAD_FACTOR_THRESHOLD = 0.5;
	private List<Entry<K, V>>[] buckets;

	private class Entry<K, V> implements Map.Entry<K, V> {
		K key;
		V value;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public K getKey() {

			return key;
		}

		@Override
		public V getValue() {

			return value;
		}

		@Override
		public V setValue(V value) {
			V temp = this.value;
			this.value = value;
			return temp;
		}
	}

	public MyHashMap() {
		buckets = new LinkedList[INTIAL_NUM_BUCKETS];

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K key, V value) {
		// if key does not exist makes new key for arraylist
		int bucketIndex = Math.abs(key.hashCode()) % buckets.length;
		if (buckets[bucketIndex] == null) {
			buckets[bucketIndex] = new LinkedList<Entry<K, V>>();
		}
		// if key already exists makes new linked list in arraylist
		for (Entry<K, V> entry : buckets[bucketIndex]) {
			if (entry.key.equals(key)) {
				V temp = entry.getValue();
				entry.setValue(value);
				return temp;
			}
		}
		// check load factor
		// Load Factor = num entires in map / num of buckets
		// int loadFactor =
		// if (loadFactor > LOAD_FACTOR_THRESHOLD) rehash();
		// rehash = double the number of buckets rehash the buckets to point to new map;

		// if key does not exist makes inserts key and value
		buckets[bucketIndex].add(new Entry<K, V>(key, value));
		size++;
		return null;
	}

	@Override
	public V remove(Object key) {
		int bucketIndex = Math.abs(key.hashCode( )) % buckets.length;
		if(buckets[bucketIndex]!=null) {
			int listIndex =-1;
		for(Entry<K,V> entry : buckets[bucketIndex]) {
			if(entry.key.equals(key)) {
				break;
				
				
			}
		}
		V temp = buckets[bucketIndex].get(listIndex).value;
		buckets[bucketIndex].remove(buckets[bucketIndex].get(listIndex));
		size--;
		return temp;
	}
		
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
