package sn.com.douane.ejb.douane.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.douane.model.keys.VisitePiecesJointesKey;


@Entity
@IdClass(VisitePiecesJointesKey.class)
@Table(name="VISITEPIECESJOINTES")
public class VisitePiecesJointes  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;
	
	@Id
	@Column(name="VISANNEEENREGDEC", length=4, nullable=false)
	private java.lang.String visAnneeEnregDec;
	
	@Id
	@Column(name="VISBURENREGDEC", length=3, nullable=false)
    private java.lang.String visBurEnregDec;
	
	@Id
	@Column(name="VISNUMDECLARATION", nullable=false)
    private java.lang.Integer visNumDeclaration;
	
	@Id
	@Column(name="VISNUMARTDEC", nullable=false)
    private java.lang.Integer visNumArtDec;
	
	@Id
	@Column(name="VISCODEPIECEJT", length=3, nullable=false)
    private java.lang.String visCodePieceJt;
	
	
	@Column(name="VISDATECREATION")
    private java.sql.Date visDateCreation;


	public VisitePiecesJointes(String visAnneeEnregDec, String visBurEnregDec,
			Integer visNumDeclaration, Integer visNumArtDec,
			String visCodePieceJt) {
		super();
		this.visAnneeEnregDec = visAnneeEnregDec;
		this.visBurEnregDec = visBurEnregDec;
		this.visNumDeclaration = visNumDeclaration;
		this.visNumArtDec = visNumArtDec;
		this.visCodePieceJt = visCodePieceJt;
	}


	public VisitePiecesJointes() {
		super();
		// TODO Auto-generated constructor stub
	}


	public java.lang.String getVisAnneeEnregDec() {
		return visAnneeEnregDec;
	}


	public void setVisAnneeEnregDec(java.lang.String visAnneeEnregDec) {
		this.visAnneeEnregDec = visAnneeEnregDec;
	}


	public java.lang.String getVisBurEnregDec() {
		return visBurEnregDec;
	}


	public void setVisBurEnregDec(java.lang.String visBurEnregDec) {
		this.visBurEnregDec = visBurEnregDec;
	}


	public java.lang.Integer getVisNumDeclaration() {
		return visNumDeclaration;
	}


	public void setVisNumDeclaration(java.lang.Integer visNumDeclaration) {
		this.visNumDeclaration = visNumDeclaration;
	}


	public java.lang.Integer getVisNumArtDec() {
		return visNumArtDec;
	}


	public void setVisNumArtDec(java.lang.Integer visNumArtDec) {
		this.visNumArtDec = visNumArtDec;
	}


	public java.lang.String getVisCodePieceJt() {
		return visCodePieceJt;
	}


	public void setVisCodePieceJt(java.lang.String visCodePieceJt) {
		this.visCodePieceJt = visCodePieceJt;
	}


	public java.sql.Date getVisDateCreation() {
		return visDateCreation;
	}


	public void setVisDateCreation(java.sql.Date visDateCreation) {
		this.visDateCreation = visDateCreation;
	}
	
	

	
}
