/**
 */
package myproject.webpage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see myproject.webpage.WebpageFactory
 * @model kind="package"
 * @generated
 */
public interface WebpagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webpage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/webpage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webpage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebpagePackage eINSTANCE = myproject.webpage.impl.WebpagePackageImpl.init();

	/**
	 * The meta object id for the '{@link myproject.webpage.impl.WebpageImpl <em>Webpage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myproject.webpage.impl.WebpageImpl
	 * @see myproject.webpage.impl.WebpagePackageImpl#getWebpage()
	 * @generated
	 */
	int WEBPAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__CATEGORIES = 3;

	/**
	 * The number of structural features of the '<em>Webpage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Webpage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link myproject.webpage.impl.WebImpl <em>Web</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myproject.webpage.impl.WebImpl
	 * @see myproject.webpage.impl.WebpagePackageImpl#getWeb()
	 * @generated
	 */
	int WEB = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__KEYWORDS = 3;

	/**
	 * The feature id for the '<em><b>Webpages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__WEBPAGES = 4;

	/**
	 * The number of structural features of the '<em>Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link myproject.webpage.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myproject.webpage.impl.CategoryImpl
	 * @see myproject.webpage.impl.WebpagePackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Articles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ARTICLES = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link myproject.webpage.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see myproject.webpage.impl.ArticleImpl
	 * @see myproject.webpage.impl.WebpagePackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CREATED = 1;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Calendar
	 * @see myproject.webpage.impl.WebpagePackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 4;

	/**
	 * Returns the meta object for class '{@link myproject.webpage.Webpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Webpage</em>'.
	 * @see myproject.webpage.Webpage
	 * @generated
	 */
	EClass getWebpage();

	/**
	 * Returns the meta object for the attribute '{@link myproject.webpage.Webpage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see myproject.webpage.Webpage#getName()
	 * @see #getWebpage()
	 * @generated
	 */
	EAttribute getWebpage_Name();

	/**
	 * Returns the meta object for the attribute '{@link myproject.webpage.Webpage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see myproject.webpage.Webpage#getTitle()
	 * @see #getWebpage()
	 * @generated
	 */
	EAttribute getWebpage_Title();

	/**
	 * Returns the meta object for the attribute '{@link myproject.webpage.Webpage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see myproject.webpage.Webpage#getDescription()
	 * @see #getWebpage()
	 * @generated
	 */
	EAttribute getWebpage_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link myproject.webpage.Webpage#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see myproject.webpage.Webpage#getCategories()
	 * @see #getWebpage()
	 * @generated
	 */
	EReference getWebpage_Categories();

	/**
	 * Returns the meta object for class '{@link myproject.webpage.Web <em>Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web</em>'.
	 * @see myproject.webpage.Web
	 * @generated
	 */
	EClass getWeb();

	/**
	 * Returns the meta object for the attribute '{@link myproject.webpage.Web#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see myproject.webpage.Web#getName()
	 * @see #getWeb()
	 * @generated
	 */
	EAttribute getWeb_Name();

	/**
	 * Returns the meta object for the attribute '{@link myproject.webpage.Web#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see myproject.webpage.Web#getTitle()
	 * @see #getWeb()
	 * @generated
	 */
	EAttribute getWeb_Title();

	/**
	 * Returns the meta object for the attribute '{@link myproject.webpage.Web#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see myproject.webpage.Web#getDescription()
	 * @see #getWeb()
	 * @generated
	 */
	EAttribute getWeb_Description();

	/**
	 * Returns the meta object for the attribute '{@link myproject.webpage.Web#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keywords</em>'.
	 * @see myproject.webpage.Web#getKeywords()
	 * @see #getWeb()
	 * @generated
	 */
	EAttribute getWeb_Keywords();

	/**
	 * Returns the meta object for the containment reference list '{@link myproject.webpage.Web#getWebpages <em>Webpages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Webpages</em>'.
	 * @see myproject.webpage.Web#getWebpages()
	 * @see #getWeb()
	 * @generated
	 */
	EReference getWeb_Webpages();

	/**
	 * Returns the meta object for class '{@link myproject.webpage.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see myproject.webpage.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link myproject.webpage.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see myproject.webpage.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link myproject.webpage.Category#getArticles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Articles</em>'.
	 * @see myproject.webpage.Category#getArticles()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Articles();

	/**
	 * Returns the meta object for class '{@link myproject.webpage.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see myproject.webpage.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the attribute '{@link myproject.webpage.Article#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see myproject.webpage.Article#getName()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Name();

	/**
	 * Returns the meta object for the attribute '{@link myproject.webpage.Article#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see myproject.webpage.Article#getCreated()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Created();

	/**
	 * Returns the meta object for data type '{@link java.util.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar</em>'.
	 * @see java.util.Calendar
	 * @model instanceClass="java.util.Calendar"
	 * @generated
	 */
	EDataType getCalendar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebpageFactory getWebpageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link myproject.webpage.impl.WebpageImpl <em>Webpage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myproject.webpage.impl.WebpageImpl
		 * @see myproject.webpage.impl.WebpagePackageImpl#getWebpage()
		 * @generated
		 */
		EClass WEBPAGE = eINSTANCE.getWebpage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBPAGE__NAME = eINSTANCE.getWebpage_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBPAGE__TITLE = eINSTANCE.getWebpage_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBPAGE__DESCRIPTION = eINSTANCE.getWebpage_Description();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBPAGE__CATEGORIES = eINSTANCE.getWebpage_Categories();

		/**
		 * The meta object literal for the '{@link myproject.webpage.impl.WebImpl <em>Web</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myproject.webpage.impl.WebImpl
		 * @see myproject.webpage.impl.WebpagePackageImpl#getWeb()
		 * @generated
		 */
		EClass WEB = eINSTANCE.getWeb();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB__NAME = eINSTANCE.getWeb_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB__TITLE = eINSTANCE.getWeb_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB__DESCRIPTION = eINSTANCE.getWeb_Description();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB__KEYWORDS = eINSTANCE.getWeb_Keywords();

		/**
		 * The meta object literal for the '<em><b>Webpages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB__WEBPAGES = eINSTANCE.getWeb_Webpages();

		/**
		 * The meta object literal for the '{@link myproject.webpage.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myproject.webpage.impl.CategoryImpl
		 * @see myproject.webpage.impl.WebpagePackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Articles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__ARTICLES = eINSTANCE.getCategory_Articles();

		/**
		 * The meta object literal for the '{@link myproject.webpage.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see myproject.webpage.impl.ArticleImpl
		 * @see myproject.webpage.impl.WebpagePackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__NAME = eINSTANCE.getArticle_Name();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__CREATED = eINSTANCE.getArticle_Created();

		/**
		 * The meta object literal for the '<em>Calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Calendar
		 * @see myproject.webpage.impl.WebpagePackageImpl#getCalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getCalendar();

	}

} //WebpagePackage
