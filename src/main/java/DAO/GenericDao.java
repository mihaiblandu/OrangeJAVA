package DAO;

/**
 *
 * @author Mihai Blandu
 * @param <T>
 */
public interface GenericDao<T> {

	void save(T person);


	void update(T person);

	void delete(T person);
	String getPerson(T person);
}
