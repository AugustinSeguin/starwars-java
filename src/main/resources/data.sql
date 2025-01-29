
INSERT INTO starship(name,category,crew,passengers) VALUES 
	('Millennium Falcon','FIGHTER',4,6),
	('CR90 corvette','OTHER',30,600),
	('Star Destroyer','DESTROYER',47060,-1),
	('Sentinel-class landing craft','OTHER',5,75),
	('Death Star','STATION',342953,843342),
	('Y-wing','FIGHTER',2,0),
	('X-wing','FIGHTER',1,0),
	('TIE Advanced x1','FIGHTER',1,0),
	('Executor','DREADNOUGHT',279144,38000),
	('Rebel transport','OTHER',6,90),
	('Slave 1','OTHER',1,6),
	('Imperial shuttle','OTHER',6,20),
	('EF76 Nebulon-B escort frigate','OTHER',854,75),
	('Calamari Cruiser','OTHER',5400,1200),
	('A-wing','FIGHTER',1,0),
	('B-wing','FIGHTER',1,0),
	('Republic Cruiser','OTHER',9,16),
	('Droid control ship','OTHER',175,139000),
	('Naboo fighter','FIGHTER',1,0),
	('Naboo Royal Starship','OTHER',8,-1),
	('Scimitar','OTHER',1,6),
	('J-type diplomatic barge','OTHER',5,10),
	('AA-9 Coruscant freighter','FIGHTER',-1,30000),
	('Jedi starfighter','FIGHTER',1,0),
	('H-type Nubian yacht','OTHER',4,-1),
	('Republic Assault ship','FIGHTER',700,16000),
	('Solar Sailer','OTHER',3,11),
	('Trade Federation cruiser','OTHER',600,48247),
	('Theta-class T-2c shuttle','OTHER',5,16),
	('Republic attack cruiser','DESTROYER',7400,2000),
	('Naboo star skiff','OTHER',3,3),
	('Jedi Interceptor','FIGHTER',1,0),
	('arc-170','FIGHTER',3,0),
	('Banking clan frigte','OTHER',200,-1),
	('Belbullab-22 starfighter','FIGHTER',1,0),
	('V-wing','FIGHTER',1,0);

INSERT INTO species(name,classification,sentient) VALUES 
	('Human','MAMMAL',1),
	('Droid','ARTIFICIAL',1),
	('Wookie','MAMMAL',1),
	('Ewok','MAMMAL',1);

INSERT INTO pilot(name,gender,species_id,starship_id) VALUES 
	('Han Solo','MALE',1,1),
	('Luke Skywalker','MALE',1,NULL),
	('Anakin Skywalker','MALE',1,NULL),
	('C-3PO','OTHER',2,NULL),
	('R2-D2','OTHER',2,NULL),
	('Chewbacca','MALE',3,1);
