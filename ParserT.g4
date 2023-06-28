grammar ParserT;
import LexerT;

program: BEGIN CADENA ruta END;

ruta : (accion | ciclo | condicional | lectura | impresion | varDeclaracion)* ;

accion: operacion | funcion;
operacion : (suma | resta | mult | div) ;
funcion: (sen | cos | raiz);
ciclo: doMientras | mientras;

varDeclaracion: VARNAME IGUAL (VARNAME | INT | FLOAT);

suma: 'desde' VARNAME 'viajar a' VARNAME;
resta: 'desde' VARNAME 'volver a' VARNAME;
mult: 'en' VARNAME 'comer en' INT 'lugares';
div: 'la ruta hacia' VARNAME 'se divide en' INT 'caminos';

doMientras: 'siga recorriendo' (VARNAME | ciclo | condicional) 'cuando' logica;
mientras: 'mientras' logica 'siga recorriendo' (VARNAME | ciclo | condicional);

condicional: 'si' logica 'entonces puede seguir recorriendo' (VARNAME | ciclo | condicional);

logica: 'en' VARNAME 'el clima' multiCondicion VARNAME;

multiCondicion: condicion ((AND | OR) condicion)*;
condicion: (mejor | peor | igual | noigual);

mejor: 'sea ' MAYOR 'que en';
peor: 'sea ' MENOR 'que en';
igual: 'sea ' IGUAL 'que en';
noigual: 'sea ' NOIGUAL 'que en';

lectura: INPUT VARNAME;
impresion: OUTPUT VARNAME;

sen: SENO 'en' VARNAME;
cos: COSENO VARNAME;
raiz: 'conozca el pais' VARNAME; 





