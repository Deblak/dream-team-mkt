DELETE FROM t_dream_team_identities ;
DELETE FROM t_offers ;

INSERT INTO t_dream_team_identities (picture_fr, picture_en ,slogan_fr,slogan_en, panel_1_desc_fr, panel_1_desc_en,panel_2_desc_fr, panel_2_desc_en) VALUES
('https://images.unsplash.com/photo-1611517976630-163467322778?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D',
'https://images.unsplash.com/photo-1611517976630-163467322778?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D',
'Une carrière de rêve pour vos développeurs !',
'A dream career for your developers!',
'1 Lorem ipsum dolor français',
'1 Lorem ipsum dolor english',
'2 Lorem ipsum dolor français',
'2 Lorem ipsum dolor english'
);

INSERT INTO t_offers (name_fr,name_en,price_fr,price_en,plan_fr,plan_en,call_to_action_fr,call_to_action_en,detail_plan_fr,detail_plan_en) VALUES
('Petit','Small','19,99 €/mois','19,99 €/month','1 to 99 développeurs,20 projets,profile basique,recherche basique','1 to 99 developers,20 projects,basic profile,classic search','','','lorem ipsum, lorem ipsum,fr','lorem ipsum, lorem ipsum,en'),
('Moyen','Medium','49,99 €/mois','49,99 €/month','100 to 499 développeurs,50 projets,profile avancer,recherche avancer','100 to 499 developers,50 projects,advanced profile,advanced search','','','lorem ipsum, lorem ipsum,lorem ipsum,fr','lorem ipsum, lorem ipsum,lorem ipsum,en'),
('Grand','Large','79,99 €/mois','79,99 €/month','499 to 1000 développeurs,100 projets,profile avancer,recherche avancer,dev2project super matching',
'499 to 1000 developers,100 projects,advanced profile,advanced search,dev2project super matching','Le panneau de tarification devrait indiquer "Entreprise avec 1000 développeurs ou plus, veuillez nous contacter ! " avec un lien vers le formulaire de contact de la page d''acceuil',
'The pricing panel should indicate "Companies with 1000 developers or more, please contact-us!" with a link to the home page contact form','lorem ipsum, lorem ipsum,lorem ipsum,lorem ipsum, lorem ipsum,fr','lorem ipsum, lorem ipsum,lorem ipsum,lorem ipsum, lorem ipsum,fr');

SELECT * FROM t_offers to2;
SELECT * FROM t_dream_team_identities tdti;


INSERT INTO t_terms (terms) values
('Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. 
Cras elementum ultrices diam. Maecenas ligula massa, varius a, semper congue, euismod non, mi. Proin porttitor, orci nec nonummy molestie, enim est eleifend mi, non fermentum diam nisl sit amet erat.')