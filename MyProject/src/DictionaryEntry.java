
public class DictionaryEntry<K, V> {
	private K key;
	private V value;

	DictionaryEntry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public String toString() {
		return String.format("[%s, %s]", key, value);
	}
}
