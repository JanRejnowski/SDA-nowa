package pl.sdacademy.list;

import java.util.Iterator;

public class List<T> implements IList<T> {

	ListElement<T> pierwszyElement;
	ListElement<T> ostatniElement;

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public T getFirst() {
		return pierwszyElement.getValue();
	}

	@Override
	public T getLast() {
		return ostatniElement.getValue();
	}

	public List() {
		pierwszyElement = null;
		ostatniElement = null;
	}

	@Override
	public T get(int index) {
		return getElement(index).getValue();
	}

	public ListElement<T> getElement(int index) {
		if (isEmpty()) {
			return null;
		} else {
			int licznik = 0;
			ListElement<T> element = pierwszyElement;
			while (licznik != index) {
				element = element.getNext();
				licznik++;
			}
			return element;
		}
	}

	@Override
	public void add(T element) {

	}

	@Override
	public void remove(int index) {
		ListElement<T> elementDoUsuniecia = getElement(index);
		ListElement<T> elementPrzed = elementDoUsuniecia.getPrevious();
		ListElement<T> elementPo = elementDoUsuniecia.getNext();
		elementPrzed.zaczepZPrzodu = elementPo;
		
	}

	@Override
	public int size() {
		if (isEmpty()) {
			return 0;
		} else {
			int rozmiar = 0;
			ListElement<T> element = pierwszyElement;
			while (element != null) {
				element = element.getNext();
				rozmiar++;
			}
			return rozmiar;
		}
	}

	@Override
	public boolean isEmpty() {
		return pierwszyElement == null;
	}

}
