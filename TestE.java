package ht.bac3;
import java.util.*;
import java.util.Scanner;

public class TestE {

	public static void main(String[] args) {
		

		ArrayList<Etudiant> Enregistrement = new ArrayList<Etudiant>();
		Enregistrement.add(new Etudiant(2021022270, "KALONGA TSHINYAMA JUNIOR", "BAC 3 IG", 15, "CELIBATAIRE"));
		Enregistrement.add(new Etudiant(2021022269, "KALONGA KIFWA JOSUE", "BAC 3 IG", 17, "CELIBATAIRE"));
		Enregistrement.add(new Etudiant(2020022017, "CIOWA ILUNGA JEAN", "BAC 3 IG", 20, "CELIBATAIRE"));
		Enregistrement.add(new Etudiant(2021024444, "KALONGA NDAYE FRANCIS", "BAC 1 PRE", 21, "FIANCEE"));
		Enregistrement.add(new Etudiant(2022098776, "BAYONGO NKAKA EMILIA", "BAC 3 EC", 30, "FIANCEE"));
		Enregistrement.add(new Etudiant(2019022278, "MAKAMBO KALUNGA JEANNETTE", "BAC 2 IG", 12, "DIVORCEE"));
		Enregistrement.add(new Etudiant(2019022209, "ONANA ANDE PIERRE", "BAC 2 IG", 40, "MARIE"));
		Enregistrement.add(new Etudiant(2019022245, "DAN SHONGO BUZZ", "BAC 2 IG", 52, "MARIE"));
		Enregistrement.add(new Etudiant(2019022232, "KASINDO MUKEMBANYI JONATHAN", "BAC 2 IG", 20, "CELIBATAIRE"));
		Enregistrement.add(new Etudiant(2019022223, "MULAMBA KATUBA SEPHORA", "BAC 2 IG", 11, "MARIEE"));
		Enregistrement.add(new Etudiant(2019022221, "KALUNGA THISWAKA ESTHER", "BAC 1 IG", 21, "VEUF"));
		Enregistrement.add(new Etudiant(2019022213, "KALUNGA KALUNGA ELIEZER", "BAC 1 IG", 11, "CELIBATAIRE"));
		Enregistrement.add(new Etudiant(2019022275, "TSHIBAMBA WA TSHIBAMBA CELESTION", "BAC 1 IG", 30, "DIVORCE"));
		Enregistrement.add(new Etudiant(2019022230, "SHINGO KIBALE PAPY", "BAC 1 IG", 19, "DIVORCEE"));
		Enregistrement.add(new Etudiant(2019022240, "MUGONO KALUMBILA OLIVIER", "BAC 1 IG", 23, "MARIE"));
		Enregistrement.add(new Etudiant(2019022208, "VIOLETTA MUKEINA LYDIA", "MASTER 1", 32, "CELIBATAIRE"));
		Enregistrement.add(new Etudiant(2019022270, "BIHINGA BIHINGA HELBY", "MASTER 1", 50, "VEUF"));
		Enregistrement.add(new Etudiant(2019022276, "BAYONGO MOLANGO PRINCILIA", "MASTER 1", 19, "MARIE"));
		Enregistrement.add(new Etudiant(2019022234, "MONGA SHINGO NAOMIE", "MASTER 1", 78, "VEUVE"));
		Enregistrement.add(new Etudiant(2019022200, "TSHIMBALANGA REBECCA", "MASTER 1", 25, "FIANCEE"));
		Enregistrement.add(new Etudiant(2019022270, "KIBWANA IBRAHIM JULES", "BAC 1 ECONOMIE", 7, "VEUVE"));
		Enregistrement.add(new Etudiant(2019022234, "NUMBI WA KYUNGU ENOCK", "BAC 1 THEOLOGIE", 54, "DIVORCE"));
		Enregistrement.add(new Etudiant(2019022212, "SHABANI YUMA ENOCK", "BAC 1 POLYTHECHNIQUE", 4, "EN COUPLE"));
		Enregistrement.add(new Etudiant(2019022279, "CAPITAINE NGOY CHARLOTTE", "BAC 1 DROIT", 26, "CELIBATAIRE"));
		Enregistrement.add(new Etudiant(2019022212, "KAYUMBA LAURE", "BAC 2 DROIT", 78, "MARIE"));
		Enregistrement.add(new Etudiant(2019022209, "ILUNGA NGANDU MIKE", "BAC 3 RT", 20, "CELIBATAIRE"));
		Enregistrement.add(new Etudiant(2019022212, "CONSTANTIN TSHISWAKA BERTIN", "BAC 1 IG", 20, "CELIBATAIRE"));
		Enregistrement.add(new Etudiant(2019022217, "MUZAZ TSHIHIRIK ELIE", "BAC 1 IG", 43, "MARIE"));
		Enregistrement.add(new Etudiant(2019022209, "ZOE CISKA JAMES", "BAC 3 ECONOMIE", 12, "DIVORCE"));
		Enregistrement.add(new Etudiant(2019022213, "KABUYA TSHAMATA OTHINIEL ", "BAC 3 RT", 9, "VEUVE"));
		Enregistrement.add(new Etudiant(2019022206, "KABEYA KANKOLONGO LEWI ", "BAC 3 RT", 20, "CELIBATAIRE"));
		Enregistrement.add(new Etudiant(2019022221, "KALUNGA THISWAKA ESTHER", "BAC 1 IG", 21, "VEUF"));
		Enregistrement.add(new Etudiant(2019022213, "KALUNGA KALUNGA ELIEZER", "BAC 1 IG", 11, "CELIBATAIRE"));
		Enregistrement.add(new Etudiant(2019022275, "TSHIBAMBA WA TSHIBAMBA CELESTION", "BAC 1 IG", 30, "DIVORCE"));
		Enregistrement.add(new Etudiant(2019022230, "SHINGO KIBALE PAPY", "BAC 1 IG", 19, "DIVORCEE"));
		Enregistrement.add(new Etudiant(2019022240, "MUGONO KALUMBILA OLIVIER", "BAC 1 IG", 23, "MARIE"));
		Enregistrement.add(new Etudiant(2019022208, "VIOLETTA MUKEINA LYDIA", "MASTER 1", 32, "CELIBATAIRE"));
		Enregistrement.add(new Etudiant(2019022270, "BIHINGA BIHINGA HELBY", "MASTER 1", 50, "VEUF"));
		Enregistrement.add(new Etudiant(2019022276, "BAYONGO MOLANGO PRINCILIA", "MASTER 1", 19, "MARIE"));
		Enregistrement.add(new Etudiant(2019022234, "MONGA SHINGO NAOMIE", "MASTER 1", 78, "VEUVE"));
		Enregistrement.add(new Etudiant(2019022200, "TSHIMBALANGA REBECCA", "MASTER 1", 25, "FIANCEE"));
		
		Scanner lect = new Scanner(System.in);
		System.out.println("QUELLE CATEGORIE ?");
		String rech = lect.nextLine();
		for(Etudiant a : Enregistrement) {
			if(a.getEtatCivil().equals(rech))
				System.out.println(a);
			{
				
	}
	}
	}
}
