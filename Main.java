import electric.*;
import fire.*;
import ground.*;
import flying.*;

public class Main{

	public static void main(String...args){

		Pikachu p = new Pikachu();

		p.getName();
                
		Raichu R= new Raichu();
		
		R.getName();
		R.printName();
		p.printName();

		Magnemite M= new Magnemite();
		M.printName();
		Magneton G= new Magneton();
		G.printName();
		Voltorb v= new Voltorb();
		v.printName();
		Electrode e= new Electrode();
		e.printName();
		System.out.println("My Fire Pokemon");
		Charmander c= new Charmander();
		c.printName();
                Charmander ca=new Charmander();
		ca.printName();
		Vulpix va= new Vulpix();
		va.printName();
		Ninetales n= new Ninetales();
		n.printName();
		Ponyta Ps= new Ponyta();
		Ps.printName();
		Entei ei= new Entei();
		ei.printName();
		Rapidash rd=new Rapidash();
		rd.printName();
		Moltres ms=new Moltres();
		ms.printName();
		Moltres msa=new Moltres();
		msa.printName();
		System.out.println("My Flying Pokemons");
		Articuno ac= new Articuno();
		ac.printName();
		Dragonite dr=new Dragonite();
		dr.printName();
		Emolga eg=new Emolga();
		eg.printName();
		Gligar gl=new Gligar();
		gl.printName();
		Landorusa la=new Landorusa();
		la.printName();
		Pidgeot pi=new Pidgeot();
		pi.printName();
		Salamence sa=new Salamence();
		sa.printName();
		Talonflame tl=new Talonflame();
		tl.printName();
		Zapdos za=new Zapdos();
		za.printName();
		System.out.println("My Ground Pokemons");
		Diglett dl= new Diglett();
		dl.printName();
		Dugtrio dlg=new Dugtrio();
		dlg.printName();
		Flygon fl=new Flygon();
		fl.printName();
		Garchomp gc=new Garchomp();
		gc.printName();
		Landorus ld=new Landorus();
		ld.printName();
		Onix o=new Onix();
		o.printName();
		Rhyperior rh=new Rhyperior();
		rh.printName();
		Sandaconda sav=new Sandaconda();
		sav.printName();
		Sandslash sl=new Sandslash();
		sl.printName();
		Swampert sw=new Swampert();
		sw.printName();
		System.out.println("few observation Pokemon can be both flying/electic so it was giving error as names are ambigus in packages so we need to change the name , as class name needs to be unique");
		System.out.println("During earlier compilation it created class files and compiler was checking old file as well , we need to delete old class file in order to mitigate error ");
		System.out.println("Reference variable needs to be unique while calling method");
		





	}
	
}
