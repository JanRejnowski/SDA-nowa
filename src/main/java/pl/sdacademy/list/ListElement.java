package pl.sdacademy.list;

	public class ListElement<T> {
		public ListElement(T value) {
			super();
			this.value = value;
		}

		T value;
		ListElement<T> zaczepZTylu;
		ListElement<T> zaczepZPrzodu;

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public ListElement<T> getNext() {
			return zaczepZTylu;
		}

		public void setNext(ListElement<T> next) {
			this.zaczepZTylu = next;
		}

		public ListElement<T> getPrevious() {
			return zaczepZPrzodu;
		}

		public void setPrevious(ListElement<T> previous) {
			this.zaczepZPrzodu = previous;
		}
	}


