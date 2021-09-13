package maths;

public class Vecteur {
	private Point pDepart;
	private Point pFinal;
	private double u1;
	private double u2;
	private double theta;
	
	public Vecteur() {
		pDepart = new Point(0,0);
		pFinal = new Point(pDepart);
		
	}
	public Vecteur(Point p, Point p0) {
		pDepart = new Point(p);
		pFinal = new Point(p0);
		u1=
	}
	
	public Vecteur(Point p) {
		pDepart = new Point(0,0);
		pFinal = new Point(p);
	}
	public Point getpDepart() {
		return pDepart;
	}
	public void setpDepart(Point pDepart) {
		this.pDepart = pDepart;
	}
	public Point getpFinal() {
		return pFinal;
	}
	public void setpFinal(Point pFinal) {
		this.pFinal = pFinal;
	}
	
	public double taille() {
		double t = pDepart.distance(pFinal);
		return t;
	}
	
	
	public double normeVecteur() {// calcul norme d'un vecteur
        return Math.abs(pDepart.distance(pFinal));
    }

    public double scalaireVecteur(Vecteur V) {//calcul produit scalaire entre ce vecteur et un vecteur v
        return this.u1*V.u1+this.u2*V.u2;
    }

    public double angleDeuxVecteurs(Vecteur V) {//calcul d'angle entre ce vecteur et un vecteur v
        return Math.acos(this.scalaireVecteur(V)/(this.normeVecteur()*V.normeVecteur()));
    }

}
