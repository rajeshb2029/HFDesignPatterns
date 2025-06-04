%% Expected behavior
boiler1 = ChocolateBoiler();

% fill conents
boiler1.fill();

% boil contents
boiler1.boil();

% drain contents
boiler1.drain();

%% Behavior with 2 boiler instances
boiler1 = ChocolateBoiler();
boiler2 = ChocolateBoiler();

% fill conents
boiler1.fill();
boiler2.fill();  % over filling

% boil contents
boiler1.boil();
boiler2.boil(); % already boiled

% drain contents
boiler2.drain(); % draining before boiling completed
boiler1.drain();

