/**
 */
package myproject.webpage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myproject.webpage.Category#getName <em>Name</em>}</li>
 *   <li>{@link myproject.webpage.Category#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @see myproject.webpage.WebpagePackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see myproject.webpage.WebpagePackage#getCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link myproject.webpage.Category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Articles</b></em>' containment reference list.
	 * The list contents are of type {@link myproject.webpage.Article}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articles</em>' containment reference list.
	 * @see myproject.webpage.WebpagePackage#getCategory_Articles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Article> getArticles();

} // Category
