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
		endb.addText("home paragraph", "Tired of having to carry your heavy backpack? Try our compact and super-efficient camper for your travels.  Whether you prefer to sunbathe in southern europe or go skiing in the alps, this camper is right for you! This camper model is the most complete and above all, the most rented model across Europe. Your ultimate camper-holiday doesn’t have to be expensive at all. “En Voyage” provides you a relaxing and stress-free holiday where anything you could need is within your reach. Enter a world of compact class. Multifunctionality, design, comfort and ease of use are central to these successful campers. Additionally, this model has been proclaimed to be the most isolated in its class.");
		frdb.addText("home paragraph", "Si voyager avec sac à dos n'est pas vraiment votre truc, essayez alors simplement ce campeur compact et super efficace pour vos vacances. Tant pour des vacances d'été paresseuses dans le vert et au soleil ou pour une semaine en hiver sur les skis dans la neige. Ces campeurs sont les plus complets du marché et depuis des années les plus louées en Europe. Vos vacances de campeur ultimes ne doivent pas être coûteuses. \"En Voyage\" assure des vacances détendues où vous avez tout à portée de main. Entrez dans un monde de classe compacte. La multifonctionnalité, le design, le confort et la facilité d'utilisation sont au cœur de ces succès. Ils ont été déclarés les meilleurs Van isolés dans sa classe.");
		dedb.addText("home paragraph", "Ist ein ruzgzakreis nicht wirklich dein Ding, versuch dann so schnell wie möglich diesen kompakten und super effizienten Camper für deinen Urlaub. Sowohl für einen faulen Sommerurlaub im Grünen und in der Sonne als auch für eine Woche im Winter auf den Skiern im Schnee. Diese Wohnmobile sind die vollständigsten auf dem Markt und seit Jahren die am meisten gemieteten Lieferwagen in Europa. Ihr ultimativer Camper-Urlaub muss nicht teuer sein. \"En Voyage\" sorgt für einen entspannten Urlaub, in dem Sie alles in Reichweite haben. Betreten Sie eine Welt der Kompaktklasse. Multifunktionalität, Design, Komfort und Benutzerfreundlichkeit stehen im Mittelpunkt dieser erfolgreichen Vans. Sie wurden zum besten isolierten Van in seiner Klasse erklärt.");

		nldb.addText("info title", "De voordelen van deze Camper - reis");
		endb.addText("info title", "The advantages of travelling with our campers");
		frdb.addText("info title", "Les avantages de voyager avec nos campers");
		dedb.addText("info title", "Die Vorteile dieser Camper-Reise");

		nldb.addText("info sub1", "Zorgeloze reis");
		endb.addText("info sub1", "Carefree journey");
		frdb.addText("info sub1", "Voyage insouciant");
		dedb.addText("info sub1", "Sorglose Reise");

		nldb.addText("info paragraph1", "Een ongeluk is vlug gebeurd!. Geen zorgen: de camper is goed verzekerd. Dit betekent dat jullie verzekerd zijn tegen schade en ongevallen. Het huren bij een goedgekeurde verhuurder is persoonlijk en vertrouwd. Bij het huren van deze camper heb je direct contact met de camper eigenaar. De eigenaar kent de camper door en door en heeft veel reis ervaring met campers Misschien kan hij of zij leuke tips geven van mooie bestemmingen en trips! ");
		endb.addText("info paragraph1", "Accidents happen. However, do not worry: Our campers are well-insured. Renting with an approved owner is a more personal and trustworthy experience. By renting our campers you will be directly in contact with the camper-owner. The owner knows the camper through and through and have loads of experience with campers. He/she may even give you a handful of fun tips about exciting destinations and trips!");
		frdb.addText("info paragraph1", "Un accident s'est produit rapidement!. Pas de soucis: le camping-car est bien assuré. Cela signifie que vous êtes assuré contre les dommages et les accidents. La location auprès d'un propriétaire agréé est personnelle et de confiance. Lors de la location de ce camping-car, vous avez un contact direct avec le propriétaire du camping-car. Le propriétaire connaît le campeur de bout en bout et a beaucoup d'expérience de voyage avec les campeurs, peut-être qu'il peut donner de bons conseils sur les belles destinations et les voyages!");
		dedb.addText("info paragraph1", "Ein Unfall ist schnell passiert! Keine Sorge: Der Camper ist gut versichert. Dies bedeutet, dass Sie gegen Schäden und Unfälle versichert sind. Das Mieten bei einem zugelassenen Vermieter ist persönlich und vertrauenswürdig. Wenn Sie diesen Camper mieten, haben Sie direkten Kontakt mit dem Camper-Besitzer. Der Besitzer kennt den Camper durch und durch und hat viel Reiseerfahrung mit Campern. Vielleicht kann er oder sie nette Tipps zu schönen Zielen und Ausflügen geben!");

		nldb.addText("info sub2", "Wie is En Voyage");
		endb.addText("info sub2", "Who is En Voyage");
		frdb.addText("info sub2", "Qui est en voyage");
		dedb.addText("info sub2", "Wer ist En Voyage?");

		nldb.addText("info paragraph2", "En Voyage heeft als doel mensen in heel Europa het plezier van kamperen met een camper te laten ervaren. Dit doen we door betrouwbare en inspirerende service te bieden waarmee huurders hun camper kunnen huren. De camper die u kunt huren is nieuw en vooral bedoeld om met 2 personen een leuke reis te maken die je al rijden en al slapend kan beleven. Nooit op zoek naar een hotel! geen tijdverlies met inchecken en koffers uitladen en weer terug inladen! De camper heeft een volledige uitgebreide uitrusting en inventaris en prachtig kleurendesign. Hij is voorzien van alle mogelijke comfort! Wat dacht u van een groot luifel, een heerlijke groot 2-persoons bed, een fietsendrager, slimme bergruimte, een aparte douche en wc. Alles voor uw ultieme vakantiegevoel en niet duur!");
		endb.addText("info paragraph2", "En Voyage aims to give people all over Europe the pleasure of camping with a camper. We do this by providing reliable and inspiring service that allows renters to rent their motor home. The motorhome that you can rent is new and mainly intended to make a nice trip with 2 people that you can already drive and experience while sleeping. Never looking for a hotel!  no time wasted checking in and unloading suitcases and reloading! The camper has a complete extensive equipment and inventory and beautiful color design. It is equipped with every possible comfort.! How about a large awning, a lovely large double bed, a bicycle carrier, smart storage space, a separate shower and toilet. Everything for your ultimate holiday feeling ... and inexpensive!");
		frdb.addText("info paragraph2", "En Voyage a pour objectif de faire vivre le plaisir du camping en camping-car à travers l'Europe. Nous le faisons en fournissant un service fiable et inspirant qui permet aux locataires de louer leur camping-car. Le camping-car que vous pouvez louer est neuf et principalement destiné à faire un beau voyage avec 2 personnes que vous pouvez déjà conduire et découvrir en dormant. Jamais à la recherche d'un hôtel! Pas de perte de temps pour l'enregistrement et le déchargement des valises et le rechargement! Le camping-car dispose d'un équipement complet et d'un inventaire complet et d'un beau design de couleur. Il est équipé de tout le confort possible! Que diriez-vous d'un grand auvent, d'un joli grand lit double, d'un porte-vélos, d'un espace de rangement intelligent, d'une douche et de toilettes séparées. Tout pour votre ultime sensation de vacances ... et pas cher!");
		dedb.addText("info paragraph2", "En Voyage möchte Menschen in ganz Europa das Vergnügen bereiten, mit einem Wohnmobil zu campen. Dazu bieten wir einen zuverlässigen und inspirierenden Service, mit dem Mieter ihr Wohnmobil mieten können. Das Wohnmobil, das Sie mieten können, ist neu und hauptsächlich für eine schöne Reise mit 2 Personen gedacht, die Sie bereits im Schlaf fahren und erleben können. Nie auf der Suche nach einem Hotel!  keine Zeit damit verschwendet, einzuchecken, Koffer zu entladen und nachzuladen! Der Camper verfügt über eine komplette Ausstattung und ein Inventar sowie ein wunderschönes Farbdesign. Es ist mit allem Komfort ausgestattet! Wie wäre es mit einer großen Markise, einem schönen großen Doppelbett, einem Fahrradträger, einem intelligenten Stauraum, einer separaten Dusche und Toilette. Alles für Ihr ultimatives Urlaubsgefühl ... und günstig!");

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
