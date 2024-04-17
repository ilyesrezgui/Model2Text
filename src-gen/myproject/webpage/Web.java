/**
 */
package myproject.webpage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myproject.webpage.Web#getName <em>Name</em>}</li>
 *   <li>{@link myproject.webpage.Web#getTitle <em>Title</em>}</li>
 *   <li>{@link myproject.webpage.Web#getDescription <em>Description</em>}</li>
 *   <li>{@link myproject.webpage.Web#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link myproject.webpage.Web#getWebpages <em>Webpages</em>}</li>
 * </ul>
 *
 * @see myproject.webpage.WebpagePackage#getWeb()
 * @model
 * @generated
 */
public interface Web extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see myproject.webpage.WebpagePackage#getWeb_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link myproject.webpage.Web#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see myproject.webpage.WebpagePackage#getWeb_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link myproject.webpage.Web#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see myproject.webpage.WebpagePackage#getWeb_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link myproject.webpage.Web#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute.
	 * @see #setKeywords(String)
	 * @see myproject.webpage.WebpagePackage#getWeb_Keywords()
	 * @model
	 * @generated
	 */
	String getKeywords();

	/**
	 * Sets the value of the '{@link myproject.webpage.Web#getKeywords <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywords</em>' attribute.
	 * @see #getKeywords()
	 * @generated
	 */
	void setKeywords(String value);

	/**
	 * Returns the value of the '<em><b>Webpages</b></em>' containment reference list.
	 * The list contents are of type {@link myproject.webpage.Webpage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webpages</em>' containment reference list.
	 * @see myproject.webpage.WebpagePackage#getWeb_Webpages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Webpage> getWebpages();

} // Web
