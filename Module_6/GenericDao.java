package Module_6;

import java.util.List;

interface GenericDao<E,K> {
    public List<E> findAll();
    public E findBy(K key);
    public void insert(E entity);
}
