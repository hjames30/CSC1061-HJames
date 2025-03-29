package edu.frcc.csc1061jsp26.SentimentAnalysis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K,V> implements Map<K,V> {

	private static final int INITIAL_NUM_BUCKETS = 4;
	private static final double load_Factor_Threshold = 0.5;
	
	private int size = 0;

	private LinkedList<Entry<K,V>> [] buckets;
	
	public static class Entry<K,V> implements Map.Entry<K,V> {
		K key;
		V value;
		
		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		public K getKey() {
			return key;
		}
		
		public V getValue() {
			return value;
		}

		@Override
		public Object setValue(Object value) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public MyHashMap() {
		buckets = new LinkedList[INITIAL_NUM_BUCKETS];
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
		if (get(key) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		for(int i = 0; i < buckets.length; i++) {
			if (buckets[i] != null) {
				LinkedList<Entry<K,V>>bucket = buckets[i];
				for(Entry<K,V> entry: bucket) {
					if (entry.getValue().equals(value)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public V get(Object key) {
		int bucketIndex = Math.abs(key.hashCode()) % buckets.length;
		LinkedList<Entry<K,V>> bucket = buckets[bucketIndex];
		if(bucket != null) {
		for(Entry<K,V> entry: bucket) {
			if (entry.getKey().equals(key)) {
				return entry.getValue();
				}
			}
		}
		return null;
	}

	public int getNumBuckets() {
		return buckets.length;
	}
	
	@Override
	public V put(K key, V value) {
		int bucketIndex = Math.abs(key.hashCode()) % buckets.length;
		LinkedList<Entry<K,V>> bucket = buckets[bucketIndex];
		
		if (bucket != null) {
			for (Entry<K,V> entry: bucket) {
				if (entry.getKey().equals(key)) {
					V oldValue = entry.getValue();
					entry.value = value;
					return oldValue;
				}
			}
		}
		//check if map is more than half full 
		 if (size > buckets.length / 2) {
	            rehash();
	        }
		
		// Check for load factor has been exceeded and take action
		
		if (buckets[bucketIndex] == null) {
			buckets[bucketIndex] = new LinkedList<Entry<K,V>>();
		}
		
		buckets[bucketIndex].add(new Entry<K,V>(key, value));
		size++;
		return value;
	}

	@Override
	public V remove(Object key) {
		int bucketIndex = Math.abs(key.hashCode()) % buckets.length;
		LinkedList<Entry<K,V>> bucket = buckets[bucketIndex];
		if (bucket != null) {
			for (Entry<K,V> entry: bucket) {
				if (entry.getKey().equals(key)) {
					V oldValue = entry.getValue();
					bucket.remove(entry);
					size--;
					return oldValue;
				}
			} 
		}
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> otherMap) {
		Set<? extends Map.Entry<? extends K, ? extends V>> entries = otherMap.entrySet(); 
		for(Map.Entry<? extends K, ? extends V> entry : entries) {
			put(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public void clear() {
		size = 0;
		for(LinkedList<Entry<K,V>> bucket : buckets) {
			bucket = null;
		}
	}

	@Override
	public Set<K> keySet() {
		Set<K> keySet = new HashSet<K>();
		for(int i = 0; i < buckets.length; i++) {
			if (buckets[i] != null) {
				LinkedList<Entry<K,V>>bucket = buckets[i];
				for(Entry<K,V> entry: bucket) {
					keySet.add(entry.getKey());
				}
			}
		}
		return keySet;
	}

	@Override
	public Collection<V> values() {
		Collection<V> valueList = new ArrayList<V>();
		for(int i = 0; i < buckets.length; i++) {
			if (buckets[i] != null) {
				LinkedList<Entry<K,V>>bucket = buckets[i];
				for(Entry<K,V> entry: bucket) {
					valueList.add(entry.getValue());
				}
			}
		}
		return valueList;
	}

	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K,V>> entrySet = new HashSet<Map.Entry<K,V>>();
		for(int i = 0; i < buckets.length; i++) {
			if (buckets[i] != null) {
				LinkedList<Entry<K,V>>bucket = buckets[i];
				for(Entry<K,V> entry: bucket) {
					entrySet.add(entry);
				}
			}
		}
		return entrySet;
	}
	private void rehash() {
		//making new linkedlist twice the size
		LinkedList<Entry<K, V>>[] newSizeBuckets = new LinkedList[buckets.length*2];
		
		//Taking old linkedlist and transfering to new one with new size
		for(LinkedList<Entry<K, V>> bucket:buckets) {
			//for each filled bucket
			if(bucket != null) {
				for(Entry<K, V> entry:bucket) {
					//setting new index
					int newBucketIndex = Math.abs(entry.getKey().hashCode()) % buckets.length*2;
					//if new bucket is empty create new bucket
					if(newSizeBuckets[newBucketIndex]==null) {
						newSizeBuckets[newBucketIndex]= new LinkedList<>();
					}
					//add that bucket to new map
					newSizeBuckets[newBucketIndex].add(entry);
				}
			}
		}
		
		//set old map to new map 
		buckets =newSizeBuckets;
		
	}
}