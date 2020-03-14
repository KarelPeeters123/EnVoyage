package lu.EnVoyage;

import java.util.HashMap;
import java.util.Map;

public class LanguageDB {
	private Map<Language, TextDB> db;
	public LanguageDB() {
		db = new HashMap<>();
		TextDB nldb = new TextDB();
		TextDB frdb = new TextDB();
		TextDB endb = new TextDB();
		TextDB dedb = new TextDB();
		nldb.addText("home paragraph", "Is een ruzgzakreis niet echt jouw ding probeer dan zo vlug mogelijk deze compacte en super efficiënte camper voor je vakantie. Het is geschikt voor een luilekkere zomervakantie in het groen en in de zon of voor een weekje in de winter op de latten in de sneeuw. Deze campers zjn de meest complete op de markt en al jarenlang de meeste verhuurde ingericht bestelwagens in Europa. Uw ultieme campervakantie hoeft écht niet duur te zijn. “En Voyage“ zorgt voor een relaxte vakantie waar je alles binnen handbereik hebt. Ga binnen in een wereld van compacte klasse. Multifunctionaliteit, design, comfort en gebruiksgemak staan centraal bij deze succesvolle Vans. Ze zijn uitgeroepen tot de best gëisoleerde Van in zijn klasse.\n");
		frdb.addText("home paragraph", "Si voyager avec sac à dos n'est pas vraiment votre truc, essayez alors simplement ce campeur compact et super efficace pour vos vacances. Tant pour des vacances d'été paresseuses dans le vert et au soleil ou pour une semaine en hiver sur les skis dans la neige. Ces campeurs sont les plus complets du marché et depuis des années les plus louées en Europe. Vos vacances de campeur ultimes ne doivent pas être coûteuses. \"En Voyage\" assure des vacances détendues où vous avez tout à portée de main. Entrez dans un monde de classe compacte. La multifonctionnalité, le design, le confort et la facilité d'utilisation sont au cœur de ces succès. Ils ont été déclarés les meilleurs Van isolés dans sa classe.");
		endb.addText("home paragraph", "Tired of having to carry your heavy backpack? Try our compact and super-efficient camper for your travels.  Whether you prefer to sunbathe in southern europe or go skiing in the alps, this camper is right for you! This camper model is the most complete and above all, the most rented model across Europe. Your ultimate camper-holiday doesn’t have to be expensive at all. “En Voyage” provides you a relaxing and stress-free holiday where anything you could need is within your reach. Enter a world of compact class. Multifunctionality, design, comfort and ease of use are central to these successful campers. Additionally, this model has been proclaimed to be the most isolated in its class.");
		dedb.addText("home paragraph", "Ist ein ruzgzakreis nicht wirklich dein Ding, versuch dann so schnell wie möglich diesen kompakten und super effizienten Camper für deinen Urlaub. Sowohl für einen faulen Sommerurlaub im Grünen und in der Sonne als auch für eine Woche im Winter auf den Skiern im Schnee. Diese Wohnmobile sind die vollständigsten auf dem Markt und seit Jahren die am meisten gemieteten Lieferwagen in Europa. Ihr ultimativer Camper-Urlaub muss nicht teuer sein. \"En Voyage\" sorgt für einen entspannten Urlaub, in dem Sie alles in Reichweite haben. Betreten Sie eine Welt der Kompaktklasse. Multifunktionalität, Design, Komfort und Benutzerfreundlichkeit stehen im Mittelpunkt dieser erfolgreichen Vans. Sie wurden zum besten isolierten Van in seiner Klasse erklärt.");
		addLanguage(Language.NL, nldb);
		addLanguage(Language.FR, frdb);
		addLanguage(Language.EN, endb);
		addLanguage(Language.DE, dedb);
	}
	public void addLanguage(Language language, TextDB textDB) {
		db.put(language, textDB);
	}
	public TextDB getTextDB(Language language) {
		return db.get(language);
	}
}
