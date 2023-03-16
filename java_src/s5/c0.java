package s5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class c0<E> implements List<E>, RandomAccess {

    /* renamed from: n  reason: collision with root package name */
    private final List<E> f14175n;

    private c0(List<E> list) {
        this.f14175n = Collections.unmodifiableList(list);
    }

    public static <E> c0<E> d(List<E> list) {
        return new c0<>(list);
    }

    public static <E> c0<E> g(E... eArr) {
        return new c0<>(Arrays.asList(eArr));
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        this.f14175n.add(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e10) {
        return this.f14175n.add(e10);
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        return this.f14175n.addAll(i10, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f14175n.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f14175n.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f14175n.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f14175n.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f14175n.equals(obj);
    }

    @Override // java.util.List
    public E get(int i10) {
        return this.f14175n.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f14175n.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f14175n.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f14175n.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f14175n.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f14175n.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f14175n.listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return this.f14175n.listIterator(i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        return this.f14175n.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f14175n.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f14175n.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f14175n.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        return this.f14175n.set(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f14175n.size();
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return this.f14175n.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f14175n.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f14175n.toArray(tArr);
    }
}
