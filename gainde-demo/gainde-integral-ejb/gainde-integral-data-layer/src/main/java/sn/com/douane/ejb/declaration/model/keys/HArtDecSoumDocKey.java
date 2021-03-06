/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class HArtDecSoumDocKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4898100469471609746L;
	@Column(name="DECDATEARCHIVE", nullable = false)
    private java.sql.Timestamp decDateArchive;
	@Column(name="DECANNEEENREGDEC", length= 4, nullable = false)
    private java.lang.String decAnneeEnregDec;
	@Column(name="DECBURENREGDEC", length= 3, nullable = false)
    private java.lang.String decBurEnregDec;
    @Column(name="DECNUMDECLARATION", nullable = false)
    private java.lang.Integer decNumDeclaration;
    @Column(name="DECNUMARTDEC", nullable = false)
    private java.lang.Integer decNumArtDecl;
    @Column(name="DECCODESOUMDOC", length= 2, nullable = false)
    private java.lang.String decCodeSoumDoc;
	/**
	 * 
	 */
	public HArtDecSoumDocKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decDateArchive
	 * @param decAnneeEnregDec
	 * @param decBurEnregDec
	 * @param decNumDeclaration
	 * @param decNumArtDecl
	 * @param decCodeSoumDoc
	 */
	public HArtDecSoumDocKey(Timestamp decDateArchive, String decAnneeEnregDec,
			String decBurEnregDec, Integer decNumDeclaration,
			Integer decNumArtDecl, String decCodeSoumDoc) {
		super();
		this.decDateArchive = decDateArchive;
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDecl;
		this.decCodeSoumDoc = decCodeSoumDoc;
	}
	/**
	 * @return the decDateArchive
	 */
	public java.sql.Timestamp getDecDateArchive() {
		return decDateArchive;
	}
	/**
	 * @param decDateArchive the decDateArchive to set
	 */
	public void setDecDateArchive(java.sql.Timestamp decDateArchive) {
		this.decDateArchive = decDateArchive;
	}
	/**
	 * @return the decAnneeEnregDec
	 */
	public java.lang.String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}
	/**
	 * @param decAnneeEnregDec the decAnneeEnregDec to set
	 */
	public void setDecAnneeEnregDec(java.lang.String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}
	/**
	 * @return the decBurEnregDec
	 */
	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}
	/**
	 * @param decBurEnregDec the decBurEnregDec to set
	 */
	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}
	/**
	 * @return the decNumDeclaration
	 */
	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}
	/**
	 * @param decNumDeclaration the decNumDeclaration to set
	 */
	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}
	/**
	 * @return the decNumArtDecl
	 */
	public java.lang.Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}
	/**
	 * @param decNumArtDecl the decNumArtDecl to set
	 */
	public void setDecNumArtDecl(java.lang.Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}
	/**
	 * @return the decCodeSoumDoc
	 */
	public java.lang.String getDecCodeSoumDoc() {
		return decCodeSoumDoc;
	}
	/**
	 * @param decCodeSoumDoc the decCodeSoumDoc to set
	 */
	public void setDecCodeSoumDoc(java.lang.String decCodeSoumDoc) {
		this.decCodeSoumDoc = decCodeSoumDoc;
	}
    
    

}
