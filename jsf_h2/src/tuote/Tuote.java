package tuote;

import javax.validation.constraints.*;
import javax.faces.bean.*; 
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped

public class Tuote{

    @Size(min=1, max=40)
    private String nimi;
    @Size(min=1, max=20)
    private String koodi;
    @Min(0)
    @Max(5000)
    private double hinta;
    
	public Tuote(String nimi, String koodi, double hinta) {
		super();
		this.nimi = nimi;
		this.koodi = koodi;
		this.hinta = hinta;
	}
	

	@Override
	public String toString() {
		return    koodi + nimi + hinta + "\n";
				  
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getKoodi() {
		return koodi;
	}

	public void setKoodi(String koodi) {
		this.koodi = koodi;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	
}
